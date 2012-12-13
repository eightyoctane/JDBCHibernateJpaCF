package com.mkyong.customer.management;

import java.util.List;

import com.mkyong.customer.Customer;


public interface CustomerRepository {
	public boolean installCustomer(String name, String address, String state, String phone);
	public boolean removeCustomer();
	public Customer findCustomerByName(String name);
	public List <Customer> getCustomerList();
}
