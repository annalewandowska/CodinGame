//Anna Lewandowska
package pl.codeme.homeworks;

import java.util.Iterator;

public class ReverseTableIt extends Table implements Iterator, Iterable {
	
	private int n;
	private int[] table;// = new int[Table.tableLn];
	
	public ReverseTableIt(int[] table){
		this.table = table;
		this.n = 0;
	}

	@Override
	public boolean hasNext(){
		return (n < table.length) ? true : false;
	}

	@Override
	public Object next(){
		//int tabR = table[table.length - n -1];
		//n++;
		//return new Integer(tabR);
		//return tabR;
		return table[table.length - n++ -1];
	}
	
	@Override
	public Iterator iterator(){
		return this;
	}
}
