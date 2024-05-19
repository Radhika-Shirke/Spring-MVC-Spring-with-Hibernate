package com.Spring.model;

public class Customer {
	
	private String custId;
	
	private String custName;
	
	private String address;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer(String custId, String custName, String address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
	}
	
	
}

