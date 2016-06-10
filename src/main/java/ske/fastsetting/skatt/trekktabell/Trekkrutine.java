package ske.fastsetting.skatt.trekktabell;

public class Trekkrutine {


    public static long beregnTrekkForLonn(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {

        double personInntektAar = finnAarsInntekt(tabellnummer, periode, trekkgrunnlag, false);

        System.out.println("person-inntekt-år = " + personInntektAar);

        double alminneligInntektAar = finnAlminneligInntekt(tabellnummer, personInntektAar, false);

        System.out.println("AlmInntÅr = " + alminneligInntektAar);

        return 2;
    }

    public static long beregnTrekkForPensjon(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {
        return 0;

    }


    public static void main(String[] args) {
        System.out.println("Main starter opp");

        long trekk = beregnTrekkForLonn(Tabellnummer.TABELL_7101, Periode.PERIODE_1_DAG, 7522L);

        long trekk2 = beregnTrekkForLonn(Tabellnummer.TABELL_7300, Periode.PERIODE_1_MAANED, 7599L);

        System.out.println("Trekket blir : " + trekk);
        System.out.println("Main avslutter");

    }

    /*
    Finner brutto årsinntekt (personInntekt)
    */
    private static double finnAarsInntekt(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag, boolean pensjon) {
        System.out.println("trekkgrunnlag = " + trekkgrunnlag);
        int avrunding = periode.getAvrunding(tabellnummer);
        long avrundetTrekkgrunnlag = (trekkgrunnlag / avrunding * avrunding) + (avrunding / 2);
        System.out.println("Avrundet trekkgrunnlag = " + avrundetTrekkgrunnlag);

        // avrundet + 50
        return avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer, pensjon);
    }

    /*
    Finner netto årsinntekt (alminneligInntekt)
    */
    private static double finnAlminneligInntekt(Tabellnummer tabellnummer, double personInntektAar, boolean pensjon) {
        double minsteFradrag = beregnMinsteFradrag(tabellnummer, personInntektAar, pensjon);
        int tabellTabellFradrag = finnTabellFradrag(tabellnummer);
        double standardFradrag = beregnStandardFradrag(tabellnummer, personInntektAar);
        double sjoFradrag = finnSjoFradrag(tabellnummer, personInntektAar, pensjon);
        double klasseFradrag = finnKlasseFradrag(tabellnummer, personInntektAar, pensjon);

        return personInntektAar
                - minsteFradrag
                - tabellTabellFradrag
                - standardFradrag
                - sjoFradrag
                - klasseFradrag;
    }

    private static double beregnMinsteFradrag(Tabellnummer tabellnummer, double personInntektAar, boolean pensjon) {

        return 0d;
    }

    private static int finnTabellFradrag(Tabellnummer tabellnummer) {
        return tabellnummer.tabellFradrag;
    }

    private static double beregnStandardFradrag(Tabellnummer tabellnummer, double personInntektAar) {
        if (tabellnummer.type.equals("Vanlig")) return 0d;

        double standardFradrag = (personInntektAar * Konstanter.STFRADRAG_PROSENT) / 100;
        return (standardFradrag > Konstanter.MAX_STFRADRAG) ? Konstanter.MAX_STFRADRAG : standardFradrag;
    }

    private static double finnSjoFradrag(Tabellnummer tabellnummer, double personInntektAar, boolean pensjon) {
        if (!tabellnummer.type.equals("Sjø")) return 0d;

        double sjoFradrag = (personInntektAar * Konstanter.MAX_SJO_FRADRAG) / 100;
        return (sjoFradrag > Konstanter.MAX_SJO_FRADRAG) ? Konstanter.MAX_SJO_FRADRAG : sjoFradrag;
    }

    private static double finnKlasseFradrag(Tabellnummer tabellnummer, double personInntektAar, boolean pensjon) {

        return 0d;
    }


    private static double beregnSkatt(String tabellnummer, Periode periode, long trekkgrunnlag) {
        return 0d;
    }

    private static long finnTrekk(String tabellnummer, Periode periode, long trekkgrunnlag) {
        return 0L;
    }


}
