package com.sessiontracking;

import com.DataTransferObject.*;
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
		user u1 = new user();
		HttpSession se1 = request.getSession();
		
		u1.setFname(request.getParameter("fname"));
		u1.setLname(request.getParameter("lname"));
		se1.setAttribute("User", u1);
		se1.setMaxInactiveInterval(60);
		response.sendRedirect("2nd_page.html");
	}

}
