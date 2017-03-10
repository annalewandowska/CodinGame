package pl.codeme.obiekty.klasy;

public class IteratorExamble {

	public static void main(String[] args) {
		SquareRoot sq = new SquareRoot(12);
		
		for (Object liczba : sq){
			System.out.println(liczba);
		}

	}

}
