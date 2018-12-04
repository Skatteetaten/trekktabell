package ske.fastsetting.skatt.trekkrutine2019;

import java.util.EnumSet;

import javafx.scene.control.Tab;

public enum Tabellnummer {
    TABELL_7100(Tabelltype.VANLIG, 0L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7101(Tabelltype.VANLIG, 4000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7102(Tabelltype.VANLIG, 8000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7103(Tabelltype.VANLIG, 12000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7104(Tabelltype.VANLIG, 16000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7105(Tabelltype.VANLIG, 20000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7106(Tabelltype.VANLIG, 24000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7107(Tabelltype.VANLIG, 28000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7108(Tabelltype.VANLIG, 32000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7109(Tabelltype.VANLIG, 36000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7110(Tabelltype.VANLIG, 41000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7111(Tabelltype.VANLIG, 46000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7112(Tabelltype.VANLIG, 53000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7113(Tabelltype.VANLIG, 60000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7114(Tabelltype.VANLIG, 70000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7115(Tabelltype.VANLIG, 80000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7116(Tabelltype.VANLIG, 90000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7117(Tabelltype.VANLIG, 100000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7118(Tabelltype.VANLIG, 110000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7119(Tabelltype.VANLIG, 120000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7120(Tabelltype.VANLIG, -4000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7121(Tabelltype.VANLIG, -8000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7122(Tabelltype.VANLIG, -12000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7123(Tabelltype.VANLIG, -16000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7124(Tabelltype.VANLIG, -20000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7125(Tabelltype.VANLIG, -24000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7126(Tabelltype.VANLIG, -28000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7127(Tabelltype.VANLIG, -32000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7128(Tabelltype.VANLIG, -36000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7129(Tabelltype.VANLIG, -41000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7130(Tabelltype.VANLIG, -46000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7131(Tabelltype.VANLIG, -53000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7132(Tabelltype.VANLIG, -60000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7133(Tabelltype.VANLIG, -67000L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),

    TABELL_7200(Tabelltype.VANLIG, 0L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7201(Tabelltype.VANLIG, 4000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7202(Tabelltype.VANLIG, 8000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7203(Tabelltype.VANLIG, 12000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7204(Tabelltype.VANLIG, 16000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7205(Tabelltype.VANLIG, 20000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7206(Tabelltype.VANLIG, 24000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7207(Tabelltype.VANLIG, 28000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7208(Tabelltype.VANLIG, 32000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7209(Tabelltype.VANLIG, 36000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7210(Tabelltype.VANLIG, 41000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7211(Tabelltype.VANLIG, 46000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7212(Tabelltype.VANLIG, 53000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7213(Tabelltype.VANLIG, 60000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7214(Tabelltype.VANLIG, 70000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7215(Tabelltype.VANLIG, 80000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7216(Tabelltype.VANLIG, 90000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7217(Tabelltype.VANLIG, 100000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7218(Tabelltype.VANLIG, 110000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7219(Tabelltype.VANLIG, 120000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7220(Tabelltype.VANLIG, -4000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7221(Tabelltype.VANLIG, -8000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7222(Tabelltype.VANLIG, -12000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7223(Tabelltype.VANLIG, -16000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7224(Tabelltype.VANLIG, -20000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7225(Tabelltype.VANLIG, -24000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7226(Tabelltype.VANLIG, -28000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7227(Tabelltype.VANLIG, -32000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7228(Tabelltype.VANLIG, -36000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7229(Tabelltype.VANLIG, -41000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7230(Tabelltype.VANLIG, -46000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7231(Tabelltype.VANLIG, -53000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7232(Tabelltype.VANLIG, -60000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),
    TABELL_7233(Tabelltype.VANLIG, -67000L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_VANLIG),

    TABELL_7100P(Tabelltype.PENSJONIST, 0L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7101P(Tabelltype.PENSJONIST, 4000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7102P(Tabelltype.PENSJONIST, 8000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7103P(Tabelltype.PENSJONIST, 12000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7104P(Tabelltype.PENSJONIST, 16000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7105P(Tabelltype.PENSJONIST, 20000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7106P(Tabelltype.PENSJONIST, 24000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7107P(Tabelltype.PENSJONIST, 28000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7108P(Tabelltype.PENSJONIST, 32000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7109P(Tabelltype.PENSJONIST, 36000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7110P(Tabelltype.PENSJONIST, 41000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7111P(Tabelltype.PENSJONIST, 46000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7112P(Tabelltype.PENSJONIST, 53000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7113P(Tabelltype.PENSJONIST, 60000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7114P(Tabelltype.PENSJONIST, 70000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7115P(Tabelltype.PENSJONIST, 80000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7116P(Tabelltype.PENSJONIST, 90000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7117P(Tabelltype.PENSJONIST, 100000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7118P(Tabelltype.PENSJONIST, 110000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7119P(Tabelltype.PENSJONIST, 120000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7120P(Tabelltype.PENSJONIST, -4000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7121P(Tabelltype.PENSJONIST, -8000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7122P(Tabelltype.PENSJONIST, -12000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7123P(Tabelltype.PENSJONIST, -16000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7124P(Tabelltype.PENSJONIST, -20000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7125P(Tabelltype.PENSJONIST, -24000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7126P(Tabelltype.PENSJONIST, -28000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7127P(Tabelltype.PENSJONIST, -32000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7128P(Tabelltype.PENSJONIST, -36000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7129P(Tabelltype.PENSJONIST, -41000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7130P(Tabelltype.PENSJONIST, -46000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7131P(Tabelltype.PENSJONIST, -53000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7132P(Tabelltype.PENSJONIST, -60000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7133P(Tabelltype.PENSJONIST, -67000L, Konstanter.KLASSE1_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),

    TABELL_7200P(Tabelltype.PENSJONIST, 0L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7201P(Tabelltype.PENSJONIST, 4000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7202P(Tabelltype.PENSJONIST, 8000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7203P(Tabelltype.PENSJONIST, 12000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7204P(Tabelltype.PENSJONIST, 16000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7205P(Tabelltype.PENSJONIST, 20000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7206P(Tabelltype.PENSJONIST, 24000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7207P(Tabelltype.PENSJONIST, 28000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7208P(Tabelltype.PENSJONIST, 32000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7209P(Tabelltype.PENSJONIST, 36000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7210P(Tabelltype.PENSJONIST, 41000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7211P(Tabelltype.PENSJONIST, 46000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7212P(Tabelltype.PENSJONIST, 53000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7213P(Tabelltype.PENSJONIST, 60000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7214P(Tabelltype.PENSJONIST, 70000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7215P(Tabelltype.PENSJONIST, 80000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7216P(Tabelltype.PENSJONIST, 90000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7217P(Tabelltype.PENSJONIST, 100000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7218P(Tabelltype.PENSJONIST, 110000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7219P(Tabelltype.PENSJONIST, 120000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7220P(Tabelltype.PENSJONIST, -4000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7221P(Tabelltype.PENSJONIST, -8000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7222P(Tabelltype.PENSJONIST, -12000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7223P(Tabelltype.PENSJONIST, -16000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7224P(Tabelltype.PENSJONIST, -20000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7225P(Tabelltype.PENSJONIST, -24000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7226P(Tabelltype.PENSJONIST, -28000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7227P(Tabelltype.PENSJONIST, -32000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7228P(Tabelltype.PENSJONIST, -36000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7229P(Tabelltype.PENSJONIST, -41000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7230P(Tabelltype.PENSJONIST, -46000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7231P(Tabelltype.PENSJONIST, -53000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7232P(Tabelltype.PENSJONIST, -60000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),
    TABELL_7233P(Tabelltype.PENSJONIST, -67000L, Konstanter.KLASSE2_VANLIG, "Lav", false, Konstanter.OVERSKYTENDE_PROSENT_PENSJONIST),

    TABELL_7300(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_7300_7400),
    TABELL_7400(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE2_VANLIG, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_7300_7400),
    TABELL_7350(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_7350_7450),
    TABELL_7450(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE2_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_7350_7450),
    TABELL_7500(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_7500_7600),
    TABELL_7600(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE2_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_7500_7600),
    TABELL_7550(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_7550_7650),
    TABELL_7650(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE2_VANLIG, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_7550_7650),
    TABELL_7700(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE1_VANLIG, "Lav", true, Konstanter.OVERSKYTENDE_PROSENT_7700_7800),
    TABELL_7800(Tabelltype.STANDARDFRADRAG, 0L, Konstanter.KLASSE2_VANLIG, "Lav", true, Konstanter.OVERSKYTENDE_PROSENT_7700_7800),

    TABELL_6300(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_6300_6400),
    TABELL_6400(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE2_FINNMARK, "Høy", false, Konstanter.OVERSKYTENDE_PROSENT_6300_6400),
    TABELL_6350(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_6350_6450),
    TABELL_6450(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE2_FINNMARK, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_6350_6450),
    TABELL_6500(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_6500_6600),
    TABELL_6600(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE2_FINNMARK, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_6500_6600),
    TABELL_6550(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_6550_6650),
    TABELL_6650(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE2_FINNMARK, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_6550_6650),
    TABELL_6700(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE1_FINNMARK, "Lav", true, Konstanter.OVERSKYTENDE_PROSENT_6700_6800),
    TABELL_6800(Tabelltype.FINNMARK, 0L, Konstanter.KLASSE2_FINNMARK, "Lav", true, Konstanter.OVERSKYTENDE_PROSENT_6700_6800),

    TABELL_0100(Tabelltype.SJØ, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_0100_0200),
    TABELL_0200(Tabelltype.SJØ, 0L, Konstanter.KLASSE2_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_0100_0200),
    TABELL_0101(Tabelltype.SJØ, 0L, Konstanter.KLASSE1_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_0101_0201),
    TABELL_0201(Tabelltype.SJØ, 0L, Konstanter.KLASSE2_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_0101_0201),

    TABELL_7150(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE1_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_7150_7250),
    TABELL_7250(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE2_VANLIG, "Høy", true, Konstanter.OVERSKYTENDE_PROSENT_7150_7250),
    TABELL_7160(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_7160_7260),
    TABELL_7260(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE2_VANLIG, "Ingen", true, Konstanter.OVERSKYTENDE_PROSENT_7160_7260),
    TABELL_7170(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE1_VANLIG, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_7170_7270),
    TABELL_7270(Tabelltype.SPESIAL, 0L, Konstanter.KLASSE2_VANLIG, "Ingen", false, Konstanter.OVERSKYTENDE_PROSENT_7170_7270);

    final Tabelltype tabelltype;
    final long tabellFradrag;
    final long klasseFradrag;
    final String trygdeavgiftstype;
    final boolean trekk_i_12_mnd;
    public final int overskytendeProsent;

    Tabellnummer(Tabelltype tabelltype, long tabellFradrag, long klasseFradrag, String trygdeavgiftstype,
            boolean trekk_i_12_mnd, int overskytendeProsent) {
        this.tabelltype = tabelltype;
        this.tabellFradrag = tabellFradrag;
        this.klasseFradrag = klasseFradrag;
        this.trygdeavgiftstype = trygdeavgiftstype;
        this.trekk_i_12_mnd = trekk_i_12_mnd;
        this.overskytendeProsent = overskytendeProsent;
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
