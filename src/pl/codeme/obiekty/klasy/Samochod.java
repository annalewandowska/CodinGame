package pl.codeme.obiekty.klasy;
//POJO plain old java object - sprawdziæ

import pl.codeme.wyjatki.NieWskoczylBiegException;

/*klasa abstrakcyjna, klasa niedokoñczona, nie mo¿emy utworzyæ instancji, implementuj¹ czêœæ
 * wspóln¹*/

public abstract class Samochod implements Pojazd {
	private int kierownica;
	private int drzwi;
	private int silnik;
	protected int predkosc;
	private String wlasciciel;  
	/* modyfikatory dostêpu public (wszêdzie), private (w klasie), 
	 * protected (w sciezce dziedziczenia),	 widaæ w klasach ni¿ej, coœ pomiêdzy private a public
	default: dostêpne w pakiecie  package*/
	
	// konstruktor - s³u¿y do zainicjowania obiektu, wykonywany w momencie wykonywania new,
	// mo¿na go przeci¹¿aæ
	
	public static int zanieczyszczenie = 100;
	
	/*specjalna konstrukcja, to co tutaj zapiszemy bêdzie wykonane 
	 * w momencie ³adowania klasy 	*/
	
	static {
		System.out.println("£adujê klasê Samochód");
	}
	
	protected int lans = 0;
	
	public Samochod(String wlasciciel) { 
		super(); //wywo³aj konstruktor klasy nadrzêdnej
		this.wlasciciel = wlasciciel;
	}
	
	public Samochod(){
		wlasciciel = "Fabryka";
	}
	
	public int getKierownica() { //kierownica bêd¹ polem obiektu i kierow jako parametr - konflikt
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
	/*metoda abstrakcyjna, nie ma cia³a, tylko deklaracja nazwy, typu zwracnego i parametrów
	mog¹ siê znajdowaæ tylko w klasach abstrakcyjnych*/
	
	public abstract void przyspiesz() throws NieWskoczylBiegException;  

	@Override //adnotacja - do baz danych, to pole przetrzymuej tê kolumnê bazy danych
	public String toString() {
		return "Samochod [kierownica=" + kierownica + ", drzwi=" + drzwi + ", silnik=" + silnik + ", predkosc="
				+ predkosc + ", wlasciciel=" + wlasciciel + "]\n" + super.toString();
	}
	
	
}
