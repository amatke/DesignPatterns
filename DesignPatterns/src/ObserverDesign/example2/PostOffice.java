package ObserverDesign.example2;

import java.util.ArrayList;

public class PostOffice implements Subject{

	private ArrayList<Mail> allMails;
	
	private ArrayList<Observer> observers;
	
	public PostOffice() {
		allMails = new ArrayList<>();
		this.observers = new ArrayList<Observer>();
	}
	
	public void addMail(Mail m) {
		allMails.add(m);
		Notify();
	}
	
	public ArrayList<Mail> getAllMails() {
		return allMails;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void Notify() {
		observers.forEach( o -> o.update(this));
	}
}
