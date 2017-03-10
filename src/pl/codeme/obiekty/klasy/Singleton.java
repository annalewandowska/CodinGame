package pl.codeme.obiekty.klasy;
//jedna instancja obiektu

public class Singleton {
	
	private static Singleton instance;
	
	/*prywatny konstruktor - nie bêdziemy w stanie u¿yæ new
	 * i dobrze, bo u¿ytkownik ma getInstance i tego sobie mo¿e u¿ywaæ
	 * dlatego zmienna instance i metoda getINstance s¹ statyczne */
	
	private Singleton() {	
		
	}
	
	public static Singleton getInstance(){ 
		if(instance == null){
			instance = new Singleton();
		}
			return instance;
		}
	
}
/* ¿eby mo¿na by³o utworzyæ klasê podrzêdn¹, która dziedziczy, ale 
 * nie zepsuæ sigletona - nadal tylko jedna instancja
 */