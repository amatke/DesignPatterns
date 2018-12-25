package ObserverDesign.example1;

import java.util.ArrayList;

public class Product implements Subject{

	String productName;
	
	ArrayList<Observer> observers;
	
	private boolean available;

	public Product(String productName) {
		super();
		this.productName = productName;
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		//this.observers.forEach( ob -> ob.update(productName));
		System.out.println("Notifying all observers!");
		for (Observer observer : observers) {
			observer.update(productName);
		}
	}
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
		if ( available == true) {
			notifyObservers();
		}
	}
	
	
}
