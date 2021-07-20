package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		out.print("<h1>Accessing config parameters - Servlet 1</h1>");
		out.print("<br>SQL = " + config.getInitParameter("sql"));
		out.print("<br>Message = " + config.getInitParameter("message"));
		
		ServletContext conf = getServletContext();
		out.print("<h1>Accessing context parameters - Servlet 1</h1>");
		out.print("<br>Driver = " + conf.getInitParameter("driver"));
		out.print("<br>URL = " + conf.getInitParameter("url"));
		
		out.print("<br><br><a href = servlet2>Trigger Servlet 2</a>");
		out.print("<br><br><a href = Index.html>Home</a>");
	}

}
