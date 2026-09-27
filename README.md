# Little MasterMind – Eerste Minecraft plugin!

Hier vind je alle info die je nodig hebt om van start te gaan de eerste les. Begin eerst met het installeren van Minecraft Java Edition en IntelliJ.
We gebruiken Minecraft Java Edition om te modden, aangezien deze versie van Minecraft zeer open is. Daarnaast gebruiken we IntelliJ als IDE (dit betekent
"integrated development environment", een fancy woord voor een plek waar je code schrijft, uitvoert, ect.).

Hierna volg je de tutorial die hier onder beschreven staat tot je de basis-syntax van Java (dit is de taal die we gebruiken) een beetje onder de knie hebt.

---

## 1. Installeren van Minecraft en IntelliJ

- Installeer Minecraft via https://www.minecraft.net/en-us/download
  - Als je een eigen Minecraft Java/Bedrock account hebt mag je deze gebruiken. Als je deze niet hebt of niet zeker bent, roep de mentor erbij.
- Installeer IntelliJ via https://www.jetbrains.com/idea/download/?section=windows

Als je problemen ondervindt tijdens het installeren, laat het weten aan de mentor of schakel AI in als hulpmiddel.

Wanneer je Minecraft succesvol kan starten en IntelliJ is geopend, ga verder naar de volgende sectie.

## 2. Openen van het start project

We gaan nu de "repository" van het start project kopiëren naar jouw computer, dit wordt "clonen" genoemd. In dit project staat alles al klaar zodat jullie direct kunnen beginnen met programmeren. Als je ergens vastloopt of errors krijgt, roep de mentor er dan bij.

Kopieer eerst de link naar deze repository:
<img width="1193" height="563" alt="Screenshot 2026-09-27 at 11 53 45" src="https://github.com/user-attachments/assets/cc42137b-3835-49a9-84d5-4f54f2363b97" />

Ga nu naar IntelliJ en klik op "Clone repository" rechts boven:
<img width="1381" height="792" alt="Screenshot 2026-09-27 at 11 58 43" src="https://github.com/user-attachments/assets/1a41db34-e63a-473c-ae2c-8cd5de15ef61" />

Plak nu bij URL de gekopieerde link en klik op "Clone". Als IntelliJ vraagt of dat je het project vertrouwt, zeg dan "ja".
Het project zal zichzelf nu proberen te installeren en te openen. 

Ga nu naar de Project Structure, [hier](https://www.jetbrains.com/help/idea/project-settings-and-structure.html?keymap=Windows) staat uitgelegd hoe je daar komt.
1. Klik op het balkje naast SDK (niet Edit, het andere balkje)
2. Klik op `Download JDK`
3. Kies version `25`
4. Klik op `Download`
5. Klik op `OK` wanneer het is gedownload

Top! Alles zou nu moeten werken. Als er een terminal opent met rode tekst, heb je waarschijnlijk een error. Roep dan even de mentor erbij. Die zal je verder begeleiden doorheen het installatieproces.

## 3. Het runnen van de server en het aanpassen van de code
Je kan nu een Minecraft server starten door rechts op het olifantje te drukken, `LittleMastermind-FirstPlugin` te openen, `Tasks` te openen, `run paper` te openen en 2x te klikken op `runServer`. Er zal een console geopend worden wat de console van je Minecraft server is. Je plugin zal hier automatisch in gezet worden. Opnieuw, als je hier een error krijgt, roep de mentor er even bij of kijk of je het kan oplossen met AI.

<img width="754" height="455" alt="image" src="https://github.com/user-attachments/assets/121cdfd8-f2a6-430c-b7fc-a743b9adf92f" />

## 4. Je hebt een werkende plugin!
Als alles goed gaat, krijg je de volgende output in de console wanneer je de `runServer` task uitvoert:
<img width="1442" height="363" alt="Screenshot 2026-09-27 at 12 21 20" src="https://github.com/user-attachments/assets/4a9728b6-853c-4da6-b823-86d2f4d8c172" />

Je kan nu ook verbinden met deze server:
1. Open Minecraft Java Edition op versie `26.3` (dit is normaal de laatste versie) via de Minecraft Launcher
2. Ga naar Multiplayer
3. Klik `Add Server`
4. Voeg een naam naar keuze toe, en als Server Address: `localhost`
5. Klik op `Done`
6. Dubbel-klik de net toegevoegde server

In het bestand genaamd `Main` vind je de code voor de plugin. Dit bestand staat ergens in `src`. Probeer deze te vinden en het bericht wat wordt gestuurd wanneer de server start aan te passen. Stop eerst je server veilig door het commando `stop` in te geven in de server. Hierna kan je de server terug starten door de `runTask` taak weer uit te voeren.
