package pl.codeme.obiekty.klasy;
//POJO plain old java object - sprawdzi�

import pl.codeme.wyjatki.NieWskoczylBiegException;

/*klasa abstrakcyjna, klasa niedoko�czona, nie mo�emy utworzy� instancji, implementuj� cz��
 * wsp�ln�*/

public abstract class Samochod implements Pojazd {
	private int kierownica;
	private int drzwi;
	private int silnik;
	protected int predkosc;
	private String wlasciciel;  
	/* modyfikatory dost�pu public (wsz�dzie), private (w klasie), 
	 * protected (w sciezce dziedziczenia),	 wida� w klasach ni�ej, co� pomi�dzy private a public
	default: dost�pne w pakiecie  package*/
	
	// konstruktor - s�u�y do zainicjowania obiektu, wykonywany w momencie wykonywania new,
	// mo�na go przeci��a�
	
	public static int zanieczyszczenie = 100;
	
	/*specjalna konstrukcja, to co tutaj zapiszemy b�dzie wykonane 
	 * w momencie �adowania klasy 	*/
	
	static {
		System.out.println("�aduj� klas� Samoch�d");
	}
	
	protected int lans = 0;
	
	public Samochod(String wlasciciel) { 
		super(); //wywo�aj konstruktor klasy nadrz�dnej
		this.wlasciciel = wlasciciel;
	}
	
	public Samochod(){
		wlasciciel = "Fabryka";
	}
	
	public int getKierownica() { //kierownica b�d� polem obiektu i kierow jako parametr - konflikt
		return kierownica;
	}

	public void setKierownica(int kierownica) {
		this.kierownica = kierownica;
	}

	public int getDrzwi() {
		return drzwi;
	}

	public void setDrzwi(int drzwi) {
		this.drzwi = drzwi;
	}

	public int getSilnik() {
		return silnik;
	}

	public void setSilnik(int silnik) {
		this.silnik = silnik;
	}

	public int getPredkosc() {
		return predkosc;
	}

	public void setPredkosc(int predkosc) {
		this.predkosc = predkosc;
	}

	public String getWlasciciel(){
		return wlasciciel;
	}
	
	public void setWlasciciel(String wlasciciel){
		this.wlasciciel = wlasciciel;
	}
	/*metoda abstrakcyjna, nie ma cia�a, tylko deklaracja nazwy, typu zwracnego i parametr�w
	mog� si� znajdowa� tylko w klasach abstrakcyjnych*/
	
	public abstract void przyspiesz() throws NieWskoczylBiegException;  

	@Override //adnotacja - do baz danych, to pole przetrzymuej t� kolumn� bazy danych
	public String toString() {
		return "Samochod [kierownica=" + kierownica + ", drzwi=" + drzwi + ", silnik=" + silnik + ", predkosc="
				+ predkosc + ", wlasciciel=" + wlasciciel + "]\n" + super.toString();
	}
	
	
}
