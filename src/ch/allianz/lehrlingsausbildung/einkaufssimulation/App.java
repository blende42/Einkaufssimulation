package ch.allianz.lehrlingsausbildung.einkaufssimulation;

import ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects.Brieftasche;
import ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects.Brot;
import ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects.Kaese;
import ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects.Kasse;
import ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects.Warenkorb;
import ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects.Wurst;

public class App {

	public static void main(String[] args) {
		App app = new App();
		app.runApp();

	}

	public void runApp() {
		Warenkorb warenkorb = new Warenkorb(20);
		Brot brot = new Brot();
		warenkorb.kaufe(brot);
		Kaese kaese = new Kaese();
		warenkorb.kaufe(kaese);
		
		Wurst wurst = new Wurst();
		warenkorb.kaufe(wurst);
		warenkorb.kaufe(wurst);
		warenkorb.kaufe(wurst);
	    warenkorb.kaufe(brot);
	    warenkorb.kaufe(brot);
		warenkorb.print();
		System.out.printf("Preis: %1.2f\n",warenkorb.getPreis());
		Brieftasche brieftasche = new Brieftasche(300);
		Kasse kasse= new Kasse();
		kasse.bezahle(warenkorb, brieftasche);		
	}
}