package com.servletFilter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream.Filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/addAlien")
public class IdFilter implements javax.servlet.Filter {

	

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		int aid =  Integer.parseInt(req.getParameter("aid"));
		
		if(aid>1) {
			chain.doFilter(req, response);
		}
		
		
		PrintWriter out = response.getWriter();
		out.println("Welcome");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}



}
