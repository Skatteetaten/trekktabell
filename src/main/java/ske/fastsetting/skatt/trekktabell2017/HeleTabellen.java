package ske.fastsetting.skatt.trekktabell2017;

import java.util.LinkedHashMap;
import java.util.Map;

public class HeleTabellen {
    public final LinkedHashMap<Long, Long> alleTrekk;
    public final int overskytendeProsent;

    public HeleTabellen(LinkedHashMap<Long, Long> alleTrekk, int overskytendeProsent) {
        this.alleTrekk = alleTrekk;
        this.overskytendeProsent = overskytendeProsent;
    }

}

