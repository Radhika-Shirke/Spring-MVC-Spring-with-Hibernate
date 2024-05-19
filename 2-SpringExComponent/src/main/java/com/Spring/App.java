package com.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.Spring.bean.Customer;
import com.Spring.configuration.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		
		/*
		 * BeanFactory factory = new XmlPathResource(new XmlpAth("springconfig.xml"));
		 * factory.getBean("cust", Customer.class);
		 */
		  
		/*
		 * BeanFactory factory= new XmlBeanFactory(new
		 * ClassPathResource("springconfig.xml"));
		 * factory.getBean("cust",Customer.class); System.out.println(factory);
		 */
			
		/*
		 * System.out.println("Setter Injection"); ApplicationContext context = new
		 * ClassPathXmlApplicationContext("springconfig.xml"); Customer customer
		 * =context.getBean("cust", Customer.class); System.out.println(customer);
		 */
			  
				/*
				 * System.out.println("\nConstructor Injection"); ApplicationContext context1 =
				 * new ClassPathXmlApplicationContext("springconfig.xml"); Customer customer1
				 * =context1.getBean("cust1", Customer.class); System.out.println(customer1);
				 */
    	
    	
				/*
				 * System.out.println("Object Injection By Setter byName"); ApplicationContext
				 * context = new ClassPathXmlApplicationContext("springconfig.xml"); Customer
				 * customer =context.getBean("cust", Customer.class);
				 * System.out.println(customer);
				 */
		  
    
    	
    	
    	System.out.println("Object Injection By Constructor"); 
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class); 
		  Customer customer = context.getBean("customer", Customer.class); 
		  System.out.println(customer);
		  
			/*
			 * Customer customer1 = context.getBean("cust", Customer.class);
			 * 
			 * System.out.println(customer1);
			 */
			 
    }
}
