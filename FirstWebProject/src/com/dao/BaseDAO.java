package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

	public Connection getconnection(){
		
		Connection connection = null;
		try{
			//load Drivers
			Class.forName("oracle.jdbc.OracleDriver");
			
//			// Establish Connection
			connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","hr","hr");
			
		}catch(Exception e){
			e.printStackTrace();
			}
		
		return connection;
	}

	
}
