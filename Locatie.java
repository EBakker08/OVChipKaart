
package ovChipKaart;

public class Locatie {
	
//	Properties:
	private String locatieNaam;
	private double xAs;
	private double yAs;
	
	
	
//	Functions:
	public Locatie(String locatieNaam, double xAs, double yAs) {
		this.locatieNaam = locatieNaam;
		this.xAs = xAs;
		this.yAs = yAs;
	}
	
	public double afstandAfgelegd(Locatie bestemingLocatieNaam) {
		
		double verschilXAs = this.xAs - bestemingLocatieNaam.xAs;
		double verschilYAs = this.yAs - bestemingLocatieNaam.yAs;
		
		double kwadraatA = verschilXAs * verschilXAs;
		double kwadraatB = verschilYAs * verschilYAs;
		
		double kwadraatC = kwadraatA + kwadraatB;
		
		double totaleAfstand = Math.sqrt(kwadraatC);
		
		return totaleAfstand;
	}
	
}
