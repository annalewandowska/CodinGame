
public class WitajSwiecie {

	public static void main(String[] args) {
		
//		int x = 10;
//		double y = 1.2;
//		float z = 34.3F;
//		String imie = "Anka";
//		Boolean prawda = true;
//		char znak = 'o';
//		char innyZnak = 13;
//		
//		if(imie == "Anka"){
//			System.out.println("Czeœæ Anka");
//		}else {
//			System.out.println("Gdzie ona jest?");
//		}
//		
		WitajSwiecie swiat = new WitajSwiecie();
		
		swiat.linia(10);
		swiat.linia(20);
		swiat.linia(120);
	
	}
		
		private void linia(int dl){
			int i = 0;
			for(i = 0; i < dl; i++){
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	
	//	x = 0;
//		do {
//			if (x % 6 == 0){
//				System.out.println("X: " + x);
//			}
//			if (x == 100) {
//				break;  //continue - nie wychodzimy z pêtli, ale przechodzimy do kontynuacji
//			}
//			x++;
//		}while(true);
	
		//System.out.println("Witaj " +innyZnak +"œwiecie");
		
	
		
		private static void kwadrat(int wys, int szer){
			for(int i = 0; i < wys; i++){
				System.out.print("*");
		}
		}
	
	}

