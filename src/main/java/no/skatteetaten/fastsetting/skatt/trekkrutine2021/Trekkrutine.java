package no.skatteetaten.fastsetting.skatt.trekkrutine2021;

import java.util.LinkedHashMap;

public class Trekkrutine {

    public static long beregnTabelltrekk(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {
        long avrundetTrekkgrunnlag = finnAvrundetTrekkgrunnlag(periode, trekkgrunnlag);

        long overskytendeTrekk = Skatteberegning.beregnOverskytendeTrekk(tabellnummer, periode, avrundetTrekkgrunnlag);

        if (overskytendeTrekk > 0)
            avrundetTrekkgrunnlag = periode.maxTrekkgrunnlag;

        long personInntektAar = Math.round(avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer));

        double alminneligInntektAar = finnAlminneligInntektAar(tabellnummer, personInntektAar);

        long sumSkatt = beregnSkatt(tabellnummer, personInntektAar, alminneligInntektAar);

        long trekk = beregnTrekk(tabellnummer, periode, sumSkatt) + overskytendeTrekk;

        if (trekk > trekkgrunnlag && overskytendeTrekk == 0)
            trekk = trekkgrunnlag;

        return trekk;
    }

    public static HeleTabellen beregnHeleTabellen(Tabellnummer tabellnummer, Periode periode) {

        LinkedHashMap<Long, Long> alleTrekk = new LinkedHashMap<>();

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

        return new HeleTabellen(alleTrekk, tabellnummer.overskytendeProsent);
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
                + Skatteberegning.beregnTrinnskatt(tabellnummer, personInntektAar)
                + Skatteberegning.beregnTrygdeavgift(tabellnummer, personInntektAar);

    }

    private static long beregnTrekk(Tabellnummer tabellnummer, Periode periode, double sumSkatt) {
        double trekkMedDesimaler = sumSkatt / periode.getTrekkPeriode(tabellnummer);

        return tabellnummer.tabelltype == Tabelltype.SJØ ?
                (long) Math.floor(trekkMedDesimaler) :
                Math.round(trekkMedDesimaler);
    }

}
