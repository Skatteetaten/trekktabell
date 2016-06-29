package ske.fastsetting.skatt.trekktabell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class TrekkrutineTest {

    @Test
    public void skal_returnere_0_ved_trekkgrunnlag_lik_0() {
        long beregnetTrekk = Trekkrutine.beregnTabellTrekk(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, 0L);
        assertEquals(0L, beregnetTrekk);
    }

    @Test
    public void trekket_skal_vaere_mindre_eller_lik_trekkgrunnlag2() throws Exception {
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            for (Periode periode : Periode.values()) {
                for (long trekkgrunnlag = 10L; trekkgrunnlag < 1000L; trekkgrunnlag += 166) {
                    long beregnetTrekk = Trekkrutine.beregnTabellTrekk(tabellnummer, periode, trekkgrunnlag);
                    assertTrue(trekkgrunnlag >= beregnetTrekk);
                }
            }
        }
    }

    @Test
    public void skal_ikke_ha_trygdeavgift() throws Exception {
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            for (double inntekt = 10d; inntekt < 1000000L; inntekt += 16666) {
                if (tabellnummer.ikkeTrygdeavgift()) {
                    double trygdeavgift = Skatteberegning.beregnTrygdeavgift(tabellnummer, inntekt);
                    assertEquals(0d, trygdeavgift, 0.01d);
                }
            }
        }
    }

    @Test
    public void overskytende_trekk_skal_vaere_storre_enn_0() throws Exception {
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            for (Periode periode : Periode.values()) {
                for (double trekkgrunnlag = 1000L; trekkgrunnlag < 100000L; trekkgrunnlag += 166) {
                    if (trekkgrunnlag > periode.maxTrekkgrunnlag) {
                        long overskytendetTrekk = Skatteberegning
                                .beregnOverskytendeTrekk(tabellnummer, periode, trekkgrunnlag);
                        assertTrue(overskytendetTrekk > 0L);
                    }
                }
            }
        }
    }

    @Test
    public void trekket_skal_stemme_fasit_fra_fil() throws Exception {

        URL filSti = getClass().getResource("/trekktabell.txt");
        long teller = 0;
        long okTeller = 0;
        long ikkeOkTeller = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filSti.getPath()));
            String linje = null;

            while((linje = reader.readLine()) != null) {
                teller ++;
                if (linje.charAt(0) == '0') break;

                Tabellnummer tabellnummer = null;
                if (linje.charAt(6) == '1') {
                    tabellnummer = Tabellnummer.valueOf("TABELL_" + linje.substring(1, 5) + "P" );
                } else {
                    tabellnummer = Tabellnummer.valueOf("TABELL_" + linje.substring(1, 5));
                }

                Periode periode = null;

                char c = linje.charAt(5);
                if (c == '1'  ) periode = Periode.PERIODE_1_MAANED;
                if (c == '2'  ) periode = Periode.PERIODE_14_DAGER;
                if (c == '3'  ) periode = Periode.PERIODE_1_UKE;
                if (c == '4'  ) periode = Periode.PERIODE_4_DAGER;
                if (c == '5'  ) periode = Periode.PERIODE_3_DAGER;
                if (c == '6'  ) periode = Periode.PERIODE_2_DAGER;
                if (c == '7'  ) periode = Periode.PERIODE_1_DAG;

                long grunnlag = Long.parseLong(linje.substring(7,13));
                long trekk = Long.parseLong(linje.substring(13,19));

                long beregnetTrekk = Trekkrutine.beregnTabellTrekk(tabellnummer, periode, grunnlag);

                long diff = beregnetTrekk - trekk;

                if (diff > 2 || diff < -2) {
                    if (ikkeOkTeller < 500) {
                        System.out.println(
                                "Avvik i trekk fra fasit : " + tabellnummer.toString() + ", " + periode.toString()
                                 + ", " + grunnlag + ", " + trekk + " - " + beregnetTrekk);
                    }
                    ikkeOkTeller ++;
                } else
                    okTeller ++;
            }
        }
        catch(IOException ex) {
            System.out.println (ex.toString());
            System.out.println("Fant ikke filen : " + filSti.getPath());
        }

        System.out.println("Linjer lest " + teller) ;
        System.out.println("Antall trekk kontrollert ok : " + okTeller);
        System.out.println("Antall trekk kontrollert ikke ok : " + ikkeOkTeller);
    }

}
