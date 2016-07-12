<h1>Trekkrutine for beregning av forskuddstrekk</h1>

Disse java-klassene beregner tabelltrekk for inntektsåret 2016, og er ment å skulle erstatte cobol-programmet som
gjør dette i dag. Det er metoden beregnTabelltrekk i klassen Trekkrutine som skal kalles når tabelltrekket skal beregnes.

For 2017 vil både cobol- og java-versjonen bli tilgjengeliggjort, men fra 2018 vil trekkrutinen kun foreligge i java.


<h2>Årlige endringer</h2>
Klassen Konstanter inneholder skattesatsene for 2016.
Ved normale endringer i skattesatsene, vil det kun være i denne klassen det må rettes ved ny årsversjon.

(Ny branch i Git for hver år ?)


<h2>Likhetstest mot Cobol-rutinen</h2>
Filen trekkTabellFraOpprinneligSystem er produsert av det opprinnelige cobol-programmet.
I test-klassen TrekkrutineLikhetstest benyttes denne filen til å kontrollere at det beregnede trekket stemmer overens
med trekket fra cobol-programmet.

Det er imidlertid enkelte avvik fra cobol-programmet, og det er 2 årsaker til dette:
1. I cobol-programmet ble de enkelte delskattene ikke avrundet før de ble summert sammen. Det korrekte er at disse skal
avrundes hver for seg før summering, og dette gjøres i java-versjonen. Dette vil kunne utgjøre et avvik på inntil kr 2.
2. For de laveste beløpene på månedstabell for tabellnummer 7131P og 7132P var det en feil beregningene (minstefradrag
ble feil)i cobol-programmet. Dette er rettet i java-versjonen.

Begge disse avvik er håndert i test-klassen TrekkrutineLikhetstest.


