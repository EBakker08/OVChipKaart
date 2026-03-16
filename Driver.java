
package ovChipKaart;

public class Driver {

	public static void main(String[] args) {

		
		Paal paal = new Paal(4.0);	// Hier geef je het instap tarief aan
		Kaart kaart = new Kaart(1234, 3.0, false, true);	// Hier geef je het pasnummer, huidige saldo, of je bent ingecheckt of niet en of je pas geldig is mee
		
		paal.choise();
		paal.inchecken(kaart);
	}

}
