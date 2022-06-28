import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int i =  Integer.parseInt(req.getParameter("num1")) ;
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		//Advance Step: I wanted to pass the value of k to other servlet
		//Step 1: Create 2nd Servlet
		//Step 2: First Servlet create request dispathcher object
		//step 3: Map 2nd servlet to the web.xml file
		//step 4: set the attribute
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, resp);
		
		
//		PrintWriter out = resp.getWriter();
//		out.println(k);
		
	}

}
