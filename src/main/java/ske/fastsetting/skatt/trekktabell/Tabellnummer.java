package ske.fastsetting.skatt.trekktabell;

/**
 * Created by x00pjr on 09.06.16.
 */
public enum Tabellnummer {
    TABELL_7100("7100", "Vanlig", 0),
    TABELL_7101("7101", "Vanlig", 4000),
    TABELL_7102("7102", "Vanlig", 8000),
    TABELL_7103("7103", "Vanlig", 12000),
    TABELL_7200("7200", "Vanlig", 0),
    TABELL_7300("7300", "Standardfradrag", 0),
    tABELL_0100("0100", "Sjø" ,0);

    public final String tabellnr;
    public final String type;
    public final int tabellFradrag;

    private Tabellnummer(String tabellnr, String type, int tabellFradrag) {
        this.tabellnr = tabellnr;
        this.type     = type;
        this.tabellFradrag = tabellFradrag;
    }


}