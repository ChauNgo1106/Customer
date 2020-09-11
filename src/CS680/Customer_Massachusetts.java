package CS680;

import java.util.ArrayList;

public class Customer_Massachusetts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initiating data
		ArrayList<Address> addr = new ArrayList<>();
		addr.add(new Address("22 Orkney road, #42 apt" , "Brighton" , "MA" , 02131));
		addr.add(new Address("23 Orkney road, " , "Brighton" , "MA" , 02136));
		Customer cm = new Customer ("Chau" , "Ngo" , 1749029 , addr);
		System.out.println(cm.toString()+ "\n");
		//print all address out for particular customer. 
		for(Address adr : addr ) {
			System.out.println(adr);
		}
	}

}
