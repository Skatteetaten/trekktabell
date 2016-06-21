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
    // TODO: 21.06.16 kan vi beregne denne i stedet ???

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

