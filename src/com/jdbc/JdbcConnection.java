package com.jdbc;

import java.sql.*;
public class JdbcConnection {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student where id = 1");
		rs.next();
		int id  = rs.getInt("id");
		String name = rs.getString("name");
		String city = rs.getString("city");
		
		System.out.println(id +" "+ name +""+ city);
		st.close();
		con.close();
		
	}

}
