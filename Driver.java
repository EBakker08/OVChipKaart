
package ovChipKaart;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

//		Bus = 4.0 | Trein = 20.0
		Paal paal = new Paal(4.0);
		Kaart kaart = new Kaart(1234, 3.0, false, true);
		Scanner sc = new Scanner(System.in);

		System.out.println("Wilt u 1. Inchecken 2. Uitchecken 3. Saldo Verhogen");
		
		int choiseInput = sc.nextInt();	// User input might also need to be changed.
		
		paal.inchecken(kaart);
		
	}

}
