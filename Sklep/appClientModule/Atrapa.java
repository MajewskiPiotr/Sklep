import appClientModule.dao.Dao;
import appClientModule.model.Klient;
import appClientModule.model.Produkt;
import appClientModule.model.Zamowienie;
import appClientModule.service.KlientService;
import appClientModule.service.ProduktService;
import appClientModule.typy.TypProduktu;

public class Atrapa {
	
	public Atrapa(){
		
		System.out.println("test");
		ProduktService service = new ProduktService();
		KlientService klientService = new KlientService();
		Dao daoService = new Dao();
		Klient k1 = new Klient();
		k1.setImie("Piotr");
		k1.setNazwisko("Majewski");
		
		Klient k2 = new Klient();
		k2.setImie("Sylwia");
		k2.setNazwisko("Chudzik");
		
		klientService.dodajKlienta(k1);
		klientService.dodajKlienta(k2);
		
		Produkt p1 = new Produkt().New().dodajNazwe(TypProduktu.Klawiatura).dodajCene(1000).build();
		Produkt p2 = new Produkt().New().dodajNazwe(TypProduktu.Komputer).dodajCene(500).build();
		Produkt p3 = new Produkt().New().dodajNazwe(TypProduktu.Monitor).dodajCene(100).build();
		Produkt p4 = new Produkt().New().dodajNazwe(TypProduktu.Ram).dodajCene(30).build();
		Produkt p5 = new Produkt().New().dodajNazwe(TypProduktu.Skaner).dodajCene(1020).build();
		
		service.dodajDoBazy(p1);
		service.dodajDoBazy(p2);
		service.dodajDoBazy(p3);
		service.dodajDoBazy(p4);
		service.dodajDoBazy(p5);
		
		
		
			
	}

}
