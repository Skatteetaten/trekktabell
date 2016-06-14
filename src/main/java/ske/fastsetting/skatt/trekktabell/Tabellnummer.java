package ske.fastsetting.skatt.trekktabell;

/**
 * Created by x00pjr on 09.06.16.
 */
public enum Tabellnummer {
    TABELL_7100("7100", "Vanlig", 0, Konstanter.KLASSE1_VANLIG),
    TABELL_7101("7101", "Vanlig", 4000, Konstanter.KLASSE1_VANLIG),
    TABELL_7102("7102", "Vanlig", 8000, Konstanter.KLASSE1_VANLIG),
    TABELL_7103("7103", "Vanlig", 12000, Konstanter.KLASSE1_VANLIG),
    TABELL_7200("7200", "Vanlig", 0, Konstanter.KLASSE2_VANLIG),
    TABELL_7300("7300", "Standardfradrag", 0, Konstanter.KLASSE1_VANLIG),
    TABELL_6300("6300", "Finnmark", 0, Konstanter.KLASSE1_FINNMARK),
    TABELL_0100("0100", "Sjø" ,0, Konstanter.KLASSE1_VANLIG);

    public final String tabellnr;
    public final String type;
    public final int tabellFradrag;
    public final double klasseFradrag;

    private Tabellnummer(String tabellnr, String type, int tabellFradrag, double klasseFradrag) {
        this.tabellnr = tabellnr;
        this.type     = type;
        this.tabellFradrag = tabellFradrag;
        this.klasseFradrag = klasseFradrag;
    }


}