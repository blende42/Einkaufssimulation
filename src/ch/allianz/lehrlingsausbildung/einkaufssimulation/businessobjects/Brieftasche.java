package ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects;

public class Brieftasche {
	private double inhalt;
	
	public Brieftasche(double inhalt) {
		if(inhalt <0) { 
			this.inhalt = 0;
		} else {
			this.inhalt = inhalt;
		}
	}

	public double leseInhalt() {
		return inhalt;
	}
	
	public void fuegeHinzu(double cash) {
		if(cash >0) {
			this.inhalt += cash;
		}
	}
	
	public void bezahle(double cash) {
		if(cash >0) {
			if (cash < inhalt) {
				inhalt -= cash;
			} else {
				System.out.println("zuwenig Geld in der Brieftasche. Nimm die Kreditkarte.");
			}
		}
	}
}