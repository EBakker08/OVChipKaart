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
//		onthoudID = kaart.getPasNummer();
	}
	
	public void opwaarderen(Kaart kaart) {
		String choiseString;
		int choiseInt;
		
		System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
		System.out.println("Kies uit: 10 | 20 | 50 | Kies bedrag");
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
		} else if (choiseString.equalsIgnoreCase("Kies bedrag")) {
			System.out.println("Voer een bedrag in");
			choiseInt = scanner.nextInt();
			
			addBedrag = choiseInt;
			
			kaart.setSaldo(kaart.getHuidigSaldo() + addBedrag);
			
			System.out.println("Uw huidige saldo is " + kaart.getHuidigSaldo());
		} else {
			System.out.println("Dit is geen optie.");
		}
	}
	
	public void aanvullenTot(Kaart kaart) {
		
	}
	
	public void saldo(Kaart kaart) {
		
	}
	
	public void stoppen(Kaart kaart) {
		
	}
}
