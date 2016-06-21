package ske.fastsetting.skatt.trekktabell;

public class Trekkrutine {


    public static long beregnTrekk(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {

        System.out.println("- - - - - - - - - " + tabellnummer.toString() + " - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        long avrundetTrekkgrunnlag = finnAvrundetTrekkgrunnlag(tabellnummer, periode, trekkgrunnlag);

        System.out.println("avrundetTrekkgrunnlag = " + avrundetTrekkgrunnlag);

        long overskytendeTrekk = Skatteberegning.beregnOverskytendeTrekk(tabellnummer, periode, avrundetTrekkgrunnlag);

        System.out.println("Overskytende trekk = " + overskytendeTrekk);

        if (overskytendeTrekk > 0) avrundetTrekkgrunnlag = periode.maxTrekkgrunnlag;

        double personInntektAar = avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer);

        System.out.println("person-inntekt-år = " + personInntektAar);

        double alminneligInntektAar = finnAlminneligInntektAar(tabellnummer, personInntektAar);

        System.out.println("AlmInntÅr = " + alminneligInntektAar);

        double sumSkatt = beregnSkatt(tabellnummer, personInntektAar, alminneligInntektAar);

        System.out.println("SumSkatt = " + sumSkatt);

        long trekk = beregnTrekk(tabellnummer, periode, sumSkatt) + overskytendeTrekk;

        System.out.println("Trekk = " + trekk);

        if (trekk > trekkgrunnlag) trekk = trekkgrunnlag;

        return trekk;
    }


    public static void main(String[] args) {
        System.out.println("Main starter opp");

        long trekk = beregnTrekk(Tabellnummer.TABELL_7160, Periode.PERIODE_14_DAGER, 40000L);

        System.out.println("Main avslutter, Trekket blir : " + trekk);

    }

    private static long finnAvrundetTrekkgrunnlag(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {
        int avrunding = periode.avrunding;
        return (trekkgrunnlag / avrunding * avrunding) + (avrunding / 2);
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
