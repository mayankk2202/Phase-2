package com.interfaceservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/interfaceservletdemo")
public class interfaceservletdemo implements Servlet {
	ServletConfig config=null;

    public interfaceservletdemo() {
        
    }

	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("Initialization is complete");
	}

	public void destroy() {
		System.out.println("inside destroy method");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	public String getServletInfo() {
		return "This is demo interface servlet"; 
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<html><body>");
		pw.print("In the service method");
		pw.print("<body><html>");
		destroy();
	}

}
