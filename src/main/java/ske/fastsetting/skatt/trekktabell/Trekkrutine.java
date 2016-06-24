package ske.fastsetting.skatt.trekktabell;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Trekkrutine {


    public static long beregnTrekk(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {

        System.out.println("- - - - - - - - - " + tabellnummer.toString() + " - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        long overskytendeTrekk = Skatteberegning.beregnOverskytendeTrekk(tabellnummer, periode, trekkgrunnlag);

        System.out.println("Overskytende trekk = " + overskytendeTrekk);

        if (overskytendeTrekk > 0) trekkgrunnlag = periode.maxTrekkgrunnlag;

        long avrundetTrekkgrunnlag = finnAvrundetTrekkgrunnlag(tabellnummer, periode, trekkgrunnlag);

        System.out.println("avrundetTrekkgrunnlag = " + avrundetTrekkgrunnlag);

        double personInntektAar = avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer);

        System.out.println("person-inntekt-år = " + personInntektAar);

        double alminneligInntektAar = finnAlminneligInntektAar(tabellnummer, personInntektAar);

        System.out.println("AlmInntÅr = " + alminneligInntektAar);

        double sumSkatt = beregnSkatt(tabellnummer, personInntektAar, alminneligInntektAar);

        System.out.println("SumSkatt = " + sumSkatt);

        long trekk = beregnTrekk(tabellnummer, periode, sumSkatt) + overskytendeTrekk;

        System.out.println("Trekk = " + trekk);

        if (trekk > trekkgrunnlag && overskytendeTrekk == 0) trekk = trekkgrunnlag;

        return trekk;
    }


    public static void main(String[] args) {
        Tabellnummer t = Tabellnummer.TABELL_7128;
        Periode p = Periode.PERIODE_4_DAGER;
        long grl = 780L;

        long trekk = beregnTrekk(t, p, grl);

        System.out.println("Resultat: " + t.toString() + " " + p.toString() + " " + grl + " " + trekk);

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

        System.out.println("Antall trekkperioder : " + periode.getTrekkPeriode(tabellnummer));
        double trekkMedDesimaler = sumSkatt / periode.getTrekkPeriode(tabellnummer);
        System.out.println("trekkMedDesimaler = " + trekkMedDesimaler);

        long trekkUtenDesimaler =0L;
        if (tabellnummer.tabelltype == Tabelltype.SJØ)
            trekkUtenDesimaler = (long) Math.floor(trekkMedDesimaler);
        else
            trekkUtenDesimaler = Math.round(trekkMedDesimaler);

        System.out.println("trekkUtenDesimaler = " + trekkUtenDesimaler);

        return trekkUtenDesimaler;
    }


}
