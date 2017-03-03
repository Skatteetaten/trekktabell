# trekktabell-swift

[![CI Status](http://img.shields.io/travis/aleksanderaleksic/trekktabell-swift.svg?style=flat)](https://travis-ci.org/aleksanderaleksic/trekktabell-swift)
[![Version](https://img.shields.io/cocoapods/v/trekktabell-swift.svg?style=flat)](http://cocoapods.org/pods/trekktabell-swift)
[![Platform](https://img.shields.io/cocoapods/p/trekktabell-swift.svg?style=flat)](http://cocoapods.org/pods/trekktabell-swift)
		
# Trekkrutine for beregning av forskuddstrekk#

Dette biblioteket beregner tabelltrekk for inntektsåret 2017.

Det er metoden beregnTabelltrekk i klassen Trekkrutine som skal kalles når tabelltrekket skal beregnes.

Ønsker man hele tabellen kalles metoden beregnHeleTabellen. Denne returnerer et objekt med alle trekkgrunnlag/trekk, samt den overskytende prosenten som hører til den aktuelle tabellen.

## Årlige endringer
Klassen Konstanter inneholder skattesatsene for 2017.
Denne vil bli oppdatert ved ny årsversjon

## Installasjon
trekktabell-swift er tilgjengelig gjennom [CocoaPods](http://cocoapods.org) for å installere
legg denne linjen til i PodFile:
		`pod "trekktabell-swift"`
og kjør deretter kommandoen:
		`pod install`

## Forket prosjekt
Dette bilblioteket er basert på [tabelltrekk-java](https://github.com/Skatteetaten/trekktabell) men er skrevet om til 
swift 3 slik at det kan brukes i IOS

## Utviklere
**Swift versjon:**
Aleksander Aleksic, aleksander@aleksic.no

**Java versjon:**
Per J Ristun, per.ristun@skatteetaten.no

