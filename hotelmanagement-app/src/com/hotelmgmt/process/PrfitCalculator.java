package com.hotelmgmt.process;

import com.hotelmgmt.domain.Customer;
import com.hotelmgmt.domain.PreferredCustomer;

public class PrfitCalculator 
{
	
	public int calculateBill(Customer cust, int food)
	{
		
		int price = food*100;
		
		return price;
	}
	
	public int calculateBill(PreferredCustomer cust, int food){
		
		int price = food*10;
		
		return price;
	}
	

}
