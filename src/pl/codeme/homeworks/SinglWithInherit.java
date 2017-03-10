package pl.codeme.homeworks;

/*Konstruktor nie jest ju� prywatny, wi�c mog� go wywo�a� w obr�bie pakietu 
 * i stworzy� kilka instacji obiektu SinglWithInhert
 * Czyli wygl�da na to, �e ju� nie u�ywam wzorca Singleton.
 * O to chodzi�o? Czy jeszcze co� mam zrobi�?
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
