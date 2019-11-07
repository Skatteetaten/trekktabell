# Trekkrutine for beregning av forskuddstrekk

Disse java-klassene beregner tabelltrekk for inntektsåret 2020.

Det er metoden `beregnTabelltrekk` i klassen `Trekkrutine` som skal kalles når tabelltrekket skal beregnes.

Ønsker man hele tabellen kalles metoden `beregnHeleTabellen`. Denne returnerer et objekt med alle trekkgrunnlag/trekk, samt den overskytende prosenten som hører til den aktuelle tabellen.


## Årlige endringer
Endringene i skattesatsene for 2020 er lagt inn i klassen `Konstanter`.

For 2020 er også tabellsprangene endret, og det er derfor også endringer i klassen `Tabellnummer`.

Vi har nå også fjernet trekktabellene for klasse 2 som ble fjernet for flere år siden.

I de andre klassene er det ingen endringer, bortsett fra at årstall i pakkenavnet er endret fra 2019 til 2020.

ArtifactId i pom-filen er også endret fra 2019 til 2020.

Siden pakkenavnet er endret vil det være litt vanskligere å se vha. git hva som er endret fra 2019. 
Denne kommandoen viser endringene i klassen Konstanter:
`git diff -M 2019 -- src/main/java/ske/fastsetting/skatt/trekkrutine2020/Konstanter.java src/main/java/ske/fastsetting/skatt/trekkrutine2019/Konstanter.java`