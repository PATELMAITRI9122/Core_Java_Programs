import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDAO {

	public static void main(String[] args) {

		StudentDao dao = new StudentDao();
//		Student s1 = dao.getStudent(1);
//		System.out.println(s1.name);
		
		Student s2 = new Student();
		s2.rollno = 9;
		s2.marks = 96;
		s2.name = "Java";
		//dao.connect();
		dao.addStudent(s2);

	}

}

// one method -> perform all the opertaion such as database connectivity [read - update - insert - delete]
class StudentDao {

	//Connection con = null;
	static final String url = "jdbc:mysql://localhost:3306/maitridb";
	static final String user = "root";
	static final String pass = "root";
	
	public void connect() {
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public Student getStudent(int rollno) {

		Student s = new Student();
		s.rollno = rollno;

		// database connectivity
		try {

			String sql = "select name from student where rollno=" + rollno;

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			String name = rs.getString(1);
			s.name = name;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		return s;
	}*/

	public void addStudent(Student s) {
		String query = "insert into student values(?,?,?)";
		try {
				Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1, s.rollno);
				pstmt.setInt(2, s.marks);
				pstmt.setString(3, s.name);
			
				pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}

//only getter - setter
class Student {

	int rollno;
	int marks;
	String name;

}
