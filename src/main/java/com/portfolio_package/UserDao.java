package com.portfolio_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserDao {
	
	public User getUser(int id) {
		User u = new User();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","123123");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT name, password FROM user where id = " + id);
		if(rs.next()) {
			u.setUserName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		return u;
		
	}

}
