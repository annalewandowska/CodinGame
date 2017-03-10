//Anna Lewandowska

package pl.codeme.homeworks;

public class TableTester {

	public static void main(String[] args) {
	
		//tworzenie tablicy o zadanym rozmiarze MyTableLn przy pomocy metody klasy TableCreator
		
		int myTableLn = Table.tableLn;  //parametr zdefiniowany w klasie abstrakcyjnej Table
		int myTable[] = new int[myTableLn];
		
		TableCreator.createTable(myTableLn, myTable);
		
		for(int i = 0; i < myTable.length; i++){
			System.out.print(myTable[i] + " ");
		}
		System.out.println();
		
		//odwracanie tablicy metod¹ klasy ReverseTable wykorzystuj¹c¹ pêtlê for
		int myTableR[] = new int[myTableLn]; 	
		ReverseTable.reverseTable(myTable, myTableR);
		
		for(int i = 0; i < myTableR.length; i++){
			System.out.print(myTableR[i] + " ");
		}	
		System.out.println();
		
		//odwracanie tablicy przy pomocy interatora, klasa ReverseTableIt
		ReverseTableIt myTableR2 = new ReverseTableIt(myTable);
			
			for (Object liczba : myTableR2){
				System.out.print(liczba +" ");
			}	
	}

}
