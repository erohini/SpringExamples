package com.rohini.javaConfig;

import com.rohini.javaConfig.impl.JavaConfigImpl;

public class Customer implements JavaConfigImpl {

	public void getCategory(String msg) {
		System.out.println("Customer: "+msg);
	}
	
}
