package com.rohini;

public class SpringAOPPractice {

	private String name;
	private String url;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setUrl(String url){
		this.url=url;
	}
	
	public void printName(){
		System.out.println("Name: "+name);
	}
	public void printUrl(){
		System.out.println("url: "+url);
	}
	
	public void printThrowException(){
		throw new IllegalArgumentException();
	}
}
