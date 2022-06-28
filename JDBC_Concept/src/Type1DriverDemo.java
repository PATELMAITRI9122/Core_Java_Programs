import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Type1DriverDemo {
	
	//username: MaitriDB pwd: MaitriDB
	//Database Name: maitridb
	//table name: movies
	
	
	static final String url = "jdbc:mysql://localhost:3306/maitridb";
	static final String user = "MaitriDB";
	static final String pass = "MaitriDB";
	
	public static void main(String[] args) throws Exception {
		
		//Step-1 Load and Register Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Establish Connection
		Connection con = DriverManager.getConnection(url,user,pass);
		
		//Create statement object -> to send sql query
		Statement stmt = con.createStatement();
		
		//send sql query using ResultSet
		ResultSet rs = stmt.executeQuery("select * from maitridb.movies");
	
		//Get result from DB
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		
		//Close Connection
		con.close();
		
	}

}
