package ske.fastsetting.skatt.trekkrutine2019;

public class Konstanter {

    /**
     * Inntektsåret dette systemet gjelder for.
     */
    static final int AAR = 2019;

    static final long
            KLASSE1_VANLIG = 56550L,
            KLASSE2_VANLIG = 56550L,
            KLASSE1_FINNMARK = 72050L,
            KLASSE2_FINNMARK = 72050L,
            TRINN1 = 174500L,
            TRINN2 = 245650L,
            TRINN3 = 617500L,
            TRINN4 = 964800L,
            LAV_GRENSE_TRYGDEAVGIFT = beregnLavGrenseTrygdeavgift(),
            HOY_GRENSE_TRYGDEAVGIFT = beregnHoyGrenseTrygdeavgift(),
            AVG_FRI_TRYGDEAVGIFT = 54650L,
            MAX_STFRADRAG = 40000L,
            MIN_ANV_MINSTE_FRADRAG = 3520L,
            MAX_ANV_MINSTE_FRADRAG = 88704L,
            MAX_ANV_MINSTE_FRADRAG_PENSJ = 74844L,
            MIN_MINSTE_FRADRAG = 4000L,
            MAX_MINSTE_FRADRAG = 100800L,
            LONNSFRADRAG = 31800L,
            ANV_LONNSFRADRAG = 27984L,
            MAX_SJO_FRADRAG = 80000L;

    static final double
            PROSENT_TRINN1 = 1.9d,
            PROSENT_TRINN2 = 4.2d,
            TRINNSKATT_PROSENT3 = 13.2d,
            TRINNSKATT_PROSENT3_FINNMARK = 11.2d,
            PROSENT_TRINN4 = 16.2d,
            FELLES_SKATT_VANLIG = 7.85d,
            FELLES_SKATT_FINNMARK = 4.35d,
            SKATTORE = 14.15d,
            TRYGDE_PROSENT = 25d,
            LAV_TRYGDEAVG_PROSENT = 5.1d,
            HOY_TRYGDEAVG_PROSENT = 8.2d,
            ANV_MINSTE_FRAD_PROSENT = 39.6d,
            ANV_MINSTE_FRAD_PROSENT_PENSJ = 27.28d,
            MINSTE_FRAD_PROSENT = 45.0d,
            STFRADRAG_PROSENT = 10d,
            SJO_PROSENT = 30d;

    /*
    Det som avgjør den overskytende prosenten er hva som som betales i trygdeavgift, antall trekkmåneder og om det skal benyttes finnmark-satser eller ikke.
     */

    static final int
            OVERSKYTENDE_PROSENT_VANLIG = 54,
            OVERSKYTENDE_PROSENT_PENSJONIST = 48,
            OVERSKYTENDE_PROSENT_7300_7400 = 54,
            OVERSKYTENDE_PROSENT_7350_7450 = 47,
            OVERSKYTENDE_PROSENT_7500_7600 = 39,
            OVERSKYTENDE_PROSENT_7550_7650 = 44,
            OVERSKYTENDE_PROSENT_7700_7800 = 44,
            OVERSKYTENDE_PROSENT_0100_0200 = 39,
            OVERSKYTENDE_PROSENT_0101_0201 = 47,
            OVERSKYTENDE_PROSENT_6300_6400 = 50,
            OVERSKYTENDE_PROSENT_6350_6450 = 43,
            OVERSKYTENDE_PROSENT_6500_6600 = 35,
            OVERSKYTENDE_PROSENT_6550_6650 = 40,
            OVERSKYTENDE_PROSENT_6700_6800 = 40,
            OVERSKYTENDE_PROSENT_7150_7250 = 47,
            OVERSKYTENDE_PROSENT_7160_7260 = 39,
            OVERSKYTENDE_PROSENT_7170_7270 = 44;


    static long beregnLavGrenseTrygdeavgift() {
        return Math.round((AVG_FRI_TRYGDEAVGIFT * TRYGDE_PROSENT)/(TRYGDE_PROSENT - LAV_TRYGDEAVG_PROSENT));
    }
    static long beregnHoyGrenseTrygdeavgift() {
        return Math.round((AVG_FRI_TRYGDEAVGIFT * TRYGDE_PROSENT)/(TRYGDE_PROSENT - HOY_TRYGDEAVG_PROSENT));
    }

}
