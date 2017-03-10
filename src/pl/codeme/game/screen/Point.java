/*Anna Lewandowska*/

package pl.codeme.game.screen;

public class Point {
	
	private char c;
	
	public Point(char p){
		this.c = p;
	}
	
	public void setPoint(char p){
		c = p;
	}
	
	public char getPoint(){
		return c; 
	}
	
	public void showPoint(){
		System.out.print(c);
	}
}
