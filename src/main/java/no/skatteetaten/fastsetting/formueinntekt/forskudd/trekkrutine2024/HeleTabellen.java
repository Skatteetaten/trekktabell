package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2024;

import java.util.LinkedHashMap;

public class HeleTabellen {
    public final LinkedHashMap<Long, Long> alleTrekk;
    public final double overskytendeProsent;

    public HeleTabellen(LinkedHashMap<Long, Long> alleTrekk, double overskytendeProsent) {
        this.alleTrekk = alleTrekk;
        this.overskytendeProsent = overskytendeProsent;
    }

}

