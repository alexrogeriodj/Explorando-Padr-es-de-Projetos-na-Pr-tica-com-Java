package one.alexrogeriodj.gof.singleton;

/**
 * Singleton "pregui�oso".
 * 
 * @author alexrogeriodj
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
