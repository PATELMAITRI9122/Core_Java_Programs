import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SequareServletApp extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Step1: Define doGet Method
		//Step 2: Get the attribute and convert into appropriate type
		
		//make an printwriteobject to writes
		
		int k = (int)req.getAttribute("k");
		k = k*k;
		
		PrintWriter out = resp.getWriter();
		out.println("Demo Night App Result is: " +k);
		
		
	}
	
	

}
