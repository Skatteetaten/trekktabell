package ske.fastsetting.skatt.trekktabell;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrekkrutineTest {

    @Test
    public void skal_returnere_0_ved_trekkgrunnlag_lik_0() {
        long beregnetTrekk = Trekkrutine.beregnTrekkForLonn(Tabellnummer.TABELL_7100, Periode.PERIODE_1_MAANED, 0L);
        assertEquals(0L, beregnetTrekk);
    }

    @Test
    public void skal_returnere_XXX_ved_tabelltype_pensjon_() throws Exception {
        long beregnetTrekk = Trekkrutine.beregnTrekkForPensjon(Tabellnummer.TABELL_7101, Periode.PERIODE_1_MAANED, 0L);
        assertEquals(0L, beregnetTrekk);

    }
}