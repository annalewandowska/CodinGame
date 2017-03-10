package pl.codeme.homeworks;

public class SimpleDrawing {

	private void star(){
		System.out.print("*");
	}
	
	private void space(){
		System.out.print(" ");
	}
	
	private void nl(){
		System.out.println();
	}
	
	public void line(int length, boolean nl){ 		//rysuje lini� z gwiazdek o zadanej d�ugo�ci
		for(int i = 0; i < length; i++){
			star();
		}
		if(nl){
			nl();
		}
	}
	
	public void line(int length, boolean nl, char ch){
		for(int i = 0; i < length; i++){
			System.out.print(ch);;
		}
		if(nl){
			nl();
		}
	}
	
	public void emptyLine(int length, boolean nl){ 	//rysuje lini� ze spacji o zadanej d�
		for(int i = 0; i < length; i++){
			space();		
		}
		if(nl){
			nl();
		}
		}
	
	
	//rysuje prostok�t z podanych znak�w: fr - ramka, inside - wype�nienie
	public void square(int width, int height, char fr, char inside){ 
		for(int i = 0; i < height; i++){
			if(i == 0 || i == height -1){
				line(width, true, fr);
			}else {
				line(1, false, fr);
				line(width - 2, false, inside);
				line(1, true, fr);
			}
		}
	}
	
	//rysuje choink� z gwiazdek o zadanej wysoko�ci: size
	public void christmasTree(int size){
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size - i; j++){
				space();
			}
			for(int x = 0; x <= i*2; x++){
				star();
			}
			nl();
		}
	}

}	
	//rysowanie kwadratu, wersja z while
//	public void square(int width, int height, char fr, char inside){ //fr - ramka, inside - wype�nienie
//		int i = 0;
//		while(i < height){
//			if(i == 0 || i == height -1){
//				line(width, true, fr);
//			}else {
//				line(1, false, fr);
//				line(width - 2, false, inside);
//				line(1, true, fr);
//			}
//			i++;
//		}
//	}


//rysowanie kwadratu, wersja bez metody line

/*public void square(int width, int height){
	for(int i = 0; i < height; i++){
		if(i == 0 || i == height - 1){
			for(int j = 0; j < width; j++){
			star();
			}
			nl();
		}else{
			star();
			for(int j = 0; j < width - 2; j++){
				space();
			}
			star();
			nl();
		}
	}
}*/

