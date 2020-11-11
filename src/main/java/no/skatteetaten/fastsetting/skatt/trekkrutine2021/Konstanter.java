package no.skatteetaten.fastsetting.skatt.trekkrutine2021;

public class Konstanter {

    static final long

            KLASSE1_VANLIG = 51300L,
            KLASSE1_FINNMARK = 66800L, // Personfradrag + finnmarksfradrag
            TRINN1 = 180800L,
            TRINN2 = 254500L,
            TRINN3 = 639750L,
            TRINN4 = 999550L,
            LAV_GRENSE_TRYGDEAVGIFT = beregnLavGrenseTrygdeavgift(),
            HOY_GRENSE_TRYGDEAVGIFT = beregnHoyGrenseTrygdeavgift(),
            AVG_FRI_TRYGDEAVGIFT = 54650L,
            MAX_STFRADRAG = 40000L,
            MIN_ANV_MINSTE_FRADRAG = 3520L,
            MAX_ANV_MINSTE_FRADRAG = 91916L, // Lønn
            MAX_ANV_MINSTE_FRADRAG_PENSJ = 76956L,
            MIN_MINSTE_FRADRAG = 4000L,
            MAX_MINSTE_FRADRAG = 104450L,
            LONNSFRADRAG = 31800L,
            ANV_LONNSFRADRAG = 27984L,
            MAX_SJO_FRADRAG = 80000L;

    static final double
            PROSENT_TRINN1 = 1.9d,
            PROSENT_TRINN2 = 4.2d,
            PROSENT_TRINN3 = 13.2d,
            PROSENT_TRINN3_FINNMARK = 11.2d,
            PROSENT_TRINN4 = 16.2d,
            FELLES_SKATT_VANLIG = 8.45d,
            FELLES_SKATT_FINNMARK = 4.95d,
            SKATTORE = 13.55d,
            TRYGDE_PROSENT = 25d,
            LAV_TRYGDEAVG_PROSENT = 5.1d,
            HOY_TRYGDEAVG_PROSENT = 8.2d,
            ANV_MINSTE_FRAD_PROSENT = 39.6d,
            ANV_MINSTE_FRAD_PROSENT_PENSJ = 27.28d,
            MINSTE_FRAD_PROSENT = 45.0d,
            STFRADRAG_PROSENT = 10d,
            SJO_PROSENT = 30d;

    /*
    Det som avgjør den overskytende prosenten, er hva som som betales i trygdeavgift, antall trekkmåneder og om
    det skal benyttes finnmark-satser eller ikke.
     */

    static final int
            OVERSKYTENDE_PROSENT_VANLIG = 54,
            OVERSKYTENDE_PROSENT_PENSJONIST = 48,
            OVERSKYTENDE_PROSENT_7300 = 54,
            OVERSKYTENDE_PROSENT_7350 = 47,
            OVERSKYTENDE_PROSENT_7500 = 39,
            OVERSKYTENDE_PROSENT_7550 = 44,
            OVERSKYTENDE_PROSENT_7700 = 44,
            OVERSKYTENDE_PROSENT_0100 = 39,
            OVERSKYTENDE_PROSENT_0101 = 47,
            OVERSKYTENDE_PROSENT_6300 = 50,
            OVERSKYTENDE_PROSENT_6350 = 43,
            OVERSKYTENDE_PROSENT_6500 = 35,
            OVERSKYTENDE_PROSENT_6550 = 40,
            OVERSKYTENDE_PROSENT_6700 = 40,
            OVERSKYTENDE_PROSENT_7150 = 47,
            OVERSKYTENDE_PROSENT_7160 = 39,
            OVERSKYTENDE_PROSENT_7170 = 44;


    static long beregnLavGrenseTrygdeavgift() {
        return Math.round((AVG_FRI_TRYGDEAVGIFT * TRYGDE_PROSENT)/(TRYGDE_PROSENT - LAV_TRYGDEAVG_PROSENT));
    }
    static long beregnHoyGrenseTrygdeavgift() {
        return Math.round((AVG_FRI_TRYGDEAVGIFT * TRYGDE_PROSENT)/(TRYGDE_PROSENT - HOY_TRYGDEAVG_PROSENT));
    }

}
