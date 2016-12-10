package appClientModule.model;

import appClientModule.typy.TypProduktu;

public class Produkt {
	public static ProduktBuilder New(){
		return new ProduktBuilder();
	}
	int id;
	TypProduktu nazwa;
	double cena;
	
	public TypProduktu getNazwa() {
		return nazwa;
	}
	public void setNazwa(TypProduktu nazwa) {
		this.nazwa = nazwa;
	}
	
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}


 public static class ProduktBuilder{
	 
	 private Produkt p;
	
	private ProduktBuilder(){
		p= new Produkt();
	}
	public ProduktBuilder dodajNazwe(TypProduktu nazwa){
		p.nazwa=nazwa;
		return this;
	}
	public ProduktBuilder dodajCene(double cena){
		p.cena=cena;
		return this;
	}
	public Produkt build(){
		return p;
	}
 }
}
 

	
	


