//Anna Lewandowska

package pl.codeme.homeworks;

public class TableCreator extends Table{
	
	public static void createTable(int tabLn, int[] tab){
		//int tab[] = new int[tabLn];
		for(int i = 0; i < tab.length; i++){
			tab[i] = i*i;
			}
		//return tab;
		
	}
	
	
}
