package appClientModule.service;

import appClientModule.dao.Dao;
import appClientModule.model.Zamowienie;
import appClientModule.typy.StanZamowienia;

public class ZamowieniaService {
	Dao dane = new Dao();

	public void dodajZamownie(Zamowienie z){
		z.setStan(StanZamowienia.PRZYJETY);
		dane.dodajZamowienie(z);
	}
	
	
}
