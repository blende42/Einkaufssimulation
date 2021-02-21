package ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects;

import java.util.Locale;

public class Kassenbon {
	Locale locale;
	Ware[] waren;

	public Kassenbon(Ware[] waren, Locale locale) {
		this.waren = waren;
		this.locale = locale;
	}
	
	public void print() {
		if(waren != null) { 
			int i=0;
			boolean done = false;
			while(i < waren.length && !done) {
				Ware ware = waren[i];
				int anzahl = 0;
				String name;
				if (ware != null) {
					name = ware.getName();
					for(int j = i; j < waren.length; j++) {
						if(waren[j] != null && waren[j].getName().equals(name)) {
							anzahl++;
							waren[j] = null;
						}
					}
				}
				if (anzahl == 0 ) {
					done = true;
				} else {
					System.out.println(ware + " anzahl = "+anzahl);
					i++;
				}
			}
		}
	}	
}
