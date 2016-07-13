package ske.fastsetting.skatt.trekktabell;

public class Trekkrutine {

    public static long beregnTabelltrekk(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {
        long overskytendeTrekk = Skatteberegning.beregnOverskytendeTrekk(tabellnummer, periode, trekkgrunnlag);

        if (overskytendeTrekk > 0)
            trekkgrunnlag = periode.maxTrekkgrunnlag;

        long avrundetTrekkgrunnlag = finnAvrundetTrekkgrunnlag(periode, trekkgrunnlag);

        long personInntektAar = Math.round(avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer));

        double alminneligInntektAar = finnAlminneligInntektAar(tabellnummer, personInntektAar);

        long sumSkatt = beregnSkatt(tabellnummer, personInntektAar, alminneligInntektAar);

        long trekk = beregnTrekk(tabellnummer, periode, sumSkatt) + overskytendeTrekk;

        if (trekk > trekkgrunnlag && overskytendeTrekk == 0)
            trekk = trekkgrunnlag;

        return trekk;
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
