package pl.codeme.obiekty.klasy;
//jedna instancja obiektu

public class Singleton {
	
	private static Singleton instance;
	
	/*prywatny konstruktor - nie b�dziemy w stanie u�y� new
	 * i dobrze, bo u�ytkownik ma getInstance i tego sobie mo�e u�ywa�
	 * dlatego zmienna instance i metoda getINstance s� statyczne */
	
	private Singleton() {	
		
	}
	
	public static Singleton getInstance(){ 
		if(instance == null){
			instance = new Singleton();
		}
			return instance;
		}
	
}
/* �eby mo�na by�o utworzy� klas� podrz�dn�, kt�ra dziedziczy, ale 
 * nie zepsu� sigletona - nadal tylko jedna instancja
 */