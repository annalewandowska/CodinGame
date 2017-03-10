package pl.codeme.obiekty.klasy;

public class tablice {

	public static void main(String[] args) {
		int tablica[] = new int[12];
		
		System.out.println(args[0]);
			getTable2(tablica,7);
		int n = 7;
			
	//	Point screen[][] = new Point[100][200];  //tablica obiektów
		char[][] screen = new char[10][20];
		
		for(int el : tablica){
			System.out.println(el);
		}
		
		
		//char screen[][] = getScreen(3,5);
		
		//wyœwietlanie tablicy
//		for(int i = 0; i < 3; i++){
//			System.out.print(" " + screen[i][i]);
//				for(int j = 0; j < 5; j++){
//				System.out.print(" " + screen[i][j]);
//			}
//				System.out.println();
//		}
//		
		int x,y;
		for(y = 0; y < screen.length; y++){
			for(x = 0; x < screen[y].length; x++){
				screen[y][x] = 'x';
			}
		}
		
		screen[5][7] = '0';
		
		for(y = 0; y < screen.length; y++){
			for(x = 0; x < screen[y].length; x++){
				System.out.print(screen[y][x]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < tablica.length; i++){
			System.out.print(" " + tablica[i]);
		}
		System.out.println("\n" + n);
		
		//wyœwietla tablicê od koñca
		for(int i = tablica.length-1; i >= 0; i-- ){
			System.out.print(" " + tablica[i]);
		}
	}
	
//	private static char[][] getScreen(int x, int y){
//		char scr[][] = new char[x][y];
//		
//		for(int i = 0; i < x; i++){
//			for(int j = 0; j < y; j++){
//				scr[i][j] = 'x';
//			}
//		}
//		
//		return scr;
//	}
	
	private static int[] getTable(int dlugosc, int n){ 
		int tab[] = new int[dlugosc];
	
		tab[0] = 1;
		for(int i = 1; i < tab.length; i++){
			tab[i] = tab[i-1] + n;
		}
		return tab;
	}
	
	private static void getTable2(int tab[], int n){ 
		tab[0] = 1;
		for(int i = 1; i < tab.length; i++){
			tab[i] = tab[i-1] + n;
		}
		n = 1000;

	}
}
