package com.servletContent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		//k = k*k;
		/* printing on console
		
		System.out.println("Result is: " + k);
		*/
		
//		PrintWriter out = res.getWriter();
//		out.println("result is: " + k);
		
		//passing the value of k to sequareServlet
		//req.setAttribute("k",k);
		
		
		// Sending request and response from one servlet to another servlet
		// calling one servlet -> other servlet
		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		//Calling other servlet using sendredirect()
		//URL REWRITTING
		//res.sendRedirect("sq?k="+k);
		
		//SENDING DATA USING SESSION
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		//SENDING DATA USING COOKIE
		Cookie cookie = new Cookie("k", k+""); 
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
	}
}
