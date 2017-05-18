package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.BaseDAO;

@WebServlet("/LoginProcess")
public class LoginServlet extends GenericServlet implements Servlet {
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
		System.out.println("*****LoginServlet: service()*****");
		//ServletContext servletContext = request.getServletContext();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			String query = "select * from register where username=?";
	
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1,username);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				String dbPassword = rs.getString("password");
				if(dbPassword.equals(password)){
					request.setAttribute("username", username);
					request.setAttribute("validated", "true");
					RequestDispatcher dispatcher = request.getRequestDispatcher("AccountProcess");
					dispatcher.forward(request, response);
				}
				else{
					RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
					dispatcher.forward(request, response);
				}	
			}
			else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
				dispatcher.forward(request, response);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
