package ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects;

import java.util.Currency;
import java.util.Locale;

public class Kasse {
		private double barBestand = 500.0;
		private double rechnungsBetrag;
		private Locale locale;
		
		public Kasse() {
			locale = Locale.getDefault();
		}
		
		
		public void bezahle(Warenkorb warenkorb, Brieftasche brieftasche) {
			if (warenkorb.getPreis() > brieftasche.leseInhalt()) {
				System.out.println("zuwenig Bargeld vorhanden. Nutze eine Kasse für Kreditkarten.");
			} else {
				Ware[] waren = warenkorb.getWaren();
				if (waren != null) {
					printKassenbon(new Kassenbon(waren, locale));
					brieftasche.bezahle(warenkorb.getPreis());
					barBestand += warenkorb.getPreis();
					System.out.println("Kassenbestand: "+barBestand+ " "+Currency.getInstance(locale).getSymbol());
				}
			}	
		}
		private void printKassenbon(Kassenbon kassenbon) {
			kassenbon.print();
		}
		
}