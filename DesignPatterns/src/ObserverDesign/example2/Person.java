package ObserverDesign.example2;

import java.util.ArrayList;

public class Person implements Observer {

	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update(Object o) {
		if(o instanceof PostOffice) {
			PostOffice po = (PostOffice) o;
			checkMail(po.getAllMails());
		}
	}

	private void checkMail(ArrayList<Mail> allMails) {
		for (Mail mail : allMails) {
			if (mail.receiverName.equals(name)) {
				System.out.println(name + ": " + mail.content);
			}
		}
	}
	
	
}
