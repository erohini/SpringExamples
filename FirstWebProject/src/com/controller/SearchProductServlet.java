package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.ProductDAO;
import com.vo.Product;

@WebServlet("/SearchProduct")
public class SearchProductServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	ProductDAO productDAO;
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		productDAO = new ProductDAO();
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("productID"));
		
		
		Product product = productDAO.getProductById(id);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Product Records </h2>");
		out.println("<table allign=center>");
		out.println("<tr><th>ProductId</th><th>ProductPrice</th><th>ProductDescription</th></tr>");
		
		out.println("<tr>");
		out.println("<td>"+product.getId()+"</td>");
		out.println("<td>"+product.getName()+"</td>");
		out.println("<td>"+product.getPrice()+"</td>");
		out.println("<td>"+product.getDescription()+"</td>");
		out.println("</tr>");
		
		out.println("</table>");
		out.println("</body></html>");
	}
	
	@Override
	public void destroy() {
		productDAO = null;
	}

}
