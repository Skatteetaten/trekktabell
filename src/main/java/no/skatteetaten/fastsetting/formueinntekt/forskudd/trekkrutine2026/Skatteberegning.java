package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2026;

public class Skatteberegning {

    static long beregnKommuneskatt(double alminneligInntektAar) {
        return alminneligInntektAar > 0 ? Math.round(alminneligInntektAar * Konstanter.SKATTORE / 100) : 0L;
    }

    static long beregnFelleseskatt(Tabellnummer tabellnummer, double alminneligInntektAar) {
        if (alminneligInntektAar < 0) {
            return 0L;
        }

        return tabellnummer.tabelltype == Tabelltype.FINNMARK ?
                Math.round(alminneligInntektAar * Konstanter.FELLES_SKATT_FINNMARK / 100) :
                Math.round(alminneligInntektAar * Konstanter.FELLES_SKATT_VANLIG / 100);
    }

    static long beregnTrinnskatt(double personInntektAar) {
        if (personInntektAar < Konstanter.TRINN1) {
            return 0L;
        }

        if (personInntektAar < Konstanter.TRINN2) {
            return beregnTrinnskattHvisInntektUnderTrinn2(personInntektAar);
        }

        if (personInntektAar < Konstanter.TRINN3) {
            return beregnTrinnskattHvisInntektUnderTrinn3(personInntektAar);
        }

        if (personInntektAar < Konstanter.TRINN4) {
            return beregnTrinnskattHvisInntektUnderTrinn4(personInntektAar);
        }

        if (personInntektAar < Konstanter.TRINN5) {
            return beregnTrinnskattHvisInntektUnderTrinn5(personInntektAar);
        }
        return beregnTrinnskattHvisInntektOverTrinn5(personInntektAar);
    }

    private static long beregnTrinnskattHvisInntektUnderTrinn2(double personInntektAar) {
        return Math.round((personInntektAar - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100);
    }

    private static long beregnTrinnskattHvisInntektUnderTrinn3(double personInntektAar) {
        return Math.round(((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                + ((personInntektAar - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100));
    }

    private static long beregnTrinnskattHvisInntektUnderTrinn4(double personInntektAar) {
        return Math.round(((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                + ((Konstanter.TRINN3 - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100)
                + ((personInntektAar - Konstanter.TRINN3) * Konstanter.PROSENT_TRINN3 / 100));
    }

    private static long beregnTrinnskattHvisInntektUnderTrinn5(double personInntektAar) {
        return Math.round(((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
            + ((Konstanter.TRINN3 - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100)
            + ((Konstanter.TRINN4 - Konstanter.TRINN3) * Konstanter.PROSENT_TRINN3 / 100)
            + ((personInntektAar - Konstanter.TRINN4) * Konstanter.PROSENT_TRINN4 / 100));
    }

    private static long beregnTrinnskattHvisInntektOverTrinn5(double personInntektAar) {
        return Math.round(((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                + ((Konstanter.TRINN3 - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100)
                + ((Konstanter.TRINN4 - Konstanter.TRINN3) * Konstanter.PROSENT_TRINN3 / 100)
                + ((Konstanter.TRINN5 - Konstanter.TRINN4) * Konstanter.PROSENT_TRINN4 / 100)
                + ((personInntektAar - Konstanter.TRINN5) * Konstanter.PROSENT_TRINN5 / 100));
    }

    static long beregnTrygdeavgift(Tabellnummer tabellnummer, double personInntektAar) {
        if (personInntektAar < Konstanter.AVG_FRI_TRYGDEAVGIFT) {
            return 0L;
        }
        if (tabellnummer.ikkeTrygdeavgift()) {
            return 0L;
        }

        if (tabellnummer.lavSatsTrygdeavgift()) {
            return beregnTrygdeavgiftLavSats(personInntektAar);
        } else {
            return beregnTrygdeavgiftHoySats(personInntektAar);
        }
    }

    private static long beregnTrygdeavgiftLavSats(double personInntektAar) {
        if (personInntektAar > Konstanter.LAV_GRENSE_TRYGDEAVGIFT) {
            return Math.round(personInntektAar * Konstanter.LAV_TRYGDEAVG_PROSENT / 100);
        } else {
            return Math.round((personInntektAar - Konstanter.AVG_FRI_TRYGDEAVGIFT) * Konstanter.TRYGDE_PROSENT / 100);
        }
    }

    private static long beregnTrygdeavgiftHoySats(double personInntektAar) {
        if (personInntektAar > Konstanter.HOY_GRENSE_TRYGDEAVGIFT) {
            return Math.round(personInntektAar * Konstanter.HOY_TRYGDEAVG_PROSENT / 100);
        } else {
            return Math.round((personInntektAar - Konstanter.AVG_FRI_TRYGDEAVGIFT) * Konstanter.TRYGDE_PROSENT / 100);
        }
    }

}
