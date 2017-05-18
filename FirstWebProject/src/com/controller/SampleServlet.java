package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SampleServ")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
//		out.println("<h2 align=center> This is a sample servlet</h2>");
//		
//		Enumeration<String> enumeration = request.getHeaderNames();
//		
//		while(enumeration.hasMoreElements()){
//			String headerName = enumeration.nextElement();
//			
//			out.println("Header name: "+request.getHeader(headerName));
//			out.println("<br>");
		
		System.out.println("****** SampleServlet() *******");
		//String[] names={"Hary","Raj","Kumar"};
		//request.setAttribute("names", names);
		ArrayList<Item> items= new ArrayList<Item>();
		items.add(new Item(101,"hary",2400));
		items.add(new Item(102,"har",2200));
		items.add(new Item(103,"ha",2600));
		
		request.setAttribute("itemsList", items);
		//response.sendRedirect("login.html");
		RequestDispatcher rd = request.getRequestDispatcher("jstlTest.jsp");
		rd.forward(request, response);
		
		//}
		
	}

}
