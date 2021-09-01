package one.alexrogeriodj.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author alexrogeriodj
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
