package pl.codeme.obiekty;
import pl.codeme.obiekty.klasy.Bmw;
import pl.codeme.obiekty.klasy.Samochod;
import pl.codeme.wyjatki.NieWskoczylBiegException;
import pl.codeme.wyjatki.SamochodException;
import pl.codeme.wyjatki.SkrzyniaBiegowException;

/*interfejsy mówi¹ nam co dany obiekt musi robiæ
 * jeszcze bardziej zubo¿a³a wersja klasy abstrakcyjnej
 * nie ma cia³ metod - mniej wiêcej
 * interfejsem móg³by te¿ byæ samochód - nie opisuje jak coœ robiæ, ale informacje o tym np. void skrec
 * void rusz void zatrzymaj,
 * teraz zadeklarowanie pól oraz implementacjê metod statycznych
 * opisywa³y jak z danym obiektem siê komunikowaæ
 * ka¿da klasa mo¿e implementowaæ wiele interfejsów, nie tak jak przy dziedziczeniu*/


public class Przyklad1 {

	public static void main(String[] args) {
		
		/*zmiana zmiennej statycznej, dzielonej, nie trzeba tworzyæ obiektów,
		// ani Samochod ani bryka 1 czy bryka2*/
		
		Samochod.zanieczyszczenie = 150;  
		
		Samochod bryka1 = new Bmw();
		Samochod bryka2 = new Bmw();
		
		System.out.println("Zanieczyszczenie 1: " + bryka1.zanieczyszczenie);
		System.out.println("Zanieczyszczenie 2: " + bryka2.zanieczyszczenie);
		
		
		bryka2.setWlasciciel("Zbyszek");
		
		System.out.println("Bryka 1 : " + bryka1.getWlasciciel());
		System.out.println("Bryka 2 : " + bryka2.getWlasciciel());
		
		try {	
	
			bryka1.przyspiesz();
		
			bryka1.przyspiesz();
		}catch (NieWskoczylBiegException ex){
			System.out.println("NIE WSKOCZY£ BIEG " + ex.getBieg());
			StackTraceElement stack[] = ex.getStackTrace();
			for(int i = 0; i<stack.length; i++) {
				System.out.println("To STRING od " +  i +" "+ stack[i].toString()); //przeiterowaæ
			}
		}	
//		} catch (Exception ex){
//			System.out.println("Wyst¹pi³ Z£Y b³¹d");
//			System.out.println(ex.getMessage());
//			//System.out.print(ex.printStackTrace());
//			System.out.println(ex.toString());
//			//ex.getPrint?StackTrace() - zbadaæ co jest w ka¿dym z tych obiektów zobaczyæ 
//			//i spróbowaæ wyœwietliæ na ekranie to co dostaniemy
//		}
		//rzutownie typu - nie korzystaæ, bo niebezpieczeñœtwo, ¿e siê program wywali kiedyœ póŸniej
		((Bmw)bryka1).przyspiesz(5); //przeciazanie nazwy metody - jedna nazwa dwoch metod ale z arg
		
		System.out.println("Bryka 1 - predkosc " + bryka1.getPredkosc());
		System.out.println("Bryka 2 - predkosc " + bryka2.getPredkosc());
		
		System.out.println(bryka1);
		
		Bmw bryka3 = new Bmw();
		//bryka3.lans = 100; // nie mo¿e skorzystaæ, bo jest protected bryka3 to samocho
	}

}
