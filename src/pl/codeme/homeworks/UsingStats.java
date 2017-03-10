//Anna Lewandowska

package pl.codeme.homeworks;

/*Zmienna statyczna counter w klasie Stats jest inkrementowana przy ka�dym wywo�aniu konstruktora 
 * i zlicza instancje obiektu
 * ale je�li dwa obiekty wskazuj� na to samo miejsce w pami�ci, to m�j licznik policzy tylko jeden
 * */

public class UsingStats {

	public static void main(String[] args) {
		
		Stats obj1 = new Stats();
		Stats obj2 = new Stats();
		Stats obj3 = new Stats();
		Stats obj4 = new Stats();
		Stats obj5 = obj4;
		
		System.out.println("Liczba utworzonych instancji obiektu to: " +Stats.getCounter());

	}

}
