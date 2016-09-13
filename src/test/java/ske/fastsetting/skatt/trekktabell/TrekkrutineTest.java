package ske.fastsetting.skatt.trekktabell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    // Samme som over, men med streams
    public void overskytende_trekk_skal_vaere_storre_enn_0_med_java8() throws Exception {
        List<Tabellnummer> tabListe = Arrays.asList(Tabellnummer.values());
        List<Periode> periodeListe = Arrays.asList(Periode.values());
        List<Double> grunnlag = DoubleStream.iterate(1000, n -> n + 166)
                .limit(1000)
                .boxed()
                .collect(Collectors.toList());

        tabListe.stream()
                .forEach(t -> {
                    periodeListe.stream()
                            .forEach(p -> {
                                grunnlag.stream()
                                        .forEach(g -> {
                                            if (g > p.maxTrekkgrunnlag) {
                                                long overskytendeTrekk = Skatteberegning
                                                        .beregnOverskytendeTrekk(t, p, g);
                                                assertTrue(overskytendeTrekk > 0L);
                                            }
                                        });
                            });
                });

    }

    @Test
    public void konntrollerBeregningAvLavGrenseTrygdeavgift() throws Exception {
        long grenseTrygdeavgiftLavSats = Konstanter.beregnLavGrenseTrygdeavgift();
        assertEquals(62374L, grenseTrygdeavgiftLavSats);
    }

    @Test
    public void konntrollerBeregningAvHoyGrenseTrygdeavgift() throws Exception {
        long grenseTrygdeavgiftHoySats = Konstanter.beregnHoyGrenseTrygdeavgift();
        assertEquals(73884L, grenseTrygdeavgiftHoySats);
    }

    @Test
    public void kontrollerHeleTabellenAlle() throws Exception {
        for (Tabellnummer tabellnummer : Tabellnummer.values()) {
            for (Periode periode : Periode.values()) {
                HeleTabellen heleTabellen = Trekkrutine
                        .beregnHeleTabellen(tabellnummer, periode);
                assertTrue(heleTabellen.alleTrekk.size() > 100);
                assertTrue(heleTabellen.overskytendeProsent > 30);
            }
        }
    }

}
