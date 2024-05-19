package com.Spring;

public class Customer {
	
	int id;
	String name;
	
	//Object Dependency
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
