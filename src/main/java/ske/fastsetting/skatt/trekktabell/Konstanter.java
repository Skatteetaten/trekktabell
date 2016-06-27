package ske.fastsetting.skatt.trekktabell;

public class Konstanter {

    /**
     * Inntektsåret dette systemet gjelder for.
     */
    public static final int AAR = 2016;
    /*
    Skattesatser for 2016
     */
    public static final long
            KLASSE1_VANLIG = 51750L,
            KLASSE2_VANLIG = 76250L,
            KLASSE1_FINNMARK = 67250L,
            KLASSE2_FINNMARK = 91750L,
            TRINN1 = 159800L,
            TRINN2 = 224900L,
            TRINN3 = 565400L,
            TRINN4 = 909500L,
            LAV_GRENSE_TRYGDEAVGIFT = 62374L,
            HOY_GRENSE_TRYGDEAVGIFT = 73884L,
            AVG_FRI_TRYGDEAVGIFT = 49650L,
            MAX_STFRADRAG = 40000L,
            MIN_ANV_MINSTE_FRADRAG = 3520L,
            MAX_ANV_MINSTE_FRADRAG = 80476L,
            MAX_ANV_MINSTE_FRADRAG_PENSJ = 64768L,
            MIN_MINSTE_FRADRAG = 4000L,
            MAX_MINSTE_FRADRAG = 91450L,
            LONNSFRADRAG = 31800L,
            ANV_LONNSFRADRAG = 27984L,
            MAX_SJO_FRADRAG = 80000L;

    public static final double
            PROSENT_TRINN1 = 0.44d,
            PROSENT_TRINN2 = 1.7d,
            PROSENT_TRINN4 = 13.7d,
            TRINNSKATT_PROSENT3 = 10.7d,
            TRINNSKATT_PROSENT3_FINNMARK = 8.7d,
            FELLES_SKATT_VANLIG = 10.55d,
            FELLES_SKATT_FINNMARK = 7.05d,
            SKATTORE = 14.45d,
            TRYGDE_PROSENT = 25d,
            LAV_TRYGDEAVG_PROSENT = 5.1d,
            HOY_TRYGDEAVG_PROSENT = 8.2d,
            ANV_MINSTE_FRAD_PROSENT = 37.84d,
            ANV_MINSTE_FRAD_PROSENT_PENSJ = 25.52d,
            MINSTE_FRAD_PROSENT = 43.0d,
            STFRADRAG_PROSENT = 10d,
            SJO_PROSENT = 30d;

    /*
    Det som avgjør den overskytende prosenten er hva som som betales i trygdeavgift, antall trekkmåneder og om det skal benyttes finnmark-satser eller ikke.
     */
    // TODO: 21.06.16 kan vi beregne disse i stedet ???

    public static final int
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

}

