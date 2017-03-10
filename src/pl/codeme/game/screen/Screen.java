/*Anna Lewandowska*/

package pl.codeme.game.screen;

public class Screen {
	

	private Point[][] ptTable;
	private int width;
	private int heigth;
	
	/*/konstruktor rezerwuje miejsce w pamiêci na tablicê i wype³nia j¹ obiektami typu Point
	 * tablica o zadanej szerokoœci i wysokoœci: x i y 
	 * na pocz¹tek wstawi³am '.' ¿eby by³o widaæ gdzie co wstawiam*/
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
	
	//wyœwietla tabelê znaków na ekranie
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
	
	//wstawia do tablicy znak i drukuje tablicê na ekranie
	public void drawPoint(int a, int b, char c){
		(ptTable[a][b]).setPoint(c);
		printScreen();
	}
	
	/*wstawia do tablicy liniê i drukuje tablicê na ekranie
	 * a,b - punkt startowy, d - dlugoœæ linii*/
	public void drawLine(int a, int b, int d, char c){	
		for(int i = 0; i < d; i++){
			(ptTable[a+i][b]).setPoint(c);
		}
		printScreen();

	}
	/*wstawia do tablicy prostok¹t i rysuje tablicê na ekranie
	 * a, b - górny lewy róg, w - szerokoœæ, h - wysokoœæ*/
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
