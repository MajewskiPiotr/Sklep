package appClientModule.model;

public class Klient {
	int id;
	String imie;
	String nazwisko;
	public String getImie() {
		return imie;
	}
	public String setImie(String imie) {
		return this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

}
