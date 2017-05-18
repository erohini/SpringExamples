package com.rohini.ternaryExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {
	
	@Value("#{itemBean.quantity>50 and itemBean.quantity<25 ? true: false}")
	private boolean warning;

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}
	
	public String toString(){
		return "Warning: "+warning;
		
	}
}
