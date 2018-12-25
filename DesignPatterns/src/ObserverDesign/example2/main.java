package ObserverDesign.example2;

public class main {

	public static void main(String[] args) {
		
		PostOffice postOffice = new PostOffice();
		Person person1 = new Person("Aleksa");
		Person person2 = new Person("Pera");
		Mail mail = new Mail("Aleksa", "Matovic", "dobio su porukue");

		
		postOffice.registerObserver(person1);
		postOffice.registerObserver(person2);
		
		postOffice.addMail(mail);
	}

}
