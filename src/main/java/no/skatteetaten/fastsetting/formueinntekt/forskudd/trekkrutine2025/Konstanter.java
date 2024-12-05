package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2025;

public class Konstanter {

    static final long
            KLASSE1_VANLIG = 108550L,
            KLASSE1_FINNMARK = 138550L, // Personfradrag + finnmarksfradrag
            TRINN1 = 217400L,
            TRINN2 = 306050L,
            TRINN3 = 697150L,
            TRINN4 = 942400L,
            TRINN5 = 1410750L,
            LAV_GRENSE_TRYGDEAVGIFT = beregnLavGrenseTrygdeavgift(),
            HOY_GRENSE_TRYGDEAVGIFT = beregnHoyGrenseTrygdeavgift(),
            AVG_FRI_TRYGDEAVGIFT = 99650L,
            MAX_STFRADRAG = 40000L,
            MIN_ANV_MINSTE_FRADRAG = 0L,
            MAX_ANV_MINSTE_FRADRAG = 80960L, // Lønn
            MIN_MINSTE_FRADRAG = 0L,
            MAX_MINSTE_FRADRAG = 92000L,
            LONNSFRADRAG = 0L,
            ANV_LONNSFRADRAG = 0L,
            MAX_SJO_FRADRAG = 83000L;

    static final double
            PROSENT_TRINN1 = 1.7d,
            PROSENT_TRINN2 = 4.0d,
            PROSENT_TRINN3 = 13.7d,
            PROSENT_TRINN3_FINNMARK = 13.7d,
            PROSENT_TRINN4 = 16.7d,
            PROSENT_TRINN5 = 17.7d,
            FELLES_SKATT_VANLIG = 6.60d,
            FELLES_SKATT_FINNMARK = 3.10d,
            SKATTORE = 15.40d,
            TRYGDE_PROSENT = 25d,
            LAV_TRYGDEAVG_PROSENT = 5.1d,
            HOY_TRYGDEAVG_PROSENT = 7.7d,
            ANV_MINSTE_FRAD_PROSENT = 40.48d,
            MINSTE_FRAD_PROSENT = 46.0d,
            STFRADRAG_PROSENT = 10d,
            SJO_PROSENT = 30d;

    static long beregnLavGrenseTrygdeavgift() {
        return Math.round((AVG_FRI_TRYGDEAVGIFT * TRYGDE_PROSENT)/(TRYGDE_PROSENT - LAV_TRYGDEAVG_PROSENT));
    }
    static long beregnHoyGrenseTrygdeavgift() {
        return Math.round((AVG_FRI_TRYGDEAVGIFT * TRYGDE_PROSENT)/(TRYGDE_PROSENT - HOY_TRYGDEAVG_PROSENT));
    }

}
