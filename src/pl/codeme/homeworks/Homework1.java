//Anna Lewandowska

package pl.codeme.homeworks;

public class Homework1 {

	public static void main(String[] args) {
		
		SimpleDrawing drawing = new SimpleDrawing();
		
		drawing.emptyLine(5, false);
		System.out.println();
		drawing.christmasTree(10);
		System.out.println();
		drawing.square(15,9, '.', ' ');
	}

}
