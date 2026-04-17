
package ovChipKaart;

public class Kaart {
	
//	Properties:
	private double huidigSaldo;
	private int pasNummer;
	private boolean ingecheckt;
	private boolean geldig;
	
	
	
//	Functions:
	public Kaart(int pasNummer, double huidigSaldo, boolean ingecheckt, boolean geldig) {
		this.pasNummer = pasNummer;
		this.huidigSaldo = huidigSaldo;
		this.ingecheckt = ingecheckt;
		this.geldig = geldig;
	}
	
	public void setSaldo(double huidigSaldo) {	// Geeft de variable een waarde
		this.huidigSaldo = huidigSaldo;
	}
	
	public void setIngechekt(boolean ingecheckt) {
		this.ingecheckt = ingecheckt;
	}
	
	public int getPasNummer() {	// Maak de variable toegankelijk
		return pasNummer;
	}
	
	public double getHuidigSaldo() {
		return huidigSaldo;
	}
	
	public boolean getIngecheckt() {
		return ingecheckt;
	}
	
	public boolean getGeldigePas() {
		return geldig;
	}
	
}
