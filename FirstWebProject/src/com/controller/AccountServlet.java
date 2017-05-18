package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AccountProcess")
public class AccountServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
	public static Connection getConnection(){
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","hr","hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	Connection connection;
	@Override
	public void init(ServletConfig config) throws ServletException {
		connection = LoginServlet.getConnection();
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		System.out.println("*****AccountServlet: service()*****");
		out.println("<html><body>");
		out.println("<h2 align=center>Home Page</h2>");
		String username=(String) request.getAttribute("username");
		String validated = (String) request.getAttribute("validated");
		
		if(validated.equals("true")){
			String query = "select * from register where username=?";
			
			PreparedStatement ps;
			try {
				ps = connection.prepareStatement(query);
				ps.setString(1,username);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()){
					out.println("Username: "+rs.getString("username"));
					out.println("<br>");
					out.println("Password: "+rs.getString("password"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		out.println("</body></html>");
	}
	
	@Override
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
