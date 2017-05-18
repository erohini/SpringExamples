package com.rohini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohini.helper.OutputHelper;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Context.xml");
		OutputHelper helper = (OutputHelper) context.getBean("outHelp");
		helper.getOutput();
	}

}
