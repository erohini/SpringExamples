package com.rohini;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int roeNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustId(rs.getInt("CUST_ID"));
		customer.setName(rs.getString("CUST_NAME"));
		customer.setAge(rs.getInt("CUST_AGE"));
		
		return customer;
	}

}
