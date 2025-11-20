package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2026;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;

public class Trekkrutine {

    public static long beregnTabelltrekk(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {
        long avrundetTrekkgrunnlag = finnAvrundetTrekkgrunnlag(periode, trekkgrunnlag);

        long personInntektAar = Math.round(avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer));

        double alminneligInntektAar = finnAlminneligInntektAar(tabellnummer, personInntektAar);

        long sumSkatt = beregnSkatt(tabellnummer, personInntektAar, alminneligInntektAar);

        long trekk = beregnTrekk(tabellnummer, periode, sumSkatt);

        if (trekk > trekkgrunnlag)
            trekk = trekkgrunnlag;

        return trekk;
    }

    public static HeleTabellen beregnHeleTabellen(Tabellnummer tabellnummer, Periode periode) {
        Map<Long, Long> alleTrekk = new LinkedHashMap<>();

        for (long grunnlag = 0; grunnlag <= periode.maxTrekkgrunnlag; grunnlag += periode.avrunding) {
            long trekk = beregnTabelltrekk(tabellnummer, periode, grunnlag);
            if (trekk > 0) {
                if (alleTrekk.isEmpty()) {
                    if ((grunnlag - periode.avrunding) > 0) {
                        alleTrekk.put(grunnlag - periode.avrunding, 0L);
                    }
                }
                alleTrekk.put(grunnlag, trekk);
            }
        }
        return new HeleTabellen(alleTrekk, finnOverskytendeProsentForTabell(tabellnummer));
    }

    public static BigDecimal finnOverskytendeProsentForTabell(Tabellnummer tabellnummer) {
        long trekkLav = Trekkrutine.beregnTabelltrekk(tabellnummer, Periode.PERIODE_1_MAANED,  300000);
        long trekkHoy = Trekkrutine.beregnTabelltrekk(tabellnummer, Periode.PERIODE_1_MAANED, 1300000);
        return  BigDecimal.valueOf(((double)trekkHoy - (double)trekkLav) / 10000).setScale(3, RoundingMode.HALF_UP);
    }

    private static long finnAvrundetTrekkgrunnlag(Periode periode, long trekkgrunnlag) {
        int avrunding = periode.avrunding;
        return (trekkgrunnlag / avrunding * avrunding) + (avrunding / 2);
    }

    /*
    Finner netto årsinntekt (alminneligInntekt)
    */
    private static long finnAlminneligInntektAar(Tabellnummer tabellnummer, long personInntektAar) {
        return personInntektAar
                - Fradrag.beregnMinsteFradrag(tabellnummer, personInntektAar)
                - tabellnummer.tabellFradrag
                - Fradrag.beregnStandardFradrag(tabellnummer, personInntektAar)
                - Fradrag.beregnSjoFradrag(tabellnummer, personInntektAar)
                - tabellnummer.klasseFradrag;
    }

    private static long beregnSkatt(Tabellnummer tabellnummer, double personInntektAar, double alminneligInntektAar) {
        return Skatteberegning.beregnKommuneskatt(alminneligInntektAar)
                + Skatteberegning.beregnFelleseskatt(tabellnummer, alminneligInntektAar)
                + Skatteberegning.beregnTrinnskatt(personInntektAar)
                + Skatteberegning.beregnTrygdeavgift(tabellnummer, personInntektAar);
    }

    private static long beregnTrekk(Tabellnummer tabellnummer, Periode periode, double sumSkatt) {
        double trekkMedDesimaler = sumSkatt / periode.getTrekkPeriode(tabellnummer);

        return tabellnummer.tabelltype == Tabelltype.SJØ ?
                (long) Math.floor(trekkMedDesimaler) :
                Math.round(trekkMedDesimaler);
    }

}
