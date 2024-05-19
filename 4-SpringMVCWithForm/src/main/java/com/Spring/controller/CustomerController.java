package com.Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Spring.model.Customer;

@Controller
public class CustomerController {
	
	@RequestMapping(value = "/load")
	public String loadJsp(@ModelAttribute("custObj") Customer cust)
	{
		return "login";
	}
	
	
	@RequestMapping(value = "/log", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute("custObj") Customer cust)
	{
		ModelAndView model = new ModelAndView();
		
		model.addObject("cust_details", cust);
		model.setViewName("welcome");
		
		
		return model;
	}

}
