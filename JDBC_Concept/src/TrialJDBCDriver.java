
import java.sql.*;

public class TrialJDBCDriver {
	
	public static void main(String[] args)  {
		
		try {
			// 1. Get Connection
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/demo","MaitriDB","MaitriDB");
					
					//username: MaitriDB -> pwd: MaitriDB
					//db name: demo 
					//table name: persons
			
			//2. Create Statement
			Statement stmt = con.createStatement();
			
			//3. Execute SQL query
			ResultSet rs = stmt.executeQuery("select * from persons");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "..." + rs.getString(1));
			}
			
			//4. Process Resultset
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
