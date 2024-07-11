package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2024;

public enum Tabellnummer {
    /*
       Når argument nr 2 er et positivt tall, er det et tabellfradrag; når negativt er det et tabelltillegg.
     */
    //TODO: fjern overskytende prosent
    TABELL_7100(Tabelltype.VANLIG,     0L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7101(Tabelltype.VANLIG, 10000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7102(Tabelltype.VANLIG, 20000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7103(Tabelltype.VANLIG, 30000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7104(Tabelltype.VANLIG, 40000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7105(Tabelltype.VANLIG, 50000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7106(Tabelltype.VANLIG, 60000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7107(Tabelltype.VANLIG, 70000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7108(Tabelltype.VANLIG, 80000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7109(Tabelltype.VANLIG, 90000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7110(Tabelltype.VANLIG,100000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7111(Tabelltype.VANLIG,110000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7112(Tabelltype.VANLIG,120000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7113(Tabelltype.VANLIG,130000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7114(Tabelltype.VANLIG,140000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7115(Tabelltype.VANLIG,150000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7116(Tabelltype.VANLIG,160000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7117(Tabelltype.VANLIG,170000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7118(Tabelltype.VANLIG,180000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7119(Tabelltype.VANLIG,190000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),

    TABELL_7120(Tabelltype.VANLIG, -10000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7121(Tabelltype.VANLIG, -20000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7122(Tabelltype.VANLIG, -30000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7123(Tabelltype.VANLIG, -40000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7124(Tabelltype.VANLIG, -50000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7125(Tabelltype.VANLIG, -60000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7126(Tabelltype.VANLIG, -70000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7127(Tabelltype.VANLIG, -80000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7128(Tabelltype.VANLIG, -90000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7129(Tabelltype.VANLIG,-100000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7130(Tabelltype.VANLIG,-110000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7131(Tabelltype.VANLIG,-120000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7132(Tabelltype.VANLIG,-130000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7133(Tabelltype.VANLIG,-140000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),

    TABELL_7100P(Tabelltype.PENSJONIST,     0L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7101P(Tabelltype.PENSJONIST, 10000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7102P(Tabelltype.PENSJONIST, 20000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7103P(Tabelltype.PENSJONIST, 30000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7104P(Tabelltype.PENSJONIST, 40000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7105P(Tabelltype.PENSJONIST, 50000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7106P(Tabelltype.PENSJONIST, 60000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7107P(Tabelltype.PENSJONIST, 70000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7108P(Tabelltype.PENSJONIST, 80000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7109P(Tabelltype.PENSJONIST, 90000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7110P(Tabelltype.PENSJONIST,100000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7111P(Tabelltype.PENSJONIST,110000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7112P(Tabelltype.PENSJONIST,120000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7113P(Tabelltype.PENSJONIST,130000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7114P(Tabelltype.PENSJONIST,140000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7115P(Tabelltype.PENSJONIST,150000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7116P(Tabelltype.PENSJONIST,160000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7117P(Tabelltype.PENSJONIST,170000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7118P(Tabelltype.PENSJONIST,180000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7119P(Tabelltype.PENSJONIST,190000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),

    TABELL_7120P(Tabelltype.PENSJONIST, -10000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7121P(Tabelltype.PENSJONIST, -20000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7122P(Tabelltype.PENSJONIST, -30000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7123P(Tabelltype.PENSJONIST, -40000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7124P(Tabelltype.PENSJONIST, -50000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7125P(Tabelltype.PENSJONIST, -60000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7126P(Tabelltype.PENSJONIST, -70000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7127P(Tabelltype.PENSJONIST, -80000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7128P(Tabelltype.PENSJONIST, -90000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7129P(Tabelltype.PENSJONIST,-100000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7130P(Tabelltype.PENSJONIST,-110000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7131P(Tabelltype.PENSJONIST,-120000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7132P(Tabelltype.PENSJONIST,-130000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7133P(Tabelltype.PENSJONIST,-140000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),

// Nye tabellnr fra 2025
    TABELL_8000(Tabelltype.VANLIG,     0L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8010(Tabelltype.VANLIG, 10000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8020(Tabelltype.VANLIG, 20000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8030(Tabelltype.VANLIG, 30000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8040(Tabelltype.VANLIG, 40000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8050(Tabelltype.VANLIG, 50000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8060(Tabelltype.VANLIG, 60000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8070(Tabelltype.VANLIG, 70000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8080(Tabelltype.VANLIG, 80000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8090(Tabelltype.VANLIG, 90000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8100(Tabelltype.VANLIG,100000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8110(Tabelltype.VANLIG,110000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8120(Tabelltype.VANLIG,120000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8130(Tabelltype.VANLIG,130000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8140(Tabelltype.VANLIG,140000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8150(Tabelltype.VANLIG,150000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8160(Tabelltype.VANLIG,160000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8170(Tabelltype.VANLIG,170000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8180(Tabelltype.VANLIG,180000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8190(Tabelltype.VANLIG,190000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8200(Tabelltype.VANLIG,200000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8210(Tabelltype.VANLIG,210000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8220(Tabelltype.VANLIG,220000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8230(Tabelltype.VANLIG,230000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8240(Tabelltype.VANLIG,240000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8250(Tabelltype.VANLIG,250000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8260(Tabelltype.VANLIG,260000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8270(Tabelltype.VANLIG,270000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8280(Tabelltype.VANLIG,280000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8290(Tabelltype.VANLIG,290000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8300(Tabelltype.VANLIG,300000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8310(Tabelltype.VANLIG,310000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8320(Tabelltype.VANLIG,320000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8330(Tabelltype.VANLIG,330000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8340(Tabelltype.VANLIG,340000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8350(Tabelltype.VANLIG,350000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8360(Tabelltype.VANLIG,360000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8370(Tabelltype.VANLIG,370000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8380(Tabelltype.VANLIG,380000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8390(Tabelltype.VANLIG,390000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_8400(Tabelltype.VANLIG,400000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),

    TABELL_9010(Tabelltype.VANLIG, -10000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9020(Tabelltype.VANLIG, -20000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9030(Tabelltype.VANLIG, -30000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9040(Tabelltype.VANLIG, -40000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9050(Tabelltype.VANLIG, -50000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9060(Tabelltype.VANLIG, -60000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9070(Tabelltype.VANLIG, -70000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9080(Tabelltype.VANLIG, -80000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9090(Tabelltype.VANLIG, -90000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9100(Tabelltype.VANLIG,-100000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9110(Tabelltype.VANLIG,-110000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9120(Tabelltype.VANLIG,-120000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9130(Tabelltype.VANLIG,-130000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9140(Tabelltype.VANLIG,-140000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9150(Tabelltype.VANLIG,-150000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9160(Tabelltype.VANLIG,-160000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9170(Tabelltype.VANLIG,-170000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9180(Tabelltype.VANLIG,-180000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9190(Tabelltype.VANLIG,-190000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9200(Tabelltype.VANLIG,-200000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9210(Tabelltype.VANLIG,-210000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9220(Tabelltype.VANLIG,-220000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9230(Tabelltype.VANLIG,-230000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9240(Tabelltype.VANLIG,-240000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9250(Tabelltype.VANLIG,-250000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9260(Tabelltype.VANLIG,-260000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9270(Tabelltype.VANLIG,-270000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9280(Tabelltype.VANLIG,-280000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9290(Tabelltype.VANLIG,-290000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9300(Tabelltype.VANLIG,-300000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9310(Tabelltype.VANLIG,-310000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9320(Tabelltype.VANLIG,-320000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9330(Tabelltype.VANLIG,-330000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9340(Tabelltype.VANLIG,-340000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9350(Tabelltype.VANLIG,-350000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9360(Tabelltype.VANLIG,-360000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9370(Tabelltype.VANLIG,-370000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9380(Tabelltype.VANLIG,-380000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9390(Tabelltype.VANLIG,-390000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),
    TABELL_9400(Tabelltype.VANLIG,-400000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_INGEN),

    TABELL_7300(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_7300),
    TABELL_7350(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_7350),
    TABELL_7500(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_7500),
    TABELL_7550(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_7550),
    TABELL_7700(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Lav", true, Konstanter.OVERSKYTENDE_PROSENT_7700),

    TABELL_6300(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_6300),
    TABELL_6350(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_6350),
    TABELL_6500(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_6500),
    TABELL_6550(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_6550),
    TABELL_6700(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Lav", true, Konstanter.OVERSKYTENDE_PROSENT_6700),

    TABELL_0100(Tabelltype.SJØ, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_0100),
    TABELL_0101(Tabelltype.SJØ, 0L, Konstanter.KLASSE1_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_0101),

    TABELL_7150(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE1_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_7150),
    TABELL_7160(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_7160),
    TABELL_7170(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_7170);

    final Tabelltype tabelltype;
    final long tabellFradrag;
    final long klasseFradrag;
    final String trygdeavgiftstype;
    final boolean trekk_i_12_mnd;
    public final double overskytendeProsent; //TODO: fjern denne

    Tabellnummer(Tabelltype tabelltype, long tabellFradrag, long klasseFradrag, String trygdeavgiftstype,
            boolean trekk_i_12_mnd, double overskytendeProsent) {
        this.tabelltype = tabelltype;
        this.tabellFradrag = tabellFradrag;
        this.klasseFradrag = klasseFradrag;
        this.trygdeavgiftstype = trygdeavgiftstype;
        this.trekk_i_12_mnd = trekk_i_12_mnd;
        this.overskytendeProsent = overskytendeProsent; //TODO: fjern denne
    }

    boolean isStandardFradrag() {
        return (tabelltype == Tabelltype.STANDARDFRADRAG ||
                tabelltype == Tabelltype.SJØ ||
                tabelltype == Tabelltype.FINNMARK);
    }

    boolean ikkeTrygdeavgift() {
        return trygdeavgiftstype.equals("Ingen");
    }
    boolean lavSatsTrygdeavgift() {
        return trygdeavgiftstype.equals("Lav");
    }
}
