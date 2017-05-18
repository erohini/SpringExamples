package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(value="/registerProcess",initParams={@WebInitParam(name="driver",value="oracle.jdbc.driver.OracleDriver"),@WebInitParam(name="url",value="jdbc:oracle:thin:@localhost:1522:orcl")})
public class RegisterServlet extends GenericServlet implements Servlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		String driver = config.getInitParameter("driver");
		String url = config.getInitParameter("url");
		
		ServletContext context = config.getServletContext();
		
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
	}
	
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("*****RegisterServlet : service()*****");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		
		PrintWriter out = response.getWriter();
		out.println("You are successfully loged in...");
		out.println("<br>");
		
		out.println("UserName: "+username);
		out.println("<br>");
		out.println("firstname: "+firstname);
		out.println("<br>");
		out.println("email: "+email);
	}

}
