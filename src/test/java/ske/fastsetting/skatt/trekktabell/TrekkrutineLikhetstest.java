package ske.fastsetting.skatt.trekktabell;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.Optional;

import org.junit.Test;

public class TrekkrutineLikhetstest {

    @Test
    public void likhetstest_mot_tidligere_system() throws Exception {
        URL filSti = getClass().getResource("/trekktabellFraOpprinneligSystem.txt");

        BufferedReader reader = new BufferedReader(new FileReader(filSti.getPath()));
        String linje;

        while ((linje = reader.readLine()) != null) {

            if (linje.charAt(0) == '0') {
                break;
            }

            Tabellnummer tabellnummer = leggTilPForPensjonisttabeller(linje);
            Periode periode = hentPeriode(linje);

            long grunnlag = Long.parseLong(linje.substring(7, 13));
            long trekk = Long.parseLong(linje.substring(13, 19));

            long beregnetTrekk = Trekkrutine.beregnTabellTrekk(tabellnummer, periode, grunnlag);
            long diff = beregnetTrekk - trekk;

            int maksDiff = 2;
            if (differanseErMerEnn(maksDiff, diff)
                    && ikkeTrekkSomHarForventetAvvik(tabellnummer, periode, grunnlag)) {

                fail(String.format(
                        "Testen skal ikke ha avvik. %s, %s, grunnlag= %s, beregnet trekk= %s, trekk fra fil= %s, maks akseptert avvik= %s",
                        tabellnummer.toString(),
                        periode.toString(),
//                        periode.isPresent() ? "null" : periode.toString(),
                        grunnlag,
                        beregnetTrekk,
                        trekk,
                        maksDiff));
            }
        }
    }


    private Periode hentPeriode(String linje) {
         Periode periode = null;

        char trekkperiodeFraFil = linje.charAt(5);
        //TODO lag switch
        if (trekkperiodeFraFil == '1') {
            periode = Periode.PERIODE_1_MAANED;
        }
        if (trekkperiodeFraFil == '2') {
            periode = Periode.PERIODE_14_DAGER;
        }
        if (trekkperiodeFraFil == '3') {
            periode = Periode.PERIODE_1_UKE;
        }
        if (trekkperiodeFraFil == '4') {
            periode = Periode.PERIODE_4_DAGER;
        }
        if (trekkperiodeFraFil == '5') {
            periode = Periode.PERIODE_3_DAGER;
        }
        if (trekkperiodeFraFil == '6') {
            periode = Periode.PERIODE_2_DAGER;
        }
        if (trekkperiodeFraFil == '7') {
            periode = Periode.PERIODE_1_DAG;
        }
        return periode;
    }

    private Tabellnummer leggTilPForPensjonisttabeller(String linje) {
        Tabellnummer tabellnummer;
        if (linje.charAt(6) == '1') {
            tabellnummer = Tabellnummer.valueOf("TABELL_" + linje.substring(1, 5) + "P");
        } else {
            tabellnummer = Tabellnummer.valueOf("TABELL_" + linje.substring(1, 5));
        }
        return tabellnummer;
    }

    private boolean differanseErMerEnn(int maksDiff, long diff) {return diff > maksDiff || diff < -maksDiff;}

    private boolean ikkeTrekkSomHarForventetAvvik(Tabellnummer tabellnummer, Periode periode, long grunnlag) {
        return !(
                (tabellnummer == Tabellnummer.TABELL_7131P
                        && periode == Periode.PERIODE_1_MAANED
                        && grunnlag <= 200) ||
                        (tabellnummer == Tabellnummer.TABELL_7132P
                                && periode == Periode.PERIODE_1_MAANED
                                && grunnlag == 200));
    }

}
