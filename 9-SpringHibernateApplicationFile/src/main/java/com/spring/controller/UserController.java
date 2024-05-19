package com.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PropertySource(value = "classpath:application.properties")
public class UserController {
 
	@Value("${Customer.id}")
	int id;
	@Value("${Customer.name}")
	String name;
	
	@Value("${User.id}")
	int id1;
	@Value("${User.name}")
	String name1;
	@RequestMapping("/go")
	public String loadJsp()
	{
		System.out.println("id =" + id + "name of customer =" +name);
		System.out.println("id =" + id1 + "name of customer =" +name1);
		return "login";
	}
}