package question2;

public class Address {
	
	String street; 
	int number; 
	String state; 
	String city;
	
	public Address(String street, int number, String state, String city) {
		this.street = street; 
		this.number = number;
		this.state = state;
		this.city = city; 
	}
	
	
	@Override
	public String toString() {
		String msg = String.format("street: %s, number: %d, state: %s, city: %s", street, number, state, city);
		return msg; 
	}

}
