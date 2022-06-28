package com.jdbc.part1;

/* 1. import package
 * 2. Load and Register Driver --> com.mysql.jdbc.Driver
 * 3. Create Connection
 * 4. Create a statement
 * 5. execute the query
 * 6. process the results
 * 7. close the connection
 * 
 */
import java.sql.*;

public class DemoJdbc {

	static final String url = "jdbc:mysql://localhost:3306/maitridb";
	static final String user = "root";
	static final String pass = "root";
	static String sql = "select * from student";
	static int rollno = 7;
	static int marks = 88;
	static String name = "ABC";
	// static String sql1 = "INSERT INTO student (`rollno`, `marks`, `name`) VALUES
	// ('6', '77', 'Darshi')";
	// static String sql1 = "INSERT INTO student (`rollno`, `marks`, `name`) VALUES
	// ("+ rollno + ",'" + marks + ",'" + name');
	static String sql1 = "INSERT INTO student (`rollno`, `marks`, `name`) VALUES (?, ?, ?)";

	public static void main(String[] args) {

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			
			// Statement stmt = con.createStatement(); //PreparedStatement -> dynamic
			PreparedStatement pstmt = con.prepareStatement(sql1);
			
			// ResultSet rs = stmt.executeQuery(sql); //DDL

			pstmt.setInt(1, rollno);
			pstmt.setInt(2, marks);
			pstmt.setString(3, name);

			int rows = pstmt.executeUpdate(); // DML

			System.out.println("Rows afftected: " + rows);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
