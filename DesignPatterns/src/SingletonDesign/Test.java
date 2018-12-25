package SingletonDesign;

public class Test {

	public static void main(String[] args) {
		
		Singleton.getInstance().someMethod();
		
		//new Singleton() ovo se nevidi jer je konstruktor private, i moze se pozivati samo iz same klase!
	}

}

/*Obicno se koristi kod pools, zatim konekcija, ili threadPools.
Greske se javljaju jer postoje u nekim programima vise kopija nekih objekata 
za koje treba postojati samo jedan objekat.
Jedinstvena je instanca jer se moze kreirati samo iz sebe = private konstruktor.
Instancira se samo pozivom klase i njene staticne metode u kojoj se poziva taj 
privatni konstruktor.
To je sve!*/
