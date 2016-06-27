package ske.fastsetting.skatt.trekktabell;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Trekkrutine {


    public static long beregnTabellTrekk(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {

        System.out.println("- - - - - - - - - " + tabellnummer.toString() + " - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        long overskytendeTrekk = Skatteberegning.beregnOverskytendeTrekk(tabellnummer, periode, trekkgrunnlag);

        System.out.println("Overskytende trekk = " + overskytendeTrekk);

        if (overskytendeTrekk > 0) trekkgrunnlag = periode.maxTrekkgrunnlag;

        long avrundetTrekkgrunnlag = finnAvrundetTrekkgrunnlag(tabellnummer, periode, trekkgrunnlag);

        System.out.println("avrundetTrekkgrunnlag = " + avrundetTrekkgrunnlag);

        long personInntektAar = Math.round(avrundetTrekkgrunnlag * periode.getInntektsPeriode(tabellnummer));

        System.out.println("person-inntekt-år = " + personInntektAar);

        double alminneligInntektAar = finnAlminneligInntektAar(tabellnummer, personInntektAar);

        System.out.println("AlmInntÅr = " + alminneligInntektAar);

        long sumSkatt = beregnSkatt(tabellnummer, personInntektAar, alminneligInntektAar);

        System.out.println("SumSkatt = " + sumSkatt);

        long trekk = beregnTrekk(tabellnummer, periode, sumSkatt) + overskytendeTrekk;

        System.out.println("Trekk = " + trekk);

        if (trekk > trekkgrunnlag && overskytendeTrekk == 0) trekk = trekkgrunnlag;

        return trekk;
    }


    public static void main(String[] args) {
        Tabellnummer t = Tabellnummer.TABELL_7131P;
        Periode p = Periode.PERIODE_1_MAANED;
        long grl = 300L;

        long trekk = beregnTabellTrekk(t, p, grl);

        System.out.println("Resultat: " + t.toString() + " " + p.toString() + " " + grl + " " + trekk);

    }

    private static long finnAvrundetTrekkgrunnlag(Tabellnummer tabellnummer, Periode periode, long trekkgrunnlag) {
        int avrunding = periode.avrunding;
        return (trekkgrunnlag / avrunding * avrunding) + (avrunding / 2);
    }


    /*
    Finner netto årsinntekt (alminneligInntekt)
    */
    private static long finnAlminneligInntektAar(Tabellnummer tabellnummer, long personInntektAar) {
        long minsteFradrag = Fradrag.beregnMinsteFradrag(tabellnummer, personInntektAar);
        long standardFradrag = Fradrag.beregnStandardFradrag(tabellnummer, personInntektAar);
        long sjoFradrag = Fradrag.beregnSjoFradrag(tabellnummer, personInntektAar);
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


    private static long beregnSkatt(Tabellnummer tabellnummer, double personInntektAar, double alminneligInntektAar) {

        long kommuneskatt = Skatteberegning.beregnKommuneskatt(alminneligInntektAar);

        System.out.println("Kommuneskatt = " + kommuneskatt);

        long fellesskatt = Skatteberegning.beregnFelleseskatt(tabellnummer, alminneligInntektAar);

        System.out.println("FellesSkatt = " + fellesskatt);

        long trinnskatt = Skatteberegning.beregnTrinnskatt(tabellnummer, personInntektAar);

        System.out.println("Trinnskatt = " + trinnskatt);

        long trygdeavgift = Skatteberegning.beregnTrygdeavgift(tabellnummer, personInntektAar);

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
