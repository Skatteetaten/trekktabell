package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2024;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TrekkrutineTest {

    @Test
    public void skal_returnere_0_ved_trekkgrunnlag_lik_0() {
        long beregnetTrekk = Trekkrutine.beregnTabelltrekk(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, 0L);
        assertEquals(0L, beregnetTrekk);
    }

    @Test
    public void trekket_skal_vaere_mindre_eller_lik_trekkgrunnlag2() throws Exception {
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            for (Periode periode : Periode.values()) {
                for (long trekkgrunnlag = 10L; trekkgrunnlag < 1000L; trekkgrunnlag += 166) {
                    long beregnetTrekk = Trekkrutine.beregnTabelltrekk(tabellnummer, periode, trekkgrunnlag);
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
                    long trygdeavgift = Skatteberegning.beregnTrygdeavgift(tabellnummer, inntekt);
                    assertEquals(0L, trygdeavgift);
                }
            }
        }
    }

    @Test
    public void kontrollerBeregningAvLavGrenseTrygdeavgift() throws Exception {
        long grenseTrygdeavgiftLavSats = Konstanter.beregnLavGrenseTrygdeavgift();
        assertEquals(87500L, grenseTrygdeavgiftLavSats);
    }

    @Test
    public void kontrollerBeregningAvHoyGrenseTrygdeavgift() throws Exception {
        long grenseTrygdeavgiftHoySats = Konstanter.beregnHoyGrenseTrygdeavgift();
        assertEquals(101235L, grenseTrygdeavgiftHoySats);
    }

    @Test
    public void kontrollerHeleTabellenAlle() throws Exception {
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            for (Periode periode : Periode.values()) {
                HeleTabellen heleTabellen = Trekkrutine
                    .beregnHeleTabellen(tabellnummer, periode);
                assertTrue(heleTabellen.alleTrekk.size() > 100);
//                assertTrue(heleTabellen.overskytendeProsent > 30); //TODO: Fjern denne linjen
            }
        }
    }

    @Test
    public void kontrollerAtMaxEttTrekkgrunnlagMed0ITrekkVedHeleTabellen() throws Exception {
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            for (Periode periode : Periode.values()) {
                HeleTabellen heleTabellen = Trekkrutine.beregnHeleTabellen(tabellnummer, periode);
                final long antallMed0 = heleTabellen.alleTrekk.values().stream().filter(trekk -> trekk == 0).count();
                assertTrue(antallMed0 < 2);
            }
        }
    }

    @Test
    public void merFradragGirSnillereTrekkTest() {
        Tabellnummer forrigeTabellnummer = null;
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            if (tabellnummer.name().startsWith("TABELL_8")) {
                if (forrigeTabellnummer != null) {
                    long trekk1 = Trekkrutine.beregnTabelltrekk(forrigeTabellnummer, Periode.PERIODE_1_MAANED, 80000);
                    long trekk2 = Trekkrutine.beregnTabelltrekk(tabellnummer, Periode.PERIODE_1_MAANED, 80000);
                    assertTrue(trekk1 > trekk2);
                }
                forrigeTabellnummer = tabellnummer;
            }
        }
    }

    @Test
    public void merTilleggGirMerTrekkTest() {
        Tabellnummer forrigeTabellnummer = null;
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            if (tabellnummer.name().startsWith("TABELL_9")) {
                if (forrigeTabellnummer != null) {
                    long trekk1 = Trekkrutine.beregnTabelltrekk(forrigeTabellnummer, Periode.PERIODE_1_MAANED, 80000);
                    long trekk2 = Trekkrutine.beregnTabelltrekk(tabellnummer, Periode.PERIODE_1_MAANED, 80000);
                    assertTrue(trekk1 < trekk2);
                }
                forrigeTabellnummer = tabellnummer;
            }
        }
    }

    @Test
    public void likhetstestMotGamleTabeller() {
        for (long trekkgrunnlag=1000; trekkgrunnlag < 100000; trekkgrunnlag += 1000) {
            assertEquals(Trekkrutine.beregnTabelltrekk(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, trekkgrunnlag),
                    Trekkrutine.beregnTabelltrekk(Tabellnummer.TABELL_8000, Periode.PERIODE_1_MAANED, trekkgrunnlag));
            assertEquals(Trekkrutine.beregnTabelltrekk(Tabellnummer.TABELL_7119, Periode.PERIODE_1_MAANED, trekkgrunnlag),
                    Trekkrutine.beregnTabelltrekk(Tabellnummer.TABELL_8190, Periode.PERIODE_1_MAANED, trekkgrunnlag));
        }
    }

    @Test
    public void utenOverskytendeProsentTest() {
        for (long trekkgrunnlag=9500; trekkgrunnlag < 99500; trekkgrunnlag += 1000) {
            long trekkGml = Trekkrutine.beregnTabelltrekk(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, trekkgrunnlag);
            long trekkNy  = Trekkrutine.beregnTabelltrekk(Tabellnummer.TABELL_8000, Periode.PERIODE_1_MAANED, trekkgrunnlag);
            assertEquals(trekkGml, trekkNy);
        }
    }

    @Test
    public void finnNyOverskytendeProsentTest() {
    //TODO Hvordan lage en god test på denne ?
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            double overskytendeProsentForTabell = Trekkrutine.finnOverskytendeProsentForTabell(tabellnummer);
            System.out.println("Tabell " + tabellnummer.name() + " - overskytende prosent = " + overskytendeProsentForTabell);
        }
    }

    @Test
    @Ignore
    public void trekktabellerTilManuellKontroll() throws Exception {
        FileWriter fw = new FileWriter(new File("alleTabellerFraJava.txt"));

        for (Tabellnummer tabellnr : Tabellnummer.values()) {
            for (Periode periode : Periode.values()) {

                HeleTabellen heleTabellen = Trekkrutine.beregnHeleTabellen(tabellnr, periode);

                fw.write("TABELLNR: " + tabellnr.name() + " - PERIODE: " + periode.name() + "\n");
                LinkedHashMap<Long, Long> alleTrekk = heleTabellen.alleTrekk;

                for (Long grl : alleTrekk.keySet()) {
                    Long trekk = alleTrekk.get(grl);
                    fw.write(grl + " " + trekk + "\n");
                }

                int grl = periode.maxTrekkgrunnlag + 2000;
                long trekk = Trekkrutine.beregnTabelltrekk(tabellnr, periode, grl);
                fw.write(grl + " " + trekk + "\n");
            }
        }
        fw.close();
    }

    @Test
    @Ignore
    public void trekktabellerTilFilPaaGammeltFormat() throws Exception {
        FileWriter fw = new FileWriter(new File("trekkTabellerPaaGammeltFormat.txt"));
        int teller = 0;

        for (Tabellnummer tabellnr : Tabellnummer.values()) {
            for (Periode periode : Periode.values()) {

                HeleTabellen heleTabellen = Trekkrutine.beregnHeleTabellen(tabellnr, periode);
                char per = finnPeriode(periode);
                char tabType = finnTabelltype(tabellnr.tabelltype);

                LinkedHashMap<Long, Long> alleTrekk = heleTabellen.alleTrekk;

                for (Long grl : alleTrekk.keySet()) {
                    Long trekk = alleTrekk.get(grl);
                    fw.write(
                        "1" + tabellnr.name().substring(7, 11) + per + tabType + String.format("%06d", grl) + String
                            .format("%06d", trekk) + "\n");
                    teller++;
                }
            }
        }

        fw.close();

        System.out.println("Skrevet til fil : " + teller);
    }

    @Test
    @Ignore
    public void trekktabellerTilSkatteetatenNo() throws Exception {
        FileWriter fw = new FileWriter(new File("alleTabelleneIEnFilTilSkatteetatenNo.txt"));
        int teller = 0;

        for (Tabellnummer tabellnr : Tabellnummer.values()) {
            if (aktuellTabell(tabellnr)) {
                for (Periode periode : Periode.values()) {
                    if (aktuellPeriode(tabellnr, periode)) {
                        HeleTabellen heleTabellen = Trekkrutine.beregnHeleTabellen(tabellnr, periode);
                        char per = finnPeriode(periode);
                        char tabType = finnTabelltype(tabellnr.tabelltype);

                        LinkedHashMap<Long, Long> alleTrekk = heleTabellen.alleTrekk;

                        for (Long grl : alleTrekk.keySet()) {
                            Long trekk = alleTrekk.get(grl);
                            fw.write(
                                tabellnr.name().substring(7, 11) + per + tabType + String.format("%05d", grl) + String
                                    .format("%05d", trekk) + "\r\n");
                            teller++;
                        }
                    }
                }
            }
        }

        fw.close();

        System.out.println("Skrevet til fil : " + teller);
    }

    private char finnPeriode(Periode periode) {
        switch (periode) {
        case PERIODE_1_MAANED:
            return '1';
        case PERIODE_14_DAGER:
            return '2';
        case PERIODE_1_UKE:
            return '3';
        case PERIODE_4_DAGER:
            return '4';
        case PERIODE_3_DAGER:
            return '5';
        case PERIODE_2_DAGER:
            return '6';
        case PERIODE_1_DAG:
            return '7';
        }
        throw new IllegalStateException("Ugyldig periode !");
    }

    private char finnTabelltype(Tabelltype tabelltype) {
        if (tabelltype == Tabelltype.PENSJONIST) {
            return '1';
        }
        return '0';
    }

    private boolean aktuellTabell(Tabellnummer tabellnummer) {
        String tabellnavn = tabellnummer.name();
        if (tabellnavn.startsWith("TABELL_72") || tabellnavn.startsWith("TABELL_02") || tabellnavn.startsWith("TABELL_64") ||
            tabellnavn.startsWith("TABELL_66") || tabellnavn.startsWith("TABELL_68") || tabellnavn.startsWith("TABELL_74") ||
            tabellnavn.startsWith("TABELL_76") || tabellnavn.startsWith("TABELL_78") ) {
            return false;
        }
        return true;
    }
    private boolean aktuellPeriode(Tabellnummer tabellnummer, Periode periode) {
        if (tabellnummer.tabelltype == Tabelltype.PENSJONIST) {
            return periode == Periode.PERIODE_1_MAANED;
        }
        if (tabellnummer.tabelltype == Tabelltype.SJØ) {
            return periode == Periode.PERIODE_1_MAANED || periode == Periode.PERIODE_14_DAGER ||
                periode == Periode.PERIODE_1_UKE;
        }
        return true;
    }
}
