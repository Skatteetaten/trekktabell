package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2024;

import java.util.LinkedHashMap;

public class HeleTabellen {
    public final LinkedHashMap<Long, Long> alleTrekk;
    public final int overskytendeProsent;

    public HeleTabellen(LinkedHashMap<Long, Long> alleTrekk, int overskytendeProsent) {
        this.alleTrekk = alleTrekk;
        this.overskytendeProsent = overskytendeProsent;
    }

}

