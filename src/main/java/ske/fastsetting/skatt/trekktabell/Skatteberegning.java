package ske.fastsetting.skatt.trekktabell;

public class Skatteberegning {

    public static double beregnKommuneskatt(double alminneligInntektAar) {
        return alminneligInntektAar > 0 ? alminneligInntektAar * Konstanter.SKATTORE / 100 : 0d;
    }

    public static double beregnFelleseskatt(Tabellnummer tabellnummer, double alminneligInntektAar) {
        if (alminneligInntektAar < 0)
            return 0d;

        return tabellnummer.isFinnmark() ? alminneligInntektAar * Konstanter.FELLES_SKATT_FINNMARK / 100 :
                alminneligInntektAar * Konstanter.FELLES_SKATT_VANLIG / 100;
    }

    public static double beregnTrinnskatt(Tabellnummer tabellnummer, double personInntektAar) {
        if (personInntektAar < Konstanter.TRINN1)
            return 0d;

        double prosentTrinn3 = 0d;
        if (tabellnummer.isFinnmark())
            prosentTrinn3 = Konstanter.TRINNSKATT_PROSENT3_FINNMARK;
        else
            prosentTrinn3 = Konstanter.TRINNSKATT_PROSENT3;

        double trinnskatt = 0d;

        if (personInntektAar < Konstanter.TRINN2) {
            trinnskatt = (personInntektAar - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100;
            System.out.println("Trinnskatt1 : " + trinnskatt);
            return trinnskatt;
        }

        if (personInntektAar < Konstanter.TRINN3) {
            trinnskatt = ((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                    + ((personInntektAar - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100);
            System.out.println("Trinnskatt2 : " + trinnskatt);
            return trinnskatt;
        }

        if (personInntektAar < Konstanter.TRINN4) {
            trinnskatt =  ((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                    + ((Konstanter.TRINN3 - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100)
                    + ((personInntektAar - Konstanter.TRINN3) * prosentTrinn3 / 100);
            System.out.println("Trinnskatt3 : " + trinnskatt);
            return trinnskatt;
        }
        trinnskatt = ((Konstanter.TRINN2 - Konstanter.TRINN1) * Konstanter.PROSENT_TRINN1 / 100)
                + ((Konstanter.TRINN3 - Konstanter.TRINN2) * Konstanter.PROSENT_TRINN2 / 100)
                + ((Konstanter.TRINN4 - Konstanter.TRINN3) * prosentTrinn3 / 100)
                + ((personInntektAar - Konstanter.TRINN4) * Konstanter.PROSENT_TRINN4 / 100);
        System.out.println("Trinnskatt4 : " + trinnskatt);
        return trinnskatt;
    }

    public static double beregnTrygdeavgift(Tabellnummer tabellnummer, double personInntektAar) {

        if (personInntektAar < Konstanter.AVG_FRI_TRYGDEAVGIFT ) return 0d;
        if (tabellnummer.ikkeTrygdeavgift()) return 0d;

        double trygdeavgift = 0d;
        if (tabellnummer.lavSatsTrygdeavgift()) {
            if (personInntektAar > Konstanter.LAV_GRENSE_TRYGDEAVGIFT)
                trygdeavgift = personInntektAar * Konstanter.LAV_TRYGDEAVG_PROSENT / 100;
            else
                trygdeavgift = (personInntektAar - Konstanter.AVG_FRI_TRYGDEAVGIFT) * Konstanter.TRYGDE_PROSENT / 100;
        }
        if (personInntektAar > Konstanter.HOY_GRENSE_TRYGDEAVGIFT)
            trygdeavgift = personInntektAar * Konstanter.HOY_TRYGDEAVG_PROSENT / 100;
        else
            trygdeavgift = (personInntektAar - Konstanter.AVG_FRI_TRYGDEAVGIFT) * Konstanter.TRYGDE_PROSENT / 100;
        System.out.println("Trygdeavgift = " + trygdeavgift);

        return trygdeavgift;
    }

}
