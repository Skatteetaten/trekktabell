package ske.fastsetting.skatt.trekktabell;

public enum Tabellnummer {
    TABELL_7100(Tabelltype.VANLIG, 0, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7101(Tabelltype.VANLIG, 4000, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7102(Tabelltype.VANLIG, 8000, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7103(Tabelltype.VANLIG, 12000, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7100P(Tabelltype.PENSJONIST, 0, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7200(Tabelltype.VANLIG, 0, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7300(Tabelltype.STANDARDFRADRAG, 0, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_7300_7400),
    TABELL_6300(Tabelltype.FINNMARK, 0, Konstanter.KLASSE1_FINNMARK, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_6300_6400),
    TABELL_6400(Tabelltype.FINNMARK, 0, Konstanter.KLASSE2_FINNMARK, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_6300_6400),
    TABELL_0100(Tabelltype.SJØ, 0, Konstanter.KLASSE1_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_0100_0200),
    // TODO: 21.06.16 Finn på bedre navn enn SPESIAL !
    TABELL_7150(Tabelltype.SPESIAL, 0, Konstanter.KLASSE1_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_7150_7250),
    TABELL_7250(Tabelltype.SPESIAL, 0, Konstanter.KLASSE2_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_7150_7250),
    TABELL_7160(Tabelltype.SPESIAL, 0, Konstanter.KLASSE1_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_7160_7260);


    public final Tabelltype tabelltype;
    public final int tabellFradrag;
    public final double klasseFradrag;
    public final String trygdeavgiftstype;
    public final boolean trekk_i_12_mnd;
    public final int overskytendeProsent;


    private Tabellnummer(Tabelltype tabelltype, int tabellFradrag, double klasseFradrag, String trygdeavgiftstype, boolean trekk_i_12_mnd, int overskytendeProsent) {
        this.tabelltype = tabelltype;
        this.tabellFradrag = tabellFradrag;
        this.klasseFradrag = klasseFradrag;
        this.trygdeavgiftstype = trygdeavgiftstype;
        this.trekk_i_12_mnd = trekk_i_12_mnd;
        this.overskytendeProsent = overskytendeProsent;
    }
    public boolean isStandardFradrag() {
        return (tabelltype == Tabelltype.STANDARDFRADRAG ||
                tabelltype == Tabelltype.SJØ ||
                tabelltype == Tabelltype.FINNMARK ) ? true : false;
    }

    public boolean ikkeTrygdeavgift() {
        return trygdeavgiftstype.equals("Ingen") ? true : false;
    }
    public boolean lavSatsTrygdeavgift() {
        return trygdeavgiftstype.equals("Lav") ? true : false;
    }
    public boolean hoySatsTrygdeavgift() {
        return trygdeavgiftstype.equals("Høy") ? true : false;
    }


}
