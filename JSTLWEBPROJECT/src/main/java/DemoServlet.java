import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Student> studs = Arrays.asList(new Student(1, "Maitri"), new Student(2, "Harsh"), new Student(3, "Brijesh"));
		
		Student s = new Student(9, "Maitri");

		req.setAttribute("Student", studs);

		// Calling jsp page from servlet
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}

}
