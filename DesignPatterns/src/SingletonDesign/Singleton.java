package SingletonDesign;

/*Nece se nikad napraviti instanca Singletona preko konstruktora, vec samo pozivom getInstance() metode.
Samo je getInstance() metoda moze napraviti novu instancu, jer je konstruktor private!*/

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {}		//konstruktor je private jer samo ova Singleton klasa moze da instancira objekat
	
	public static Singleton getInstance() {		//getInstance nam omogucava da instanciramo klasu jedinstveno ako vec nismo!
		if (instance == null) {					// inace nam vraca instancu ako je vec napravljena!
			instance = new Singleton();
		}
		return instance;
	}
	
	
	public void someMethod() {
		System.out.println("Hello World");
	}
	
}
