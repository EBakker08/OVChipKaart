
package ovChipKaart;

public class Paal {
	
//	Properties:
	private double instapTarief;
	
	
	
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
	
}
