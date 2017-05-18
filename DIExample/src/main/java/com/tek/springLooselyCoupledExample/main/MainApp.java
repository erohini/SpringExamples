package com.tek.springLooselyCoupledExample.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tek.springLooselyCoupledExample.Helper;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-module.xml");
		Helper helper = (Helper) context.getBean("helper");
		helper.getOutput();
		
	}

}
