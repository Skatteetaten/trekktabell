package ske.fastsetting.skatt.trekktabell;

public class Trekkrutine {


    public static long beregnTrekk(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {

        System.out.println("- - - - - - - - - " + tabellnummer.toString() + " - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        // TODO: 16.06.16 Bør antakelig finne avrundet trekkgrunnlag først, og også begrenset til max-trekkgrunnlag
        // TODO: 16.06.16 Og må finne overskytende trekk
        
        double personInntektAar = finnAarsInntekt(tabellnummer, periode, trekkgrunnlag);

        System.out.println("person-inntekt-år = " + personInntektAar);

        double alminneligInntektAar = finnAlminneligInntektAar(tabellnummer, personInntektAar);

        System.out.println("AlmInntÅr = " + alminneligInntektAar);

        double sumSkatt = beregnSkatt(tabellnummer, personInntektAar, alminneligInntektAar);

        System.out.println("SumSkatt = " + sumSkatt);

        long trekk = beregnTrekk(tabellnummer, periode, sumSkatt);

        System.out.println("Trekk = " + trekk);
        // TODO: 16.06.16 trekket skal ikke være > avrundet trekkgrunnlag 

        return trekk;
    }


    public static void main(String[] args) {
        System.out.println("Main starter opp");

        long trekk = beregnTrekk(Tabellnummer.TABELL_7100P, Periode.PERIODE_14_DAGER, 20000L);

        //long trekk2 = beregnTrekk(Tabellnummer.TABELL_7300, Periode.PERIODE_1_MAANED, 7599L);

        System.out.println("Main : Trekket blir : " + trekk);
        System.out.println("Main avslutter");

    }

    /*
    Finner brutto årsinntekt (personInntekt)
    */
    private static double finnAarsInntekt(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {
        System.out.println("finnAarsInntekt kjører, trekkgrunnlag = " + trekkgrunnlag);
        int avrunding = periode.getAvrunding(tabellnummer);
        long avrundetTrekkgrunnlag = (trekkgrunnlag / avrunding * avrunding) + (avrunding / 2);
        System.out.println("finnAarsInntekt kjører, Avrundet trekkgrunnlag = " + avrundetTrekkgrunnlag);

        return avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer);
    }

    /*
    Finner netto årsinntekt (alminneligInntekt)
    */
    private static double finnAlminneligInntektAar(Tabellnummer tabellnummer, double personInntektAar) {
        double minsteFradrag = Fradrag.beregnMinsteFradrag(tabellnummer, personInntektAar);
        double standardFradrag = Fradrag.beregnStandardFradrag(tabellnummer, personInntektAar);
        double sjoFradrag = Fradrag.beregnSjoFradrag(tabellnummer, personInntektAar);
        System.out.println("Minstefradrag = " + minsteFradrag);
        System.out.println("standardFradrag=" + standardFradrag);
        System.out.println("sjøFradrag=" + sjoFradrag);
        System.out.println("tabellfradrag ==" + tabellnummer.tabellFradrag);
        System.out.println("klassefradrag ==" + tabellnummer.klasseFradrag);

        return personInntektAar
                - minsteFradrag
                - tabellnummer.tabellFradrag
                - standardFradrag
                - sjoFradrag
                - tabellnummer.klasseFradrag;
    }


    private static double beregnSkatt(Tabellnummer tabellnummer, double personInntektAar, double alminneligInntektAar) {

        double kommuneskatt = Skatteberegning.beregnKommuneskatt(alminneligInntektAar);

        System.out.println("Kommuneskatt = " + kommuneskatt);

        double fellesskatt = Skatteberegning.beregnFelleseskatt(tabellnummer, alminneligInntektAar);

        System.out.println("FellesSkatt = " + fellesskatt);

        double trinnskatt = Skatteberegning.beregnTrinnskatt(tabellnummer, personInntektAar);

        System.out.println("Trinnskatt = " + trinnskatt);

        double trygdeavgift = Skatteberegning.beregnTrygdeavgift(tabellnummer, personInntektAar);

        System.out.println("Trygdeagift = " + trygdeavgift);

        return kommuneskatt + fellesskatt + trinnskatt + trygdeavgift;

    }

    private static long beregnTrekk(Tabellnummer tabellnummer, Periode periode, double sumSkatt) {
        double trekkMedDesimaler = sumSkatt / periode.getTrekkPeriode(tabellnummer);
        System.out.println("trekkMedDesimaler = " + trekkMedDesimaler);
        long trekkUtenDesimaler = Math.round(trekkMedDesimaler);
        System.out.println("trekkUtenDesimaler = " + trekkUtenDesimaler);

        return trekkUtenDesimaler;
    }


}
