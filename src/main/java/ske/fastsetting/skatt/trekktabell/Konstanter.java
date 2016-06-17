package ske.fastsetting.skatt.trekktabell;

public class Konstanter {

    /**
     * Inntektsåret dette systemet gjelder for.
     */
    public static final int AAR = 2016;
    /*
    Skattesatser for 2016
     */
    public static final double
            KLASSE1_VANLIG = 51750d,
            KLASSE2_VANLIG = 76250d,
            KLASSE1_FINNMARK = 67250d,
            KLASSE2_FINNMARK = 91750d,
            TRINN1 = 159800d,
            TRINN2 = 224900d,
            TRINN3 = 565400d,
            TRINN4 = 909500d,
            PROSENT_TRINN1 = 0.44d,
            PROSENT_TRINN2 = 1.7d,
            PROSENT_TRINN4 = 13.7d,
            TRINNSKATT_PROSENT3 = 10.7d,
            TRINNSKATT_PROSENT3_FINNMARK = 8.7d,
            FELLES_SKATT_VANLIG = 10.55d,
            FELLES_SKATT_FINNMARK = 7.05d,
            SKATTORE = 14.45d,
            LAV_GRENSE_TRYGDEAVGIFT = 62374d,
            HOY_GRENSE_TRYGDEAVGIFT = 73884d,
            TRYGDE_PROSENT = 25d,
            LAV_TRYGDEAVG_PROSENT = 5.1d,
            HOY_TRYGDEAVG_PROSENT = 8.2d,
            AVG_FRI_TRYGDEAVGIFT = 49650d,
            STFRADRAG_PROSENT = 10d,
            MAX_STFRADRAG = 40000d,
            ANV_MINSTE_FRAD_PROSENT = 37.84d,
            ANV_MINSTE_FRAD_PROSENT_PENSJ = 25.52d,
            MIN_ANV_MINSTE_FRADRAG = 3520d,
            MAX_ANV_MINSTE_FRADRAG = 80476d,
            MAX_ANV_MINSTE_FRADRAG_PENSJ = 64768d,
            MINSTE_FRAD_PROSENT = 43.0d,
            MIN_MINSTE_FRADRAG = 4000d,
            MAX_MINSTE_FRADRAG = 91450d,
            LONNSFRADRAG = 31800d,
            ANV_LONNSFRADRAG = 27984d,
            SJO_PROSENT = 30d,
            MAX_SJO_FRADRAG = 80000d;

    /*
    Det som avgjør den overskytende prosenten er hva som som betales i trygdeavgift, antall trekkmåneder og om det skal benyttes finnmark-satser eller ikke.
     */
    public static final int
            OVERSKYTENDE_PROSENT_VANLIG = 54,
            OVERSKYTENDE_PROSENT_PENSJONIST = 48,
            OVERSKYTENDE_PROSENT_HOY_TRYGDEAVG_10_5 = 54,           // 7300, 7400,
            OVERSKYTENDE_PROSENT_HOY_TRYGDEAVG_12 = 47,             // 7350, 7450, 7150, 7250, 0101, 0201
            OVERSKYTENDE_PROSENT_IKKE_TRYGDEAVG_10_5 = 44,          // 7550, 7650, 7170, 7270
            OVERSKYTENDE_PROSENT_IKKE_TRYGDEAVG_12 = 39,            // 7500, 7600, 0100, 0200, 7160, 7260
            OVERSKYTENDE_PROSENT_LAV_TRYGDEAVG_12 = 44,             // 7700, 7800,
            OVERSKYTENDE_PROSENT_HOY_TRYGDEAVG_10_5_FINNMARK = 50,  // 6300, 6400
            OVERSKYTENDE_PROSENT_HOY_TRYGDEAVG_12_FINNMARK = 43,    // 6350, 6450
            OVERSKYTENDE_PROSENT_IKKE_TRYGDEAVG_10_5_FINNMARK = 40, // 6550, 6650
            OVERSKYTENDE_PROSENT_IKKE_TRYGDEAVG_12_FINNMARK = 35,   // 6500, 6600
            OVERSKYTENDE_PROSENT_LAV_TRYGDEAVG_12_FINNMARK = 40;    // 6700, 6800

}

