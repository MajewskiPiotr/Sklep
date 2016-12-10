package appClientModule.service;

import java.util.List;

import appClientModule.dao.Dao;
import appClientModule.model.Produkt;
import appClientModule.typy.TypProduktu;

public class ProduktService {
	Produkt produkt;
	Dao dane = new Dao();

	public void dodajDoBazy(Produkt p) {

		dane.dodajProdukt(p);
	}

	public List<Produkt> wyszukajWszystko(){
		return dane.wyszukaj();
	}

	public Produkt wyszukaj(TypProduktu param){
			return dane.wyszukajProdukt(param);
			
	}

}
