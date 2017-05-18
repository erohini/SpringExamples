package com.rohini.javaConfig.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohini.javaConfig.Customer;
import com.rohini.javaConfig.Schedular;
import com.rohini.javaConfig.impl.Helper;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Helper.class);

		Customer customer = (Customer) context.getBean("customer");
		Schedular schedular = (Schedular) context.getBean("schedular");
		
		customer.getCategory("cust");
		schedular.getCategory("sched");
		
	}

}
