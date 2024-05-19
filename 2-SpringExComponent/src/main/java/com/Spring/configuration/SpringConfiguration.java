package com.Spring.configuration;

import org.springframework.context.annotation.*;

import com.Spring.bean.Customer;

@Configuration
@ComponentScan(basePackages = "com.Spring.bean")
public class SpringConfiguration {
	
	
	public Customer customerBean()
	{
		Customer cust = new Customer();
		
		cust.setId(100);
		cust.setName("Rohit");
		return cust;
	}
	

}
