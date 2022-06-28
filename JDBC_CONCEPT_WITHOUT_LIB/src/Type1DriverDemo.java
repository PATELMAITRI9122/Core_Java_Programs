import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Type1DriverDemo {

	static final String url = "jdbc:mysql://localhost:3306/maitridb";
	static final String user = "MaitriDB";
	static final String pass = "MaitriDB";
	
	
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MaitriDB","root","root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from maitridb.movies");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		
		con.close();

	}

}
