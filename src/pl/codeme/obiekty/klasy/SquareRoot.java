package pl.codeme.obiekty.klasy;

import java.util.Iterator;

public class SquareRoot implements Iterator, Iterable {
	
	private int length;
	private int n;
	
	public SquareRoot(int length){
		this.length = length;
		this.n = 0;
	}
	
	@Override
	public boolean hasNext(){
		return (n < length) ? true : false;  //operator tr�jwarto�ciowy
		
		//return n < length;
//		if (n < length) {
//			return true;
//		}else
//		return false;
	}
	
	@Override
	public Object next(){
		n++;
		return new Integer(n*n);
	}
	@Override
	public Iterator iterator() {
		return this;
	}
}
