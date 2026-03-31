
package ovChipKaart;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Paal paal = new Paal(4.0);	// Hier geef je het instap tarief aan
		Kaart kaart = new Kaart(1234, 20.0, false, true);	// Hier geef je het pasnummer, huidige saldo, of je bent ingecheckt of niet en of je pas geldig is mee
		Locatie arnhem = new Locatie("Arnhem", 8.5, 7);
		Locatie amsterdam = new Locatie("amsterdam", 5.5, 9);
		Locatie tilburg = new Locatie("Tilburg", 6, 4.5);
		System.out.println(arnhem.afstandAfgelegd(tilburg));
		Scanner sc = new Scanner(System.in);
		
		int choiseInput;	// Nieuwe variable voor scanner
		
		System.out.println("Uw huidige saldo is: " + kaart.getHuidigSaldo());
		System.out.println("Wilt u 1. Inchecken 2. Uitchecken 3. Saldo Verhogen?");	// Keuze tussen de verschillende dingen die je kunt doen
		choiseInput = sc.nextInt();
		
		if (kaart.getGeldigePas() == false) {
			System.out.println("Validatie error. Probeer het opnieuw of check uw pas.");
		} else	if (choiseInput == 1) {
			System.out.println("1. Bus of 2. trein?");	// Als de user 1 kiest dan word er gevraagt of hij/zij wilt inchecken met bus of trein
			choiseInput = sc.nextInt();
			
			if (choiseInput == 1) {
				paal.inchecken(kaart, 4.0);	// Als user 2 kiest dan word hij/zij ingecheckt voor bus
			} else	if (choiseInput == 2) {
				paal.inchecken(kaart, 20.0);	// Anders als user 2 kiest dan word hij/zij ingecheckt voor trein
			}
		} else {
			System.out.println("Uitchecken en Saldo verhogen worden nog toegevoegd.");
		}
		
	}
}
