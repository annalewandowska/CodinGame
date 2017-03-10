//Anna Lewandowska

package pl.codeme.homeworks;

public class Stats {

	private static int counter = 0;
	
	public Stats(){
		counter++;
	}
	
	public static int getCounter(){
		return counter;
	}
}
