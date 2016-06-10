package ske.fastsetting.skatt.trekktabell;

/**
 * Created by x00pjr on 09.06.16.
 */
public enum Tabellnummer {
    TABELL_7100("7100", "Vanlig"),
    TABELL_7101("7101", "Vanlig"),
    TABELL_7102("7102", "Vanlig"),
    TABELL_7103("7103", "Vanlig"),
    TABELL_7200("7200", "Vanlig"),
    TABELL_7300("7300", "Standardfradrag"),
    tABELL_0100("0100", "Sjø" );

    public final String tabellnr;
    public final String type;

    private Tabellnummer(String tabellnr, String type) {
        this.tabellnr = tabellnr;
        this.type     = type;
    }


}