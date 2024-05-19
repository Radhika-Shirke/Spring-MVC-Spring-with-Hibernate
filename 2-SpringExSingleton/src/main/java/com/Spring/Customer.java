package com.Spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.*;

public class Customer  implements DisposableBean, InitializingBean{
	
	int id;
	String name;
	
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
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	/*
	 * public void myInitMethod() { System.out.println("Init method is called"); }
	 * 
	 * public void myDestroyMethod() {
	 * System.out.println("Destroy Method is called"); }
	 */

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method is called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method is called");		
	}
	

}
