package com.sessiontracking;

import com.DataTransferObject.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servler2")
public class Servler2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession se = request.getSession(false);
		PrintWriter out = response.getWriter();
		
		if(se != null) {
			user u = (user) se.getAttribute("User");
			u.setAge(Integer.parseInt(request.getParameter("age")));
			u.setEmail(request.getParameter("email"));
			se.setAttribute("User", u);
			response.sendRedirect("3rd_page.html");
		} else { 
			out.println("<html><body><h3 color=red>Invalid Session!!!</h3></html></body>");
			}
		}
}
