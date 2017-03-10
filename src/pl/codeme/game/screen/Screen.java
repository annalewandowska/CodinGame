/*Anna Lewandowska*/

package pl.codeme.game.screen;

public class Screen {
	

	private Point[][] ptTable;
	private int width;
	private int heigth;
	
	/*/konstruktor rezerwuje miejsce w pami�ci na tablic� i wype�nia j� obiektami typu Point
	 * tablica o zadanej szeroko�ci i wysoko�ci: x i y 
	 * na pocz�tek wstawi�am '.' �eby by�o wida� gdzie co wstawiam*/
	public Screen(int x, int y){
		this.width = x;
		this.heigth = y;
		this.ptTable = new Point[width][heigth];
		for(int i = 0; i < heigth; i++){
			for(int j = 0; j < width; j++){
				ptTable[j][i] = new Point('.');
			}
		}
	}
	
	//wy�wietla tabel� znak�w na ekranie
	public void printScreen(){
		for(int i = 0; i < heigth; i++){
			for(int j = 0; j < width; j++){
				//System.out.print((ptTable[j][i]).getPoint());
				ptTable[j][i].showPoint();
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//wstawia do tablicy znak i drukuje tablic� na ekranie
	public void drawPoint(int a, int b, char c){
		(ptTable[a][b]).setPoint(c);
		printScreen();
	}
	
	/*wstawia do tablicy lini� i drukuje tablic� na ekranie
	 * a,b - punkt startowy, d - dlugo�� linii*/
	public void drawLine(int a, int b, int d, char c){	
		for(int i = 0; i < d; i++){
			(ptTable[a+i][b]).setPoint(c);
		}
		printScreen();

	}
	/*wstawia do tablicy prostok�t i rysuje tablic� na ekranie
	 * a, b - g�rny lewy r�g, w - szeroko��, h - wysoko��*/
	public void drawSquare(int a, int b, int w, int h, char c){
		for(int i = 0; i < w; i++){
			ptTable[a+i][b].setPoint(c);
			ptTable[a+i][b+h-1].setPoint(c);
		}
		for(int i = 0; i < h; i++){
			ptTable[a][b+i].setPoint(c);
			ptTable[a+w-1][b+i].setPoint(c);
		}
		printScreen();
	}
	
	public void clrScreen(){
		for(int i = 0; i < heigth; i++){
			for(int j = 0; j < width; j++){
				ptTable[j][i] = new Point('.');
			}
		}
	}
}
