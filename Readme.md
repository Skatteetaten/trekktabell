# Trekkrutine for beregning av forskuddstrekk

Disse java-klassene beregner tabelltrekk for inntektsåret 2024.

Det er metoden `beregnTabelltrekk` i klassen `Trekkrutine` som skal kalles når tabelltrekket skal beregnes.

Ønsker man hele tabellen kalles metoden `beregnHeleTabellen`. Denne returnerer et objekt med alle trekkgrunnlag/trekk, samt den overskytende prosenten som hører til den aktuelle tabellen.

## Endringer for 2025
Fra 2025 vil det bli gjort større endringer i trekkrutinen enn normalt.
Denne versjonen/branchen inneholder disse endringene, men med satsene for 2024, siden satsene for 2025 ennå ikke foreligger.

### Nye tabellnummer
Dagens nummerserie fra 7100 - 7133 ersattes av tabellnumrene 8000 - 9400  
8000 - 8400 Fradragstabeller fra 0 - 400 000  
9010 - 9400 Tilleggstabeller fra 10000 - 400 000

Vi beholder 10000 i tabellsprang, men lar siste siffer være ubenyttet (alltid 0).
For fradragstabellene viser de 3 siste siffer inntektsfradraget som er innarbeidet i tabellen i hele 1000.
For tilleggstabellene tilsvarende inntektstillegg.
Feks. tabellnr 8010 har innarbeidet et inntektsfradrag på 10 000, 8020 et inntektsfradrag på 20 000, osv. og tabellnr 8400 har et inntektsfradrag på 400 000.
Tilsvarende inntektstillegg for tilleggstabellene

Spesialtabellene (7150-7700, 6300-6700 og 0100-0101) beholdes uendret.

Alle de ordinære trekktabellene finnes i 2 varianter, trekktabell for lønn og trekktabell for pensjon.
Selv om det neppe er behov for denne utvidelsen for trekktabellene for pensjon, så innfører vi den nye nummerserien også for pensjonisttabellene.

### Fjerne bruk av overskytende prosent
Trekkrutina har beregnet forskuddstrekket etter vanlige skatteregler opp til en viss grense. Etter denne grensen benyttet man en angitt prosent. For månedstabeller var denne grensen 99800.  
Dette ga unøyaktig trekk over denne grensen. Vi fjerner nå bruken av overskytende prosent, og lar trekkrutinen beregne trekket på vanlig måte også over denne grensen.  
For de som likevel av en eller annen grunn ønsker en overskytende prosent så har vi laget en metode som beregner en omtrentlig overskytende prosent for en tabell `finnOverskytendeProsentForTabell`.  
Denne bør uansett ikke benyttes på beløp som tilsvarer en årsinntekt lavere enn det høyeste trinnet på trinnskatten, for 2024 1 350 000.

## Årlige endringer (dette gjelder endringene som ble gjort da 2024-versjonen ble laget)
Endringene i skattesatsene for 2024 er lagt inn i klassen `Konstanter`.

I de andre klassene er det ingen endringer, bortsett fra at pakkenavnet er endret.

ArtifactId i pom-filen er også endret fra 2023 til 2024.

