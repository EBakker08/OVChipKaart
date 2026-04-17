
package ovChipKaart;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Paal paal = new Paal(5.0);	// Hier geef je het instap tarief aan
		Kaart kaart = new Kaart(1234, 15.0, false, true);	// Hier geef je het pasnummer, huidige saldo, of je bent ingecheckt of niet en of je pas geldig is mee
		Opwaarderen opwaarderen = new Opwaarderen();	// Dit is voor het opwaarderen
		Scanner sc = new Scanner(System.in);
		
		String choiseInput;
		
		do {	// Draai dit programma zolang de reiziger niet stoppen kiest.
			System.out.println("Wilt u Inchecken | Uitchecken | Laadpaal | Stoppen");	// Keuze tussen de verschillende dingen die je kunt doen
			
			choiseInput = sc.next();
			
			if (kaart.getGeldigePas() == false) {	// Als de kaart niet geldig is dan laat de reiziger niet door.
				System.out.println("Validatie error. Probeer het opnieuw of check uw pas.");
			} else if (choiseInput.equalsIgnoreCase("inchecken")) {	// Als reiziger inchecken kiest dan...
				System.out.println("Bus of trein?");	// ...vraag of de reiziger met bus of trein gaat.
				choiseInput = sc.next();
				if (choiseInput.equalsIgnoreCase("bus")) {
					paal.inchecken(kaart, 5.0);
				} else	if (choiseInput.equalsIgnoreCase("trein")) {
					paal.inchecken(kaart, 20.0);
				} else {
					System.out.println("Dit is geen optie.");	// Als de reiziger iets anders kiest dan geef een error mee.
				}
				
			} else if (choiseInput.equalsIgnoreCase("uitchecken")) {	// Als de reiziger uitchecken kiets dan...
				if (kaart.getIngecheckt() == false) {	// ...check of reiziger al uitgecheckt is en geef een error als dat zo is ander...
					System.out.println("U bent al uitgecheckt.");
				} else {
					paal.uitchecken(kaart);	// ...check de reiziger uit.
				}
				
			} else if (choiseInput.equalsIgnoreCase("laadpaal")) {	// Als de reiziger laadpaal kiest dan draai de do loop hier onder.
				String opwaarderenChoise;
				
				opwaarderen.scannen(kaart);	// Scan en onthoud de kaart van de reiziger.
				
				do {	// Draai deze loop zolang de reiziger niet stop kiest.
					System.out.println("Wilt u uw saldo Verhogen | Aanvullen | Opvragen | Stop");
					opwaarderenChoise = sc.next();
					
					if (opwaarderenChoise.equalsIgnoreCase("verhogen")) {	// Als de reiziger verhogen kiest draai dan opwaarderen.opwaarderen.
						opwaarderen.opwaarderen(kaart);
					} else if (opwaarderenChoise.equalsIgnoreCase("aanvullen")) {	// Als de reiziger aanvullen kiest draai dan opwaarderen.aanvullenTot.
						opwaarderen.aanvullenTot(kaart);
					} else if (opwaarderenChoise.equalsIgnoreCase("opvragen")) {	// Als de reiziger opvragen kiest draai dan opwaarderen.saldo.
						opwaarderen.saldo(kaart);
					} else if (opwaarderenChoise.equalsIgnoreCase("stop")) {	// Als de reiziger stop kiest draai dan opwaarderen.stoppen.
						opwaarderen.stoppen(kaart);
					} else {
						System.out.println("Dit is geen keuze.");	// Als de reiziger geen van deze keuzes maakt geef dan een error.
					}
				} while (!opwaarderenChoise.equalsIgnoreCase("stop"));
				
			} else if (choiseInput.equalsIgnoreCase("stoppen")) {	// Als de reiziger stoppen kiest geef dan een afsluitings bericht mee.
				System.out.println("Fijne dag.");
			} else {
				System.out.println("Er was een error.");	// Als er geen van deze keuzes wordt gemaakt geef dan een error mee.
			}
			
		} while (!choiseInput.equalsIgnoreCase("stoppen"));
		
		sc.close();	// Sluit de scanner.
		
	}
}
