package com.rohini.ternaryExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanFile.xml");
		Customer cust = (Customer) context.getBean("customerBean");
		System.out.println(cust);

	}

}
