package ch.allianz.lehrlingsausbildung.einkaufssimulation.businessobjects;

public class Ware {
	private String name;
	private double preis;

	public Ware(String name, double preis) {
		this.name = name;
		this.preis = preis;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public String toString() {
		return "[name = '" + getName() +"', preis = '" +getPreis() +"']";
	}
	
}
