import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.servletFilter.HttpServletRequest;

public class IdFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		javax.servlet.http.HttpServletRequest req = (javax.servlet.http.HttpServletRequest)request;
		
		int aid =  Integer.parseInt(req.getParameter("aid"));
		
		if(aid>1) {
			chain.doFilter(req, response);
		}
		
		
		PrintWriter out = response.getWriter();
		out.println("Welcome");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
