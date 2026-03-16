
package ovChipKaart;

public class Kaart {
	
//	Properties
	private int pasNummer;
	private double huidigSaldo;
//	private date geldigTotDatum;
	private boolean ingecheckt;
	private boolean geldig;
	
//	Functions
	public Kaart(int pasNummer, double huidigSaldo, boolean ingecheckt, boolean geldig) {
		this.pasNummer = pasNummer;
		this.huidigSaldo = huidigSaldo;
		this.ingecheckt = ingecheckt;
		this.geldig = geldig;
	}
	
	public void setSaldo(double huidigSaldo) {
		this.huidigSaldo = huidigSaldo;
	}
	
	public void setIngechekt(boolean ingecheckt) {
		this.ingecheckt = ingecheckt;
	}
	
	public int getPasNummer() {
		return pasNummer;
	}
	
	public double getHuidigSaldo() {
		return huidigSaldo;
	}
	
	public boolean getIngechekt() {
		return ingecheckt;
	}
	
	public boolean getGeldigePas() {
		return geldig;
	}
	
}
