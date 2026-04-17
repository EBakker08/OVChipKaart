
package ovChipKaart;

public class Locatie {
	
//	Properties:
	private String locatieNaam;
	private double xAs;
	private double yAs;
	
	
	
//	Functions:
	public Locatie(String locatieNaam, double xAs, double yAs) {	// Hier maak je een nieuwe locatie aan.
		this.locatieNaam = locatieNaam;
		this.xAs = xAs;
		this.yAs = yAs;
	}
	
	public double afstandAfgelegd(Locatie bestemingLocatie) {	// Bereken de afstand tussen de twee locaties.
		double verschilXAs = this.xAs - bestemingLocatie.xAs;
		double verschilYAs = this.yAs - bestemingLocatie.yAs;
		
		double kwadraatA = verschilXAs * verschilXAs;
		double kwadraatB = verschilYAs * verschilYAs;
		
		double kwadraatC = kwadraatA + kwadraatB;
		
		double totaleAfstand = Math.sqrt(kwadraatC);
		
		double reisBedrag = totaleAfstand * 0.20;
		
		return reisBedrag;
	}
	
}
