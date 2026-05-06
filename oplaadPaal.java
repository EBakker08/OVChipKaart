
package ovChipKaart;

import java.util.Scanner;

public class oplaadPaal {
	
//	Properties
	private double addBedrag;
	private int onthoudID;
	
	
	
//	Functions
	Scanner scanner = new Scanner(System.in);
	
	public void scannen(Kaart kaart) {
		this.onthoudID = kaart.getPasNummer();	// Onthoud het pasnummer van de reiziger
	}
	
	public void opwaarderen(Kaart kaart) {
		String choiseString;
		double choiseDouble;
		String scanPas;
		
		System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());	// Laat zien wat op het moment het saldo van de reiziger is.
		
		if (onthoudID == kaart.getPasNummer()) {
			System.out.println("Kies uit: 10 | 20 | 50 | Kies-bedrag");
			choiseString = scanner.next();
			
			if (choiseString.equalsIgnoreCase("10")) {	// Als de reiziger 10 kiest...
				
				System.out.println("Scan uw OV pas");	// Scan de OV pas om te verifieren dat de reiziger de goede pas gebruikt.
				scanPas = scanner.next();
				
				kaart.setSaldo(kaart.getHuidigSaldo() + 10);	// ...voeg 10 toe aan het saldo van de kaart.
				
				System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
			} else if (choiseString.equalsIgnoreCase("20")) {	// Als de reiziger 20 kiest...
				
				System.out.println("Scan uw OV pas");	// Scan de OV pas om te verifieren dat de reiziger de goede pas gebruikt.
				scanPas = scanner.next();
				
				kaart.setSaldo(kaart.getHuidigSaldo() + 20);	// ...voeg 20 toe aan het saldo van de kaart.
				
				System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
			} else if (choiseString.equalsIgnoreCase("50")) {	// Als de reiziger 50 kiest...
				
				System.out.println("Scan uw OV pas");	// Scan de OV pas om te verifieren dat de reiziger de goede pas gebruikt.
				scanPas = scanner.next();
				
				kaart.setSaldo(kaart.getHuidigSaldo() + 50);	// ...voeg 50 toe aan het saldo van de kaart.
				
				System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
			} else if (choiseString.equalsIgnoreCase("Kies-bedrag")) {	// Als de reiziger een bedrag wilt kiezen...
				System.out.println("Voer een bedrag in");
				choiseDouble = scanner.nextInt();	// ...wacht voor invoer van een bedrag naar keuze...
				
				addBedrag = choiseDouble;
				
				System.out.println("Scan uw OV pas");	// Scan de OV pas om te verifieren dat de reiziger de goede pas gebruikt.
				scanPas = scanner.next();
				
				kaart.setSaldo(kaart.getHuidigSaldo() + addBedrag);	// ...voeg bedrag toe aan het saldo van de kaart.
				
				System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
			} else {
				System.out.println("Dit is geen optie.");	// Als de reiziger iets anders kiest dan de keuzes die gegeven zijn.
			}
		} else {
			System.out.println("Pas komt niet overeen");	// Als pas niet klopt met de onthouden ID laat dan error zien.
		}
	}
	
	public void aanvullenTot(Kaart kaart) {
		double choiseDouble;
		double aanvulBedrag;
		String scanPas;
		
		if (onthoudID == kaart.getPasNummer()) {
			System.out.println("Kies bedrag");	// De reiziger kiest bedrag 
			
			choiseDouble = scanner.nextDouble();
			
			aanvulBedrag = choiseDouble - kaart.getHuidigSaldo();
			
			System.out.println("Scan uw OV pas");	// Scan de OV pas om te verifieren dat de reiziger de goede pas gebruikt.
			scanPas = scanner.next();
			
			if (aanvulBedrag <= 0) {
				System.out.println("Sorry, bedrag niet mogelijk");	// Als de reiziger een bedrag kiest onder het bedrag dat hij/zij al heeft, geef een error.
			} else {
				kaart.setSaldo(kaart.getHuidigSaldo() + aanvulBedrag);
				System.out.println("Huidig saldo: " + kaart.getHuidigSaldo());	// Anders vul het bedrag aan tot wat er aangegeven is.
			}
		} else {
			System.out.println("Pas komt niet overeen");	// Als de pas niet overeenkomt met de pas die onthouden is, geef een error.
		}
	}
	
	public void saldo(Kaart kaart) {
		System.out.println("Uw huidige saldo is: " + kaart.getHuidigSaldo());	// Laat het huidige saldo dat op de kaart staat zien.
	}
	
	public void stoppen(Kaart kaart) {
		onthoudID = 0;	// Reset het ID dat onthouden wordt.
		System.out.println("Fijne dag");
	}
}
