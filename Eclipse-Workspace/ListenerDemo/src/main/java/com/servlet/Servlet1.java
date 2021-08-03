package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession se = request.getSession();
		System.out.println("Session Created, Listener invoked!!!");
		se.setAttribute("name", "Name1");
		se.setAttribute("Password", "pwd");
		System.out.println("Session has following Attributes: "+se.getAttributeNames());
		System.out.println("values of these attributes are: "
		+se.getAttribute("name")+" & "+se.getAttribute("Password"));
		System.out.println("Listener to come here.");
		se.setAttribute("Name", "Name2");
		System.out.println("Attribute Modified. Listener will be invoked.");
		se.invalidate();
		System.out.println("Session Destroyed.");		
	}

}
