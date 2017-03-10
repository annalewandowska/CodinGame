/*Anna Lewandowska
 * Na razie zrobi³am zadanie bez u¿ycia interfejsu*/

package pl.codeme.game.screen;

public class UI {

	public static void main(String[] args) {
		
		Point myPoint = new Point('b');
		
		myPoint.setPoint('x');
		myPoint.showPoint();
		System.out.println();
		
		Screen myScreen = new Screen(10,10);
		
		myScreen.drawSquare(1, 1, 4,6, 'o');

		myScreen.clrScreen();
		
		myScreen.drawPoint(1, 1, 'x');

		myScreen.clrScreen();
		
		myScreen.drawLine(3, 5, 5, 'w');

		myScreen.drawLine(2, 4, 5, 't');

	}

}
