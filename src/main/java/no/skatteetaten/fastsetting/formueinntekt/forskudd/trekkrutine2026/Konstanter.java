package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2026;

public class Konstanter {

    static final long
            PERSONFRADRAG = 114540L, // Personfradrag
            PERSONFRADRAG_FINNMARK = 159210L, // Personfradrag + finnmarksfradrag
            TRINN1 = 226100L,
            TRINN2 = 318300L,
            TRINN3 = 725050L,
            TRINN4 = 980100L,
            TRINN5 = 1467200L,
            LAV_GRENSE_TRYGDEAVGIFT = beregnLavGrenseTrygdeavgift(),
            HOY_GRENSE_TRYGDEAVGIFT = beregnHoyGrenseTrygdeavgift(),
            AVG_FRI_TRYGDEAVGIFT = 99650L,
            MAX_STFRADRAG = 40000L,
            MIN_ANV_MINSTE_FRADRAG = 0L,
            MAX_ANV_MINSTE_FRADRAG = 84216L, // Lønn
            MIN_MINSTE_FRADRAG = 0L,
            MAX_MINSTE_FRADRAG = 95700L,
            LONNSFRADRAG = 0L,
            ANV_LONNSFRADRAG = 0L,
            MAX_SJO_FRADRAG = 86300L;

    static final double
            PROSENT_TRINN1 = 1.7d,
            PROSENT_TRINN2 = 4.0d,
            PROSENT_TRINN3 = 13.7d,
            PROSENT_TRINN4 = 16.8d,
            PROSENT_TRINN5 = 17.8d,
            FELLES_SKATT_VANLIG = 8.25d,
            FELLES_SKATT_FINNMARK = 4.75d,
            SKATTORE = 13.75d,
            TRYGDE_PROSENT = 25d,
            LAV_TRYGDEAVG_PROSENT = 5.1d,
            HOY_TRYGDEAVG_PROSENT = 7.6d,
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
