package com.hotelmgmt.domain;

public class TestPrefCustomer {

	public static void main(String[] args) 
	{
		PreferredCustomer johnRefernece = new PreferredCustomer("john","pogan",1001l);
		displayCustomerDetails(johnRefernece);
		
		PreferredCustomer mark = new PreferredCustomer("mark", "smith",1002l);
		displayCustomerDetails(mark);
		
		
		PreferredCustomer chris = new PreferredCustomer("chris","taylor",1003l);
		displayCustomerDetails(chris);


	}
	
	public static void displayCustomerDetails(PreferredCustomer john)
	{
		System.out.println(Customer.prefix);
		System.out.println("First Name "+john.getfName());
		System.out.println("Last Name "+john.getlName());	
		

		
	}

}
