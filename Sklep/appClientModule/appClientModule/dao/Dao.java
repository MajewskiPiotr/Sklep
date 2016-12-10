package appClientModule.dao;

import java.util.ArrayList;
import java.util.List;

import appClientModule.model.Klient;
import appClientModule.model.Produkt;
import appClientModule.model.Zamowienie;
import appClientModule.typy.TypProduktu;

public class Dao {

	private static List<Produkt> produkty = new ArrayList<>();
	private static List<Klient> klienci = new ArrayList<>();
	private static List<Zamowienie> zamowienia = new ArrayList<>();

	public void dodajZamowienie(Zamowienie z){
		zamowienia.add(z);
	}
	
	public void dodajProdukt(Produkt p){
		produkty.add(p);
		System.out.println("Dodano nowy rekord");
		
	}
	
	public List<Produkt> wyszukaj(){
		return produkty;
		
	}
	
	public void dodajKlienta(Klient k){
		klienci.add(k);
	}
	public  Klient wyszukajKlienta(String nazwisko){
		
		for (Klient k : klienci)
			if (k.getNazwisko()==nazwisko){return k;}
		return null;
		
			
	}
	
	public  Produkt wyszukajProdukt(TypProduktu param){
		Produkt matching=null;
		for (Produkt p : produkty)
			if (p.getNazwa()==param){matching = p;}
		return matching;
		
			
	}
	
}
