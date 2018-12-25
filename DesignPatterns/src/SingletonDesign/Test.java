package SingletonDesign;

public class Test {

	public static void main(String[] args) {
		
		Singleton.getInstance().someMethod();
		
		//new Singleton() ovo se nevidi jer je konstruktor private, i moze se pozivati samo iz same klase!
	}

}
