
package ovChipKaart;

import java.util.Scanner;

public class Paal {
	
//	Properties
	private double instapTarief;
	private int choiseInput;
	
	public Paal(double instapTarief) {
		this.instapTarief = instapTarief;
	}
	
//	Functions
	Scanner sc = new Scanner(System.in);
	
	public void choise() {
		System.out.println("Wilt u 1. Inchecken 2. Uitchecken 3. Saldo Verhogen");
		
		choiseInput = sc.nextInt();
	}
	
	public void inchecken(Kaart kaart) {
		if (kaart.getHuidigSaldo() >= instapTarief) {	// Als huidig saldo groter of gelijk is aan het gegeven instap dan:
		kaart.setSaldo(kaart.getHuidigSaldo() - instapTarief);	// het instap tarief word van het huidige saldo afgehaald,
		System.out.println("U bent ingecheckt.");
		System.out.println("Huidig saldo: " + kaart.getHuidigSaldo());	// Het overige saldo word uitgeprint,
		kaart.setIngechekt(true);	// Je wordt ingecheckt.
		}	else if (kaart.getHuidigSaldo() < instapTarief) {	// Als huidig saldo kleiner is dan het benodigde instap tarief dan:
			System.out.println("Niet genoeg saldo.");	// Meld dat er niet genoeg saldo is,
			System.out.println(instapTarief - kaart.getHuidigSaldo() + " nog nodig");	// Er word vermeld hoeveel er nog nodig is.
		}
	}
	
}
