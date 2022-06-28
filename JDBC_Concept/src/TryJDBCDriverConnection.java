import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class TryJDBCDriverConnection {
	
	
	static final String Db_url = "jdbc:mysql://localhost/";
	static final String user = "MaitriDB";
	static final String pass = "MaitriDB";
	
	public static void main(String[] args) throws SQLException {
		
		try (Connection con = DriverManager.getConnection(Db_url,user,pass)){
			Statement stmt = con.createStatement();
		}
		
	}

}
