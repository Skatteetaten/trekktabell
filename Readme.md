# Trekkrutine for beregning av forskuddstrekk

Disse java-klassene beregner tabelltrekk for inntektsåret 2021.

Det er metoden `beregnTabelltrekk` i klassen `Trekkrutine` som skal kalles når tabelltrekket skal beregnes.

Ønsker man hele tabellen kalles metoden `beregnHeleTabellen`. Denne returnerer et objekt med alle trekkgrunnlag/trekk, samt den overskytende prosenten som hører til den aktuelle tabellen.


## Årlige endringer
Endringene i skattesatsene for 2021 er lagt inn i klassen `Konstanter`.

I de andre klassene er det ingen endringer, bortsett fra at pakkenavnet er endret.

ArtifactId i pom-filen er også endret fra 2020 til 2021.

Siden pakkenavnet er endret vil det være litt vanskligere å se vha. git hva som er endret fra 2020. 
Denne kommandoen viser endringene i klassen Konstanter:
`git diff -M 2020 -- src/main/java/no.skatteetaten/fastsetting/skatt/trekkrutine2021/Konstanter.java src/main/java/ske/fastsetting/skatt/trekkrutine2020/Konstanter.java`