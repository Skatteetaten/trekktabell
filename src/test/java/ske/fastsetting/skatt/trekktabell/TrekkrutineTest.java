package ske.fastsetting.skatt.trekktabell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TrekkrutineTest {

    @Test
    public void skal_returnere_0_ved_trekkgrunnlag_lik_0() {
        long beregnetTrekk = Trekkrutine.beregnTrekk(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, 0L);
        assertEquals(0L, beregnetTrekk);
    }

    @Test
    public void skal_returnere_XXX_ved_tabelltype_pensjon_() throws Exception {
        long beregnetTrekk = Trekkrutine.beregnTrekk(Tabellnummer.TABELL_7100P, Periode.PERIODE_1_MAANED, 0L);
        assertEquals(0L, beregnetTrekk);
    }

    @Test
    public void trekket_skal_vaere_mindre_eller_lik_trekkgrunnlag_() throws Exception {
        for (long trekkgrunnlag = 1000L; trekkgrunnlag <  100000L; trekkgrunnlag +=188) {
            long beregnetTrekk = Trekkrutine.beregnTrekk(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, trekkgrunnlag);
            assertTrue(trekkgrunnlag >= beregnetTrekk);
        }
    }



}
