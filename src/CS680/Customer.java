package CS680;

import java.util.ArrayList;

public class Customer {

	private String firstName;
	private String lastName;
	private int id;
	private ArrayList<Address> addresses;
	
	
	
	public Customer() {
		super();
	}
	
	public Customer(String firstName, String lastName, int id, ArrayList<Address> addresses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.addresses = addresses;
	}


	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", addresses=" + addresses
				+ "]";
	}
	
	
}
