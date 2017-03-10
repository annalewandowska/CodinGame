//Anna Lewandowska

package pl.codeme.homeworks;

public class ReverseTable extends Table{

	public ReverseTable(){
		
	}
	
	public static void reverseTable(int[] tabSource, int[] tabDest){
		//int[] tabR = new int[table.length];
		for(int j = 0; j < tabSource.length; j++){
			tabDest[j] = tabSource[tabSource.length - j -1];
		}
	//	return tabR;
	}
}

