package CS680;

public class Address {

	private String Street;
	private String city;
	private String state;
	private int zipCode;
	
	
	
	public Address() {
		super();
	}


	public Address(String street, String city, String state, int zipCode) {
		super();
		Street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
	
	
}
