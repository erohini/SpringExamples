package com.tek.springLooselyCoupledExample.impl;

import com.tek.springLooselyCoupledExample.DIInterface;

public class CSVImpl implements DIInterface {
	public void getOutput(){
		System.out.println("CSV output file");
	}
}
