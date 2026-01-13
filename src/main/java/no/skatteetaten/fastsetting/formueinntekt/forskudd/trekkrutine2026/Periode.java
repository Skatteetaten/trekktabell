package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2026;

public enum Periode {
    PERIODE_1_MAANED(12.12d, 10.5d,           12d, 10.5d, 100, 200000 ),
    PERIODE_14_DAGER(26.26d, 23d,             26d, 23d,   50, 100000 ),
    PERIODE_1_UKE   (52.52d, 46d,             52d, 46d,   20, 50000 ),
    PERIODE_4_DAGER (60.60d, (60d*46d)/52d,   91d, (91d*10.5d)/12d, 20, 40000 ),
    PERIODE_3_DAGER (80.80d, (80d*46d)/52d,  122d, (122d*10.5d)/12d, 20, 30000 ),
    PERIODE_2_DAGER(121.20d, (120d*46d)/52d, 183d, (183d*10.5d)/12d, 20, 20000 ),
    PERIODE_1_DAG  (242.40d, (240d*46d)/52d, 365d, (365d*10.5d)/12d, 20, 10000 );

    final double inntektsPeriode;
    final double trekkPeriode;
    final double inntektsPeriodeStandardfradrag;
    final double trekkPeriodeStandardfradrag;
    final int    avrunding;
    final int    maxTrekkgrunnlag;


    Periode(double inntektsPeriode, double trekkPeriode,
            double inntektsPeriodeStandardfradrag, double trekkPeriodeStandardfradrag,
            int avrunding,
            int maxTrekkgrunnlag) {

        this.inntektsPeriode = inntektsPeriode;
        this.trekkPeriode = trekkPeriode;
        this.inntektsPeriodeStandardfradrag = inntektsPeriodeStandardfradrag;
        this.trekkPeriodeStandardfradrag = trekkPeriodeStandardfradrag;
        this.avrunding = avrunding;
        this.maxTrekkgrunnlag = maxTrekkgrunnlag;
    }

    double getInntektsPeriode(Tabellnummer tabellnummer) {
        if (tabellnummer.tabelltype == Tabelltype.VANLIG) return inntektsPeriode;

        return inntektsPeriodeStandardfradrag;
    }

    double getTrekkPeriode(Tabellnummer tabellnummer) {
        if (tabellnummer.tabelltype == Tabelltype.VANLIG) return trekkPeriode;

        if (tabellnummer.trekk_i_12_mnd) return inntektsPeriodeStandardfradrag; // Hvis 12-måneders-trekk, skal inntektsperioden returneres !

        return trekkPeriodeStandardfradrag;
    }

}
