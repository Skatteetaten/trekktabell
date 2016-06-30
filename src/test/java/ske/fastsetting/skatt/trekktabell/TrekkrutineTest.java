package ske.fastsetting.skatt.trekktabell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TrekkrutineTest {

    @Test
    public void skal_returnere_0_ved_trekkgrunnlag_lik_0() {
        long beregnetTrekk = Trekkrutine.beregnTabellTrekk(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, 0L);
        assertEquals(0L, beregnetTrekk);
    }

    @Test
    public void trekket_skal_vaere_mindre_eller_lik_trekkgrunnlag2() throws Exception {
        //TODO lag til streams
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
        //TODO lag til streams
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
        //TODO lag til streams
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

}
