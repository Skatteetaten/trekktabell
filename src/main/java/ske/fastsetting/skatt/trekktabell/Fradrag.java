package ske.fastsetting.skatt.trekktabell;


public class Fradrag {

    public static double beregnMinsteFradrag(Tabellnummer tabellnummer, double personInntektAar) {

        if (tabellnummer.isPensjonist()) return beregnMinstefradragPensjon(personInntektAar);

        if (tabellnummer.isSjo()) return beregnMinstefradragSjo(personInntektAar);

        return beregnMinstefradragVanlig(personInntektAar);
    }

    // Beregner både for vanlige tabeller og standardfradrag-tabeller
    private static double beregnMinstefradragVanlig(double personInntektAar) {

        double minstefradrag = (personInntektAar * Konstanter.ANV_MINSTE_FRAD_PROSENT) / 100;

        if (minstefradrag > Konstanter.MAX_ANV_MINSTE_FRADRAG) {
            minstefradrag = Konstanter.MAX_ANV_MINSTE_FRADRAG;
        }
        if (minstefradrag < Konstanter.MIN_ANV_MINSTE_FRADRAG) {
            minstefradrag = Konstanter.MIN_ANV_MINSTE_FRADRAG;
        }
        if (minstefradrag < Konstanter.ANV_LONNSFRADRAG) {
            minstefradrag = Konstanter.ANV_LONNSFRADRAG;
        }
        if (minstefradrag > personInntektAar) {
            minstefradrag = personInntektAar;
        }
        return minstefradrag;
    }

    private static double beregnMinstefradragPensjon(double personInntektAar) {

        double minstefradrag = (personInntektAar * Konstanter.ANV_MINSTE_FRAD_PROSENT_PENSJ) / 100;

        if (minstefradrag > Konstanter.MAX_ANV_MINSTE_FRADRAG_PENSJ) {
            minstefradrag = Konstanter.MAX_ANV_MINSTE_FRADRAG_PENSJ;
        }
        if (minstefradrag < Konstanter.MIN_ANV_MINSTE_FRADRAG) {
            minstefradrag = Konstanter.MIN_ANV_MINSTE_FRADRAG;
        }
        return minstefradrag;
    }
    private static double beregnMinstefradragSjo(double personInntektAar) {

        double minstefradrag = (personInntektAar * Konstanter.MINSTE_FRAD_PROSENT) / 100;

        if (minstefradrag > Konstanter.MAX_MINSTE_FRADRAG) {
            minstefradrag = Konstanter.MAX_MINSTE_FRADRAG;
        }
        if (minstefradrag < Konstanter.MIN_MINSTE_FRADRAG) {
            minstefradrag = Konstanter.MIN_MINSTE_FRADRAG;
        }
        if (minstefradrag < Konstanter.LONNSFRADRAG) {
            minstefradrag = Konstanter.LONNSFRADRAG;
        }
        if (minstefradrag > personInntektAar) {
            minstefradrag = personInntektAar;
        }
        return minstefradrag;
    }

    public static double beregnStandardFradrag(Tabellnummer tabellnummer, double personInntektAar) {
        if (!tabellnummer.isStandardFradrag()) return 0d;

        double standardFradrag = (personInntektAar * Konstanter.STFRADRAG_PROSENT) / 100;
        return (standardFradrag > Konstanter.MAX_STFRADRAG) ? Konstanter.MAX_STFRADRAG : standardFradrag;
    }

    public static double beregnSjoFradrag(Tabellnummer tabellnummer, double personInntektAar) {
        if (!tabellnummer.isSjo()) return 0d;

        double sjoFradrag = (personInntektAar * Konstanter.SJO_PROSENT) / 100;
        return (sjoFradrag > Konstanter.MAX_SJO_FRADRAG) ? Konstanter.MAX_SJO_FRADRAG : sjoFradrag;
    }


}
