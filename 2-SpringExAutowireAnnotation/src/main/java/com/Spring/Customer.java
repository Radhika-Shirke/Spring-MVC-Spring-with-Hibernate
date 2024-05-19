package com.Spring;

import org.springframework.beans.factory.annotation.*;

public class Customer {
	
	int id;
	String name;
	
	//Object Dependency
	
	@Autowired
	@Qualifier("contact1")
	Contact con;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getCon() {
		return con;
	}

	public void setCon(Contact contact) {
		this.con = contact;
	}

	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	/*
	 * @Autowired public Customer(@Qualifier("contact")Contact con) { super();
	 * this.con = con; }
	 */

	public Customer(int id, String name, Contact contact) {
		super();
		this.id = id;
		this.name = name;
		this.con = contact;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contact=" + con + "]";
	}
	
	

}
