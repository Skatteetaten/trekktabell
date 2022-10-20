package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2023;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import static org.junit.Assert.fail;

public class TrekkrutineLikhetsTest {

    @Test
    public void likhetstest_mot_annen_kilde() throws Exception {
        URL filSti = getClass().getResource("/trekktabellerFraAnnenKilde.txt");

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

            long beregnetTrekk = Trekkrutine.beregnTabelltrekk(tabellnummer, periode, grunnlag);
            long diff = beregnetTrekk - trekk;

            int maksDiff = 2;
            if (differanseErMerEnn(maksDiff, diff)
                    &! kjenteFeilICobolRutinen(tabellnummer, periode, grunnlag)) {

                fail(String.format(
                        "Testen skal ikke ha avvik. %s, %s, grunnlag= %s, beregnet trekk= %s, trekk fra fil= %s, maks akseptert avvik= %s",
                        tabellnummer.toString(),
                        periode.toString(),
                        grunnlag,
                        beregnetTrekk,
                        trekk,
                        maksDiff));
            }
        }
    }

    private Periode hentPeriode(String linje) {
        char trekkperiodeFraFil = linje.charAt(5);

        switch (trekkperiodeFraFil) {
        case '1':
            return Periode.PERIODE_1_MAANED;
        case '2':
            return Periode.PERIODE_14_DAGER;
        case '3':
            return Periode.PERIODE_1_UKE;
        case '4':
            return Periode.PERIODE_4_DAGER;
        case '5':
            return Periode.PERIODE_3_DAGER;
        case '6':
            return Periode.PERIODE_2_DAGER;
        case '7':
            return Periode.PERIODE_1_DAG;
        }

        throw new IllegalStateException("Ugyldig periode i filen !");
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

    private boolean differanseErMerEnn(int maksDiff, long diff) {
        return diff > maksDiff || diff < -maksDiff;
    }

    private boolean kjenteFeilICobolRutinen(Tabellnummer tabellnummer, Periode periode, long grunnlag) {
        if (tabellnummer == Tabellnummer.TABELL_7131P
                && periode == Periode.PERIODE_1_MAANED
                && grunnlag <= 200)
            return true;
        if (tabellnummer == Tabellnummer.TABELL_7132P
                && periode == Periode.PERIODE_1_MAANED
                && grunnlag == 200)
            return true;
        return false;
    }

}
