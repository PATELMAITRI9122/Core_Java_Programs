package com.servletContent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SequareServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int k = 0;
		// EXTRACTING DATA USING COOKIE CONCEPT
		Cookie cookie[] = req.getCookies();

		for (Cookie c : cookie) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}

		// int k = (int)req.getAttribute("k");
		// getting parameter using URL re-wrriting concept
		// int k = Integer.parseInt(req.getParameter("k")) ;

		// Getting parameter using Session Management
//		HttpSession session = req.getSession();
//		
//		int k =  (int)session.getAttribute("k");

		k = k * k;

		PrintWriter out = res.getWriter();
		out.println("Result is: " + k);

		// to remove attribute from session list
		// session.removeAttribute("k");

		// System.out.println("Sq called");

	}

}
