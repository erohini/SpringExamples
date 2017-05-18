package com.rohini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanFile.xml");
		Customer cust = (Customer) context.getBean("Customerbean");
		cust.getList();
		cust.getSet();
		cust.getMap();

	}

}
