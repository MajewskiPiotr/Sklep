import appClientModule.model.Zamowienie;
import appClientModule.service.KlientService;
import appClientModule.service.ProduktService;
import appClientModule.service.ZamowieniaService;
import appClientModule.typy.StanZamowienia;
import appClientModule.typy.TypProduktu;

public class Main {
	public static void main(String[] args) {
	Atrapa a = new Atrapa();
	
	ProduktService service = new ProduktService();
	KlientService klientService = new KlientService();
	ZamowieniaService zamowieniaService = new ZamowieniaService();


	Zamowienie z1 = new Zamowienie();
	z1.dodajDoZamowienia(service.wyszukaj(TypProduktu.Komputer));
	z1.dodajDoZamowienia(service.wyszukaj(TypProduktu.Monitor));
	z1.setKlient(klientService.wyszukajKlienta("Majewski"));
	z1.setStan(StanZamowienia.NOWY);
	zamowieniaService.dodajZamownie(z1);
	
	Zamowienie z2 = new Zamowienie();
	z2.dodajDoZamowienia(service.wyszukaj(TypProduktu.Ram));
	z2.dodajDoZamowienia(service.wyszukaj(TypProduktu.Monitor));
	z2.setKlient(klientService.wyszukajKlienta("Chudzik"));
	z2.setStan(StanZamowienia.NOWY);
	zamowieniaService.dodajZamownie(z2);
	
	
	
	


	}

}