package com.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Spring.model.Customer;
import com.Spring.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	
	@RequestMapping("/load")
	public String goToBrowser(@ModelAttribute(name = "custinfo") Customer customer)
	{
		return "home";
	}

	
	@RequestMapping(value="/saveCustomer", method=RequestMethod.POST)
	//@ResponseBody
	public ModelAndView saveCustomer(@ModelAttribute(name = "customerAttribute") Customer customer)
	{
		customerService.addCustomer(customer);
		//return "Successfully added";
		return  new ModelAndView("redirect:/load");
	}
	@RequestMapping("/fetchCustomer")
	public String getAllCustomers(Model model)
	{
		
		model.addAttribute("customerList",customerService.findAllCustomer());
		return "welcome";
	}
	
}
