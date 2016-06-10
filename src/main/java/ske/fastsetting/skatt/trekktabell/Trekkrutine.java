package ske.fastsetting.skatt.trekktabell;

public class Trekkrutine {


    public static long beregnTrekkForLonn(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {

        double personInntektAar = finnAarsInntekt(tabellnummer, periode, trekkgrunnlag, false);

        System.out.println("årsinntekt = " +  personInntektAar);

        double alminneligInntektAar = finnAlminneligInntekt(tabellnummer, periode, trekkgrunnlag, false);

        return 2;
    }

    public static long beregnTrekkForPensjon(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {
       return 0;

    }


    public static void main(String[] args) {
        System.out.println("Main starter opp");

        long trekk = beregnTrekkForLonn(Tabellnummer.TABELL_7100, Periode.PERIODE_1_DAG, 7522L);

        long trekk2 = beregnTrekkForLonn(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, 7599L);

        System.out.println("Trekket blir : " + trekk);
        System.out.println("Main avslutter");

    }

    private static double finnAarsInntekt(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag, boolean pensjon) {
        System.out.println("trekkgrunnlag = " + trekkgrunnlag);
        int avrunding = periode.getAvrunding(tabellnummer);
        long avrundetTrekkgrunnlag = (trekkgrunnlag / avrunding * avrunding) + (avrunding/2);
        System.out.println("Avrundet trekkgrunnlag = " + avrundetTrekkgrunnlag);

        // avrundet + 50
        return trekkgrunnlag * periode.getInntektsPeriode(tabellnummer, pensjon);
    }

    private static double finnAlminneligInntekt(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag, boolean pensjon) {
        return 0d;
    }
    private static double beregnSkatt(String tabellnummer, Periode periode, long trekkgrunnlag) {
        return 0d;
    }
    private static long finnTrekk(String tabellnummer, Periode periode, long trekkgrunnlag) {
        return 0L;
    }


}
