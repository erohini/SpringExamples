package com.rohini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SpringAOPPractice saop=(SpringAOPPractice) context.getBean("customerProxy");
		saop.printName();
		saop.printUrl();
		
		try {
			saop.printThrowException();
		} catch (Exception e) {
		}
		
	}
}
