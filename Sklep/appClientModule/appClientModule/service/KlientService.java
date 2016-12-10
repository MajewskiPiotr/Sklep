package appClientModule.service;

import appClientModule.dao.Dao;
import appClientModule.model.Klient;

public class KlientService {
	Dao dane = new Dao();
	
	
	public void dodajKlienta(Klient k){
	dane.dodajKlienta(k);	
	}
	
	public Klient wyszukajKlienta(String nazwisko){
		return dane.wyszukajKlienta(nazwisko);
	}
}
