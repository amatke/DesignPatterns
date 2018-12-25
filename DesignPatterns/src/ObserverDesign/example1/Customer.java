package ObserverDesign.example1;

public class Customer implements Observer{

	String customerName;
	
	private Subject subject;
		

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}

	@Override
	public void update(String productName) {
		System.out.println("HELLO "+ customerName + " PRODUCT " + productName + " IS AVAILABLE NOW!");	//
	}
	
	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
}
