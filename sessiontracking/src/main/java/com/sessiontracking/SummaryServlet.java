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

@WebServlet("/SummaryServlet")
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession se = request.getSession(false);
		
		if(se != null) {
			user u = (user) se.getAttribute("User");
			u.setCity(request.getParameter("city"));
			u.setContact(Long.parseLong(request.getParameter("cnumber")));
			
			PrintWriter out = response.getWriter();
			
			out.println("<html><body><h2> Hello "+u.getFname()+u.getLname()+"</h2>");
			out.println("<h3>Your details are as follows:<br>"+u);
			out.println("</h3><h4><br>Your session details are:<br>"
					+"Session ID:"+se.getId()
					+"<br>Session Creation time:"+se.getCreationTime()
					+"Inactive interval:"+se.getMaxInactiveInterval() +"</h4></html></body>");
			se.invalidate();
		} else { 
			PrintWriter out = response.getWriter();
			out.println("<html><body><h3 color=red>Invalid Session!!!</h3></html></body>");
			}
	}

}
