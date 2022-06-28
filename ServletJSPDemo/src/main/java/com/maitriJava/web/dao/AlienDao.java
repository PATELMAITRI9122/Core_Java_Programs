package com.maitriJava.web.dao;

import com.maitriJava.web.model.Alien;
import java.sql.*;

public class AlienDao {
	
	public Alien getAlien(int aid) {
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("Maitri");
		a.setTech("java");
		
		//import package
		try {
			//load Driver
			Class.forName("com.mysql.jdbc.Driver");
			//Connection Object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maitridb","root","root");
			//statement object
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from alien where aid="+aid);
			
			if(rs.next()) {
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}

}
