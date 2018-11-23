package ske.fastsetting.skatt.trekkrutine2019;

public class Fradrag {

    static long beregnMinsteFradrag(Tabellnummer tabellnummer, long personInntektAar) {
        if (tabellnummer.tabelltype == Tabelltype.PENSJONIST)
            return beregnMinstefradragPensjon(personInntektAar);

        if (tabellnummer.tabelltype == Tabelltype.SJØ)
            return beregnMinstefradragSjo(personInntektAar);

        return beregnMinstefradragVanlig(personInntektAar);
    }

    // Beregner både for vanlige tabeller og standardfradrag-tabeller
    private static long beregnMinstefradragVanlig(long personInntektAar) {
        long minstefradrag = Math.round((personInntektAar * Konstanter.ANV_MINSTE_FRAD_PROSENT) / 100);

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

    private static long beregnMinstefradragPensjon(long personInntektAar) {
        long minstefradrag = Math.round((personInntektAar * Konstanter.ANV_MINSTE_FRAD_PROSENT_PENSJ) / 100);

        if (minstefradrag > Konstanter.MAX_ANV_MINSTE_FRADRAG_PENSJ) {
            minstefradrag = Konstanter.MAX_ANV_MINSTE_FRADRAG_PENSJ;
        }
        if (minstefradrag < Konstanter.MIN_ANV_MINSTE_FRADRAG) {
            minstefradrag = Konstanter.MIN_ANV_MINSTE_FRADRAG;
        }
        if (minstefradrag > personInntektAar) {
            minstefradrag = personInntektAar;
        }
        return minstefradrag;
    }

    private static long beregnMinstefradragSjo(long personInntektAar) {
        long minstefradrag = Math.round((personInntektAar * Konstanter.MINSTE_FRAD_PROSENT) / 100);

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

    static long beregnStandardFradrag(Tabellnummer tabellnummer, long personInntektAar) {
        if (!tabellnummer.isStandardFradrag())
            return 0L;

        long standardFradrag = Math.round((personInntektAar * Konstanter.STFRADRAG_PROSENT) / 100);
        return (standardFradrag > Konstanter.MAX_STFRADRAG) ? Konstanter.MAX_STFRADRAG : standardFradrag;
    }

    static long beregnSjoFradrag(Tabellnummer tabellnummer, long personInntektAar) {
        if (tabellnummer.tabelltype != Tabelltype.SJØ)
            return 0L;

        long sjoFradrag = Math.round((personInntektAar * Konstanter.SJO_PROSENT) / 100);
        return (sjoFradrag > Konstanter.MAX_SJO_FRADRAG) ? Konstanter.MAX_SJO_FRADRAG : sjoFradrag;
    }

}
