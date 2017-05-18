package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDAO;
import com.vo.Product;

@WebServlet("/AllProductServ")
public class AllProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductDAO productDAO;
	
	@Override
	public void init() throws ServletException {
		productDAO = new ProductDAO();
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("application/msword");
		List<Product> products = productDAO.getProduct();
		
		request.setAttribute("products", products);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("productRecords.jsp");
		requestDispatcher.forward(request, response);
		
		//Presentation Logic
//		PrintWriter out= response.getWriter();
//		out.println("<html><body>");
//		out.println("<h2 align=center>Product Records</h2>");
//		out.println("<table align=center border=2>");
//		out.println("<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductDescription</th></tr>");
//		
//		for(Product product:products){
//			out.println("<tr>");
//			out.println("<td>"+product.getId()+"</tr>");
//			out.println("<td>"+product.getName()+"</tr>");
//			out.println("<td>"+product.getPrice()+"</tr>");
//			out.println("<td>"+product.getDescription()+"</tr>");
//			out.println("</tr>");
//		}
//		
//		out.println("</table></body></html>");
//				
	}


}
