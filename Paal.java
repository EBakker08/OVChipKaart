
package ovChipKaart;

public class Paal {
	
//	Properties:
	private double instapTarief;
	
	
	
//	Locaties:
	Locatie groningen = new Locatie("Groningen", 10.5, 13.5);	// Groningen, Groningen
	Locatie leeuwarden = new Locatie("Leeuwarden", 8, 13);		// Leeuwarden, Friesland
	Locatie denHelder = new Locatie("Den Helder", 5, 12);		// Den Helder, Noord-Holland
	Locatie zwolle = new Locatie("Zwolle", 9.5, 9.5);			// Zwolle, Overijssel
	Locatie almere = new Locatie("Almere", 6.5, 9);				// Almere, Flevoland
	Locatie amsterdam = new Locatie("Amsterdam", 5.5, 9);		// Amsterdam, Noord-Holland
	Locatie utrecht = new Locatie("Utrecht", 6, 7.5);			// Utrecht, Utrecht
	Locatie arnhem = new Locatie("Arnhem", 8.5, 7);				// Arnhem, Gelderland
	Locatie rotterdam = new Locatie("Rotterdam", 4, 6.5);		// Rotterdam, Zuid-Holland
	Locatie nijmegen = new Locatie("Nijmegen", 8.5, 6);			// Nijmegen, Gelderland
	Locatie denBosch = new Locatie("Den Bosch", 7, 5.5);		// Den Bosch, Noord-Brabant
	Locatie tilburg = new Locatie("Tilburg", 6, 4.5);			// Tilburg, Noord-Brabant
	Locatie middelburg = new Locatie("Middelburg", 1, 4.5);		// Middelburg, Zeeland
	Locatie eindhoven = new Locatie("Eindhoven", 7.5, 4);		// Eindhoven, Noord-Brabant
	Locatie maastricht = new Locatie("Maastricht", 8, 1);		// Maastricht, Limburg
	
	
	
//	Functions:
	public Paal(double instapTarief) {
		this.instapTarief = instapTarief;
	}
	
	public void inchecken(Kaart kaart, double instapTarief) {
		this.instapTarief = instapTarief;
		
		if (kaart.getHuidigSaldo() >= instapTarief) {	// Als huidig saldo groter of gelijk is aan het gegeven instap dan:
		kaart.setSaldo(kaart.getHuidigSaldo() - instapTarief);	// het instap tarief word van het huidige saldo afgehaald,
		
		System.out.println("U bent ingecheckt.");
		System.out.println("Huidig saldo: " + kaart.getHuidigSaldo());	// Het overige saldo word uitgeprint,

		kaart.setIngechekt(true);	// Je wordt ingecheckt.
		} else if (kaart.getHuidigSaldo() < instapTarief) {	// Als huidig saldo kleiner is dan het benodigde instap tarief dan:
			System.out.println("Niet genoeg saldo.");	// Meld dat er niet genoeg saldo is,
			System.out.println(instapTarief - kaart.getHuidigSaldo() + " nog nodig");	// Er word vermeld hoeveel er nog nodig is.
		}
	}
	
	public void uitchecken(Kaart kaart) {
		double terugStortBedrag = instapTarief - maastricht.afstandAfgelegd(groningen);	// Hier geef je aan waar je instapt en uitstapt en dan word het reisbedrag van instaptarief afgehaald
		kaart.setSaldo(kaart.getHuidigSaldo() + terugStortBedrag);	// Het resterende bedrag word terug gestord naar het saldo van de kaart
		
		kaart.setIngechekt(false);	// Je wordt uitgecheckt
		
		System.out.println("U bent uitgecheckt.");
		System.out.println("Huidig Saldo: " + kaart.getHuidigSaldo());
	}
	
}
