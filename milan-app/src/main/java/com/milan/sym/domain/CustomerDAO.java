package com.milan.sym.domain;

public interface CustomerDAO 
{
	void createCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void findCustimerById(long id);
	void findCustomerByName(String name);
	void deleteCustomer(Customer customer);
	

}