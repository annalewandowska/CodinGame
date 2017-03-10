package pl.codeme.homeworks;

/*Konstruktor nie jest ju¿ prywatny, wiêc mogê go wywo³aæ w obrêbie pakietu 
 * i stworzyæ kilka instacji obiektu SinglWithInhert
 * Czyli wygl¹da na to, ¿e ju¿ nie u¿ywam wzorca Singleton.
 * O to chodzi³o? Czy jeszcze coœ mam zrobiæ?
 * */

public class SinglWithInherit {
	
	private static SinglWithInherit instance;
	
	protected SinglWithInherit(){
	}
	
	public static SinglWithInherit getSinglWithInherit(){
		if(instance == null){
			instance = new SinglWithInherit();
		}
		return instance;
	}
}
