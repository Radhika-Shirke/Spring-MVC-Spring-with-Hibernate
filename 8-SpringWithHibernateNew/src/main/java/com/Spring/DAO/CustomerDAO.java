package com.Spring.DAO;

import java.util.List;

import com.Spring.model.Customer;

public interface CustomerDAO {
	public void save(Customer customer);
	public List<Customer> fetchAllCustomer();
	public void update(Customer customer);
}
