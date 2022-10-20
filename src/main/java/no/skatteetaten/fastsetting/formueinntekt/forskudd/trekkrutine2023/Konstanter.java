package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2023;

public class Konstanter {

    static final long

            KLASSE1_VANLIG = 58250L,
            KLASSE1_FINNMARK = 78250L, // Personfradrag + finnmarksfradrag
            TRINN1 = 190350L,
            TRINN2 = 267900L,
            TRINN3 = 643800L,
            TRINN4 = 969200L,
            TRINN5 = 2000000L,
            LAV_GRENSE_TRYGDEAVGIFT = beregnLavGrenseTrygdeavgift(),
            HOY_GRENSE_TRYGDEAVGIFT = beregnHoyGrenseTrygdeavgift(),
            AVG_FRI_TRYGDEAVGIFT = 64650L,
            MAX_STFRADRAG = 40000L,
            MIN_ANV_MINSTE_FRADRAG = 3520L,
            MAX_ANV_MINSTE_FRADRAG = 96756L, // Lønn
            MAX_ANV_MINSTE_FRADRAG_PENSJ = 79904L,
            MIN_MINSTE_FRADRAG = 4000L,
            MAX_MINSTE_FRADRAG = 109950L,
            LONNSFRADRAG = 31800L,
            ANV_LONNSFRADRAG = 27984L,
            MAX_SJO_FRADRAG = 83000L;

    static final double
            PROSENT_TRINN1 = 1.7d,
            PROSENT_TRINN2 = 4.0d,
            PROSENT_TRINN3 = 13.4d,
            PROSENT_TRINN3_FINNMARK = 11.4d,
            PROSENT_TRINN4 = 16.4d,
            PROSENT_TRINN5 = 17.4d,
            FELLES_SKATT_VANLIG = 8.65d,
            FELLES_SKATT_FINNMARK = 5.15d,
            SKATTORE = 13.35d,
            TRYGDE_PROSENT = 25d,
            LAV_TRYGDEAVG_PROSENT = 5.1d,
            HOY_TRYGDEAVG_PROSENT = 8.0d,
            ANV_MINSTE_FRAD_PROSENT = 40.48d,
            ANV_MINSTE_FRAD_PROSENT_PENSJ = 35.2d,
            MINSTE_FRAD_PROSENT = 46.0d,
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
