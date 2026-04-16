
package ovChipKaart;

import java.util.Scanner;

public class Opwaarderen {
//	Properties
	private double addBedrag;	// Not sure
	private int onthoudID;	// Not sure
	
	
	
//	Functions
	Scanner scanner = new Scanner(System.in);
	
	public void scannen(Kaart kaart) {
		this.onthoudID = kaart.getPasNummer();
//		System.out.println(onthoudID);
	}
	
	public void opwaarderen(Kaart kaart) {
		String choiseString;
		double choiseDouble;
		String scanPas;
		
		System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
		
		System.out.println("Scan uw OV pas");
		scanPas = scanner.next();
		
		if (onthoudID == kaart.getPasNummer()) {
			System.out.println("Kies uit: 10 | 20 | 50 | Kies-bedrag");
			choiseString = scanner.next();
			
			if (choiseString.equalsIgnoreCase("10")) {
				kaart.setSaldo(kaart.getHuidigSaldo() + 10);
				
				System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
			} else if (choiseString.equalsIgnoreCase("20")) {
				kaart.setSaldo(kaart.getHuidigSaldo() + 20);
				
				System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
			} else if (choiseString.equalsIgnoreCase("50")) {
				kaart.setSaldo(kaart.getHuidigSaldo() + 50);
				
				System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
			} else if (choiseString.equalsIgnoreCase("Kies-bedrag")) {
				System.out.println("Voer een bedrag in");
				choiseDouble = scanner.nextInt();
				
				addBedrag = choiseDouble;
				
				kaart.setSaldo(kaart.getHuidigSaldo() + addBedrag);
				
				System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
			} else {
				System.out.println("Dit is geen optie.");
			}
		} else {
			System.out.println("Pas komt niet overeen");
		}
	}
	
	public void aanvullenTot(Kaart kaart) {
		double choiseDouble;
		double aanvulBedrag;
		String scanPas;
		
		System.out.println("Scan uw OV pas");
		scanPas = scanner.next();
		
		if (onthoudID == kaart.getPasNummer()) {
			System.out.println("Kies bedrag");
			
			choiseDouble = scanner.nextDouble();
			
			aanvulBedrag = choiseDouble - kaart.getHuidigSaldo();
			
			if (aanvulBedrag <= 0) {
				System.out.println("Sorry, bedrag niet mogelijk");
			} else {
				kaart.setSaldo(kaart.getHuidigSaldo() + aanvulBedrag);
				System.out.println("Huidig saldo: " + kaart.getHuidigSaldo());
			}
		} else {
			System.out.println("Pas komt niet overeen");
		}
	}
	
	public void saldo(Kaart kaart) {
		System.out.println("Uw huidige saldo is: " + kaart.getHuidigSaldo());
	}
	
	public void stoppen(Kaart kaart) {
		onthoudID = 0;
//		System.out.println(onthoudID);
		System.out.println("Fijne dag");
	}
}
