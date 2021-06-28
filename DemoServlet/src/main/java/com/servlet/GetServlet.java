package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private String mymsg;
	
	public void init() throws ServletException {
		mymsg = "Servlet Demo";
	}

	public GetServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1 align = center>"+mymsg+"</h1>");
		pw.println("<h2>"+"I am loving it"+"<h2>");
	}

}
