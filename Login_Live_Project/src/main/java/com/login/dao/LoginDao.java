package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class LoginDao {

	String sql = "select * from login where uname=? and pass=?";
	static final String url = "jdbc:mysql://localhost:3306/maitridb";
	static final String username = "root";
	static final String password = "root";

	public boolean check(String uname, String pass) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, uname);
			stmt.setString(2, pass);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
