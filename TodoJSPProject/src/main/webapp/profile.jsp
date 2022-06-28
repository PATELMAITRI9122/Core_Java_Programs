<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	101<br>
	Maitri<br>
	JSP-JDBC<br><br>
	
	<!-- 
		Step 1: Import java.sql.*;
		Step 2: Load and Register Driver
			FOR MYSQL
			DRIVER: com.mysql.jdbc.Driver
			URL: jdbc:mysql://localhost:3306/maitridb
			USERNAME: root
			PWD: root
	 -->
	 
	 <%
	 	
	 	String url = "jdbc:mysql://localhost:3306/maitridb";
	 	String username = "root";
	 	String password = "root";
	 	String sql = "select * from student where rollno = 1";
	 	
	 	Class.forName("com.mysql.jdbc.Driver");
	 	Connection con = DriverManager.getConnection(url,username,password);
	 	Statement stmt = con.createStatement();
	 	
	 	ResultSet rs = stmt.executeQuery(sql);
	 	rs.next();
	 	
	 %>
	 
	 Roll No: <%= rs.getString(1) %> <br>
	 Marks: <%= rs.getString(2) %> <br>
	 Name: <%= rs.getString(3) %> <br>
	 
</body>
</html>