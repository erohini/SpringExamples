package com.listener;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.dao.BaseDAO;

/**
 * Application Lifecycle Listener implementation class sampleListener
 *
 */
@WebListener
public class sampleListener implements ServletContextListener {

	Connection connection=null;
	
	public void contextInitialized(ServletContextEvent servletContextEvent)  { 
		System.out.println("****SampleListener: contextInitialized****");
		BaseDAO baseDAO=new BaseDAO();
		
		connection = baseDAO.getconnection();
		ServletContext servletContext= servletContextEvent.getServletContext();
		servletContext.setAttribute("connection", connection);
        
   }
    
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("****SampleListener: contextDestroyed****");
    	try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
         
    }

	
}
