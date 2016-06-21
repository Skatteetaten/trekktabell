package ske.fastsetting.skatt.trekktabell;

public enum Periode {
    PERIODE_1_MAANED(12.12d, 10.5d,           12d, 11d,             12d, 10.5d, 100, 79850 ),
    PERIODE_14_DAGER(26.26d, 23d,             26d, 24d,             26d, 23d,   50, 36850 ),
    PERIODE_1_UKE   (52.52d, 46d,             52d, 48d,             52d, 46d,   20, 18410 ),
    PERIODE_4_DAGER (60.60d, (60d*46d)/52d,   91d, (91d*11d)/12d,   91d, (91d*10.5d)/12d, 20, 15910 ),
    PERIODE_3_DAGER (80.80d, (80d*46d)/52d,  122d, (122d*11d)/12d, 122d, (122d*10.5d)/12d, 20, 11910 ),
    PERIODE_2_DAGER(121.20d, (120d*46d)/52d, 183d, (183d*11d)/12d, 183d, (183d*10.5d)/12d, 20, 7910 ),
    PERIODE_1_DAG  (242.40d, (240d*46d)/52d, 365d, (365d*11d)/12d, 365d, (365d*10.5d)/12d, 20, 3910 );

    public final double inntektsPeriode;
    public final double trekkPeriode;
    public final double inntektsPeriodePensjon;
    public final double trekkPeriodePensjon;
    public final double inntektsPeriodeStandardfradrag;
    public final double trekkPeriodeStandardfradrag;
    public final int    avrunding;
    public final int    maxTrekkgrunnlag;


    private Periode(double inntektsPeriode, double trekkPeriode,
                    double inntektsPeriodePensjon, double trekkPeriodePensjon,
                    double inntektsPeriodeStandardfradrag, double trekkPeriodeStandardfradrag,
                    int    avrunding,
                    int    maxTrekkgrunnlag) {

        this.inntektsPeriode = inntektsPeriode;
        this.trekkPeriode = trekkPeriode;
        this.inntektsPeriodePensjon = inntektsPeriodePensjon;
        this.trekkPeriodePensjon = trekkPeriodePensjon;
        this.inntektsPeriodeStandardfradrag = inntektsPeriodeStandardfradrag;
        this.trekkPeriodeStandardfradrag = trekkPeriodeStandardfradrag;
        this.avrunding = avrunding;
        this.maxTrekkgrunnlag = maxTrekkgrunnlag;
    }


    public double getInntektsPeriode(Tabellnummer tabellnummer) {

        if (tabellnummer.tabelltype == Tabelltype.PENSJONIST) return inntektsPeriodePensjon;
        if (tabellnummer.tabelltype == Tabelltype.VANLIG) return inntektsPeriode;

        return inntektsPeriodeStandardfradrag;
    }

    public double getTrekkPeriode(Tabellnummer tabellnummer) {

        if (tabellnummer.tabelltype == Tabelltype.PENSJONIST) return trekkPeriodePensjon;
        if (tabellnummer.tabelltype == Tabelltype.VANLIG) return trekkPeriode;

        if (tabellnummer.trekk_i_12_mnd) return inntektsPeriodeStandardfradrag; // Hvis 12-måneders-trekk, skal inntektsperioden returneres !

        return trekkPeriodeStandardfradrag;
    }


}
