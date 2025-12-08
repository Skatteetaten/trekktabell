# Trekkrutine for beregning av forskuddstrekk

Disse java-klassene beregner tabelltrekk for inntektsåret 2026.

Det er metoden `beregnTabelltrekk` i klassen `Trekkrutine` som skal kalles når tabelltrekket skal beregnes.

Ønsker man hele tabellen kalles metoden `beregnHeleTabellen`. Denne returnerer et objekt med alle trekkgrunnlag/trekk, samt den overskytende prosenten som hører til den aktuelle tabellen.

### Årlige endringer
Endringene i skattesatsene for 2026 er lagt inn i klassen `Konstanter`.

Pakkenavnet er endret til 2026 i alle klassene.

ArtifactId i pom-filen er også endret fra 2025 til 2026.

### Fjerne bruk av overskytende prosent
Trekkrutina har tidligere (før 2025) beregnet forskuddstrekket etter vanlige skatteregler opp til en viss grense. Etter denne grensen benyttet man en angitt prosent. For månedstabeller var denne grensen 99800.  
Dette ga unøyaktig trekk over denne grensen. Vi fjerner nå bruken av overskytende prosent, og lar trekkrutinen beregne trekket på vanlig måte også over denne grensen.  
For de som likevel av en eller annen grunn ønsker en overskytende prosent så har vi laget en metode som beregner en omtrentlig overskytende prosent for en tabell `finnOverskytendeProsentForTabell`.  
Denne bør uansett ikke benyttes på beløp som tilsvarer en årsinntekt lavere enn det høyeste trinnet på trinnskatten, for 2026 1 467 200.

