package ObserverDesign.example1;

public class main {

	public static void main(String[] args) {
		

		Customer customer1 = new Customer("Aleksa kupac");
		
		Customer customer2 = new Customer("Pera kupac");
		
		Product iphone6 = new Product("Iphone 6");
		
		
		iphone6.registerObserver(customer1);
		iphone6.registerObserver(customer2);
		
		iphone6.setAvailable(true);

		
	}

}
