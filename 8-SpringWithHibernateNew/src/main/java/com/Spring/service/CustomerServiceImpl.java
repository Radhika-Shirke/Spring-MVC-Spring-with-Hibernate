package com.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.DAO.CustomerDAO;
import com.Spring.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Transactional
	public void addCustomer(Customer customer) {
		customerDAO.save(customer);
	}

	@Override
	@Transactional
	public List<Customer> findAllCustomer() {
		return customerDAO.fetchAllCustomer();
		 
	}


}
