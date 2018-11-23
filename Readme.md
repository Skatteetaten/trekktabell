# Trekkrutine for beregning av forskuddstrekk

Disse java-klassene beregner tabelltrekk for inntektsåret 2019.

Det er metoden `beregnTabelltrekk` i klassen `Trekkrutine` som skal kalles når tabelltrekket skal beregnes.

Ønsker man hele tabellen kalles metoden `beregnHeleTabellen`. Denne returnerer et objekt med alle trekkgrunnlag/trekk, samt den overskytende prosenten som hører til den aktuelle tabellen.


## Årlige endringer
Endringene i skattesatsene for 2019 er lagt inn i klassen `Konstanter`.

I de andre klassene er det ingen endringer, bortsett fra at pakkenavnet er endret fra `ske.fastsetting.skatt.trekktabell2018` til `ske.fastsetting.skatt.trekkrutine2019`.

ArtifactId i pom-filen er også endret fra 2018.

Siden pakkenavnet er endret vil det være litt vanskligere å se vha. git hva som er endret fra 2018. 
Denne kommandoen viser endringene i klassen Konstanter:
`git diff -M 2018 -- src/main/java/ske/fastsetting/skatt/trekkrutine2019/Konstanter.java src/main/java/ske/fastsetting/skatt/trekktabell2018/Konstanter.java`