package com.tek.Spring;

public class SpringHelloWorld {

	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void printHello(){
		System.out.println("Hello! "+name );
	}
}