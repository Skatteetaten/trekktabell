package ske.fastsetting.skatt.trekktabell;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrekkrutineTest {

    @Test
    public void skal_returnere_0_ved_trekkgrunnlag_lik_0() {
        long beregnetTrekkResultat = Trekkrutine.beregnTrekk("7300", Periode.PERIODE_1_MAANED, 0L);
        assertEquals(0L, beregnetTrekkResultat);
    }
}