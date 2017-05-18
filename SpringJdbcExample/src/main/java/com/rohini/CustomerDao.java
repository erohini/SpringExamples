package com.rohini;

public class CustomerDao {
	
	public Customer findByCustomerId(int custId){
		String sql="Select * from customer where CUST_ID=?";
		Customer customer = getSimpleJdbcTemplete()
	}

}
