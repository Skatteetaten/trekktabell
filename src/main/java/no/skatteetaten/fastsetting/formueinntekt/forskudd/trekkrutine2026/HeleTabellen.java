package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2026;

import java.math.BigDecimal;
import java.util.Map;

public class HeleTabellen {
    public final Map<Long, Long> alleTrekk;
    public final BigDecimal overskytendeProsent;

    public HeleTabellen(Map<Long, Long> alleTrekk, BigDecimal overskytendeProsent) {
        this.alleTrekk = alleTrekk;
        this.overskytendeProsent = overskytendeProsent;
    }

}

