package com.ServletFilterDemo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    public LoginFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String Userid = request.getParameter("userid");
		
		HttpServletResponse res = (HttpServletResponse) response; 
		if(Userid != null)
			chain.doFilter(request, response);
		else  res.sendRedirect("index.html");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Done!!!");
	}
}
