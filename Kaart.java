
package ovChipKaart;

import java.util.Scanner;

public class Kaart {
	
//	Properties
	private int pasNummer;
	private double huidigSaldo;
//	private date geldigTotDatum;
	private boolean ingecheckt;
	
//	Scanner
	Scanner sc = new Scanner(System.in);
	
//	Functions
	public void inchecken(double instapTarief) {
		huidigSaldo = 5.0;	// For now.
		
		System.out.println("Wilt u 1. Inchecken 2. Uitchecken 3. Saldo Verhogen");
		
		int userInput = sc.nextInt();	// This might also need to be changed
		
//		Other two use cases haven't been made yet. Replace this later!
		if (userInput == 2 || userInput == 3) {
			System.out.println("Uitchecken en Saldo Verhogen worden nog gemaakt.");
		}
		
		if (userInput == 1) {
			if (huidigSaldo >= 4) {
				huidigSaldo = huidigSaldo - instapTarief;
				System.out.println("U bent ingecheckt.");
				System.out.println("Huidig saldo: " + huidigSaldo);
			}	else if (huidigSaldo < 4) {
				System.out.println("Niet genoeg saldo.");
				System.out.println("Saldo over: " + huidigSaldo);
			}
		}
		
	}
	
}
