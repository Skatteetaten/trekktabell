package ske.fastsetting.skatt.trekktabell;

public enum Tabellnummer {
    TABELL_7100(Tabelltype.VANLIG, 0, Konstanter.KLASSE1_VANLIG, "Høy"),
    TABELL_7101(Tabelltype.VANLIG, 4000, Konstanter.KLASSE1_VANLIG, "Høy"),
    TABELL_7102(Tabelltype.VANLIG, 8000, Konstanter.KLASSE1_VANLIG, "Høy"),
    TABELL_7103(Tabelltype.VANLIG, 12000, Konstanter.KLASSE1_VANLIG, "Høy"),
    TABELL_7100P(Tabelltype.PENSJONIST, 0, Konstanter.KLASSE2_VANLIG, "Lav"),
    TABELL_7200(Tabelltype.VANLIG, 0, Konstanter.KLASSE2_VANLIG, "Høy"),
    TABELL_7300(Tabelltype.STANDARDFRADRAG, 0, Konstanter.KLASSE1_VANLIG, "Høy"),
    TABELL_6300(Tabelltype.FINNMARK, 0, Konstanter.KLASSE1_FINNMARK, "Høy"),
    TABELL_6400(Tabelltype.FINNMARK, 0, Konstanter.KLASSE2_FINNMARK, "Høy"),
    TABELL_0100(Tabelltype.SJØ, 0, Konstanter.KLASSE1_VANLIG, "Ingen");

    public final Tabelltype tabelltype;
    public final int tabellFradrag;
    public final double klasseFradrag;
    public final String trygdeavgiftstype;

    private Tabellnummer(Tabelltype tabelltype, int tabellFradrag, double klasseFradrag, String trygdeavgiftstype) {
        this.tabelltype = tabelltype;
        this.tabellFradrag = tabellFradrag;
        this.klasseFradrag = klasseFradrag;
        this.trygdeavgiftstype = trygdeavgiftstype;
    }
    public boolean isVanlig() {
        return (tabelltype == Tabelltype.VANLIG) ? true : false;
    }
    public boolean isPensjonist() {
        return (tabelltype == Tabelltype.PENSJONIST) ? true : false;
    }
    public boolean isFinnmark() {
        return (tabelltype == Tabelltype.FINNMARK) ? true : false;
    }
    public boolean isStandardFradrag() {
        return (tabelltype == Tabelltype.STANDARDFRADRAG ||
                tabelltype == Tabelltype.SJØ ||
                tabelltype == Tabelltype.FINNMARK ) ? true : false;
    }
    public boolean isSjo() {
        return (tabelltype == Tabelltype.PENSJONIST) ? true : false;
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
