package com.Spring.service;

import java.util.List;

import com.Spring.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public List<Customer> findAllCustomer();
	
}
