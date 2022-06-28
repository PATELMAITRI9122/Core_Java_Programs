package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		LoginDao dao = new LoginDao();
		
		//Verify Username and password
		if(dao.check(uname, pass)) {
			
			//send data using HttpSession
			HttpSession session = req.getSession();
			session.setAttribute("username", uname);
			//call welcome.jsp
			resp.sendRedirect("welcome.jsp");
			
		}else {
			//if username and password do not match
			resp.sendRedirect("login.jsp");
		}
		
	}

}
