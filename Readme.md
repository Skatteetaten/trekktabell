<h1>Trekkrutine for beregning av forskuddstrekk</h1>

Disse java-klassene beregner tabelltrekk for inntektsåret 2016, og vil erstatte Cobol-versjonen som gjør dette i dag.
Det er metoden beregnTabelltrekk i klassen Trekkrutine som skal kalles når tabelltrekket skal beregnes.

For 2017 vil både Cobol- og java-versjonen bli tilgjengeliggjort, men fra 2018 vil trekkrutinen kun foreligge i java.


<h2>Årlige endringer</h2>
Klassen Konstanter inneholder skattesatsene for 2016.
Ved normale endringer i skattesatsene, vil det kun være i denne klassen det må rettes ved ny årsversjon.


<h2>Likhetstest mot Cobol-rutinen</h2>
Filen trekkTabellFraOpprinneligSystem er produsert av det opprinnelige Cobol-programmet.
I test-klassen TrekkrutineLikhetstest benyttes denne filen til å kontrollere at det beregnede trekket stemmer overens
med trekket fra Cobol-programmet.

Det er imidlertid enkelte avvik fra Cobol-programmet, og det er 2 årsaker til dette:
1.     I Cobol-programmet ble de enkelte delskattene ikke avrundet før de ble summert sammen. Det korrekte er at disse skal avrundes hver for seg før summering, og dette gjøres i java-versjonen. Dette vil kunne utgjøre et avvik på inntil kr 2.
2.     For de laveste beløpene på månedstabell for tabellnummer 7131P og 7132P var det en feil i beregningen av minstefradrag i Cobol-programmet. Dette er rettet i java-versjonen.

Begge disse avvikene er håndtert i test-klassen TrekkrutineLikhetstest.
