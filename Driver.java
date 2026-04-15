
package ovChipKaart;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Paal paal = new Paal(5.0);	// Hier geef je het instap tarief aan
		Kaart kaart = new Kaart(1234, 50.0, false, true);	// Hier geef je het pasnummer, huidige saldo, of je bent ingecheckt of niet en of je pas geldig is mee
		Opwaarderen opwaarderen = new Opwaarderen();
		Scanner sc = new Scanner(System.in);
		
		String choiseInput;	// Nieuwe variable voor scanner
		
		do {
			
			System.out.println("Uw huidige saldo is: " + kaart.getHuidigSaldo());
			System.out.println("Wilt u Inchecken | Uitchecken | Saldo Verhogen | Stoppen");	// Keuze tussen de verschillende dingen die je kunt doen
			
			choiseInput = sc.next();
			
			if (kaart.getGeldigePas() == false) {
				System.out.println("Validatie error. Probeer het opnieuw of check uw pas.");
			} else
				
				if (choiseInput.equalsIgnoreCase("inchecken")) {
				System.out.println("Bus of trein?");
				choiseInput = sc.next();
				if (choiseInput.equalsIgnoreCase("bus")) {
					paal.inchecken(kaart, 5.0);
				} else	if (choiseInput.equalsIgnoreCase("trein")) {
					paal.inchecken(kaart, 20.0);
				} else {
					System.out.println("Dit is geen optie.");
				}
				
			} else
				
			if (choiseInput.equalsIgnoreCase("uitchecken")) {
				if (kaart.getIngecheckt() == false) {
					System.out.println("U bent al uitgecheckt.");
				} else {
					paal.uitchecken(kaart, 5.0);
					System.out.println("2: " + kaart.getHuidigSaldo());
				}
					
			} else if (choiseInput.equalsIgnoreCase("Saldo verhogen")) {
				String opwaarderenChoise;
				
				opwaarderen.scannen(kaart);
				
				do {
					System.out.println("Wilt u uw saldo verhogen | aanvullen | opvragen | stoppen");
					opwaarderenChoise = sc.next();
					
					if (opwaarderenChoise.equalsIgnoreCase("verhogen")) {
						opwaarderen.opwaarderen(kaart);
					} else if (opwaarderenChoise.equalsIgnoreCase("aanvullen")) {
						// Nog doen
					} else if (opwaarderenChoise.equalsIgnoreCase("opvragen")) {
						// Nog doen
					} else {
						System.out.println("Dit is geen keuze.");
					}			
				} while (!opwaarderenChoise.equalsIgnoreCase("stoppen"));
				
			} else if (choiseInput.equalsIgnoreCase("stoppen")) {
					System.out.println("Fijne dag.");
			} else {
					System.out.println("Er was een error.");
			}
			
		} while (!choiseInput.equalsIgnoreCase("stoppen"));
		
		sc.close();
		
	}
}
