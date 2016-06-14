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

        System.out.println("Main : Trekket blir : " + trekk);
        System.out.println("Main avslutter");

    }

    /*
    Finner brutto årsinntekt (personInntekt)
    */
    private static double finnAarsInntekt(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag, boolean pensjon) {
        System.out.println("finnAarsInntekt kjører, trekkgrunnlag = " + trekkgrunnlag);
        int avrunding = periode.getAvrunding(tabellnummer);
        long avrundetTrekkgrunnlag = (trekkgrunnlag / avrunding * avrunding) + (avrunding / 2);
        System.out.println("finnAarsInntekt kjører, Avrundet trekkgrunnlag = " + avrundetTrekkgrunnlag);

        // avrundet + 50
        return avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer, pensjon);
    }

    /*
    Finner netto årsinntekt (alminneligInntekt)
    */
    private static double finnAlminneligInntekt(Tabellnummer tabellnummer, double personInntektAar, boolean pensjon) {
        double minsteFradrag = Fradrag.beregnMinsteFradrag(tabellnummer, personInntektAar, pensjon);
        double standardFradrag = Fradrag.beregnStandardFradrag(tabellnummer, personInntektAar);
        double sjoFradrag = Fradrag.beregnSjoFradrag(tabellnummer, personInntektAar, pensjon);
        System.out.println("Minstefradrag = " + minsteFradrag);

        return personInntektAar
                - minsteFradrag
                - tabellnummer.tabellFradrag
                - standardFradrag
                - sjoFradrag
                - tabellnummer.klasseFradrag;
    }


    private static double beregnSkatt(String tabellnummer, Periode periode, long trekkgrunnlag) {
        return 0d;
    }

    private static long finnTrekk(String tabellnummer, Periode periode, long trekkgrunnlag) {
        return 0L;
    }


}
