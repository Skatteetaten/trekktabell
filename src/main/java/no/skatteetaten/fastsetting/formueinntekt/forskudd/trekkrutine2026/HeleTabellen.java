package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2026;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class HeleTabellen {
    public final LinkedHashMap<Long, Long> alleTrekk;
    public final BigDecimal overskytendeProsent;

    public HeleTabellen(LinkedHashMap<Long, Long> alleTrekk, BigDecimal overskytendeProsent) {
        this.alleTrekk = alleTrekk;
        this.overskytendeProsent = overskytendeProsent;
    }

}

