package com.tek.springLooselyCoupledExample;

public class Helper {

	DIInterface diInterface;
	
	public void getOutput(){
		diInterface.getOutput();
	}

	public void setDiInterface(DIInterface diInterface) {
		this.diInterface = diInterface;
	}
	
	
}
