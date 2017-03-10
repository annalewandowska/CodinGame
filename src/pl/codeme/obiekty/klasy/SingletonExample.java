package pl.codeme.obiekty.klasy;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton ex1, ex2;
		
		ex1 = Singleton.getInstance();
		ex2 = Singleton.getInstance();
		
		System.out.println(ex1); //niejawne u¿ycie metody toString()
		System.out.println(ex2);
	}

}
