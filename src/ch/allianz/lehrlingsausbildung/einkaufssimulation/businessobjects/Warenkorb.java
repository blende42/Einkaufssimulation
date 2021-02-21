package ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects;

import java.util.Arrays;

public class Warenkorb {
	private Ware[] waren;
	private int anzahlWaren;

	public Warenkorb(int groesse) {
		if (groesse < 0) {
			groesse = 10;
		}
		waren = new Ware[groesse];
		anzahlWaren = -1;
	}
	
	public boolean istLeer() {
		if (anzahlWaren < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean istVoll() {
		if(anzahlWaren < waren.length) {
			return false;
		}
		return true;
	}
	
	public void kaufe(Ware ware) {
		if (!istVoll()) {
			anzahlWaren ++;
			waren[anzahlWaren] = ware;
		} else {
			System.out.println("kein Platz im Warenkorb, bitte bezahlen");
		}		
	}
	

	public void print() {
		int i = 0;
		while(i <= anzahlWaren && !istLeer()) {
			System.out.println(waren[i]);
			i++;
		}
	}
	
	public double getPreis() {
		double preis = 0;
		if( !istLeer()) {
			for(int i = 0; i <= anzahlWaren;i++) {
				preis += waren[i].getPreis();
			}
		}
		return preis;
 	}
	
	public Ware[] getWaren() {
		if (istLeer()) {
			return null;
		} else {
			return Arrays.copyOfRange(waren, 0, anzahlWaren+1);
		}
	}
}
