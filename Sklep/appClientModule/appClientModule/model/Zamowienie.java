package appClientModule.model;

import java.util.ArrayList;
import java.util.List;

import appClientModule.typy.StanZamowienia;

public class Zamowienie {
	int id;
	StanZamowienia stan;
	
	Klient klient;
	List<Produkt> produkty = new ArrayList<Produkt>();

	
	public List<Produkt> getProdukty() {
		return produkty;
	}
	public void setProdukty(List<Produkt> produkty) {
		this.produkty = produkty;
	}
	public StanZamowienia getStan() {
		return stan;
	}
	public void setStan(StanZamowienia stan) {
		this.stan = stan;
	}
	public Klient getKlient() {
		return klient;
	}
	public void setKlient(Klient klient) {
		this.klient = klient;
	}
	public void dodajDoZamowienia(Produkt p){
		produkty.add(p);
	}
	

}
