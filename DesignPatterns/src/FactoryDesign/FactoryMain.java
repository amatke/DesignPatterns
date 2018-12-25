package FactoryDesign;

import FactoryDesign.phone.Android;
import FactoryDesign.phone.FactoryOS;
import FactoryDesign.phone.OS;


/*U bilo kom trenutku mozemo da dodamo nove klase, a da ne narusimo kokncept aplikacije.
Za svaku klasu se treba obezbediti njena implementacija metode specification()*/

public class FactoryMain {

	public static void main(String[] args) {

		FactoryOS fos = new FactoryOS();
		OS instance = fos.getInstance("Open");
		//OS instance = fos.getInstance("Closed");
		//OS instance = fos.getInstance("alskda");
		instance.specification();
		
/*		OS obj = new Android();
		obj.specification();*/
	}

}
