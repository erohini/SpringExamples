package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateUsernameServlet
 */
@WebServlet("/validateUsername")
public class ValidateUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<String> usernamesList = new ArrayList<String>();
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		usernamesList.add("Sairam");
		usernamesList.add("Kavya");
		usernamesList.add("Rohini");
		usernamesList.add("Dheeraj");
		usernamesList.add("Geethika");
		usernamesList.add("Radhika");
	}
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		
		PrintWriter out=response.getWriter();
	
		if(usernamesList.contains(username)){
			out.println("<font color='red'>Username already taken</font>");
		}
		else{
			out.println("<font color='red'>Username is available</font>");
		}
	}

}
