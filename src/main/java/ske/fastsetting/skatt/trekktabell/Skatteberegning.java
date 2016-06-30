package ske.fastsetting.skatt.trekktabell;

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

    static long beregnTrinnskatt(Tabellnummer tabellnummer, double personInntektAar) {
        if (personInntektAar < Konstanter.TRINN1) {
            return 0L;
        }

        double prosentTrinn3;
        if (tabellnummer.tabelltype == Tabelltype.FINNMARK) {
            prosentTrinn3 = Konstanter.TRINNSKATT_PROSENT3_FINNMARK;
        } else {
            prosentTrinn3 = Konstanter.TRINNSKATT_PROSENT3;
        }

        double trinnskatt;

        //TODO lag forklarende metodenavn
        if (personInntektAar < Konstanter.TRINN2) {
            trinnskatt = (personInntektAar - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100;
            return Math.round(trinnskatt);
        }

        if (personInntektAar < Konstanter.TRINN3) {
            trinnskatt = ((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                    + ((personInntektAar - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100);
            return Math.round(trinnskatt);
        }

        if (personInntektAar < Konstanter.TRINN4) {
            trinnskatt = ((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                    + ((Konstanter.TRINN3 - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100)
                    + ((personInntektAar - Konstanter.TRINN3) * prosentTrinn3 / 100);
            return Math.round(trinnskatt);
        }
        trinnskatt = ((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                + ((Konstanter.TRINN3 - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100)
                + ((Konstanter.TRINN4 - Konstanter.TRINN3) * prosentTrinn3 / 100)
                + ((personInntektAar - Konstanter.TRINN4) * Konstanter.PROSENT_TRINN4 / 100);
        return Math.round(trinnskatt);
    }

    static long beregnTrygdeavgift(Tabellnummer tabellnummer, double personInntektAar) {

        if (personInntektAar < Konstanter.AVG_FRI_TRYGDEAVGIFT) {
            return 0L;
        }
        if (tabellnummer.ikkeTrygdeavgift()) {
            return 0L;
        }
//TODO metodenavn
        double trygdeavgift;
        if (tabellnummer.lavSatsTrygdeavgift()) {
            if (personInntektAar > Konstanter.LAV_GRENSE_TRYGDEAVGIFT) {
                trygdeavgift = personInntektAar * Konstanter.LAV_TRYGDEAVG_PROSENT / 100;
            } else {
                trygdeavgift = (personInntektAar - Konstanter.AVG_FRI_TRYGDEAVGIFT) * Konstanter.TRYGDE_PROSENT / 100;
            }
            return Math.round(trygdeavgift);
        }
        if (personInntektAar > Konstanter.HOY_GRENSE_TRYGDEAVGIFT) {
            trygdeavgift = personInntektAar * Konstanter.HOY_TRYGDEAVG_PROSENT / 100;
        } else {
            trygdeavgift = (personInntektAar - Konstanter.AVG_FRI_TRYGDEAVGIFT) * Konstanter.TRYGDE_PROSENT / 100;
        }

        return Math.round(trygdeavgift);
    }

    static long beregnOverskytendeTrekk(Tabellnummer tabellnummer, Periode periode, double avrundetTrekkgrunnlag) {

        if (periode.maxTrekkgrunnlag > avrundetTrekkgrunnlag) {
            return 0;
        }

        double overskytendeTrekk =
                (avrundetTrekkgrunnlag - periode.maxTrekkgrunnlag) * tabellnummer.overskytendeProsent / 100d;

        return Math.round(overskytendeTrekk);

    }

}
