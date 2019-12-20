package com.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;

public class E021 {

	public static void main(String[] args) throws Exception {
		Connection conn=null;
		Statement yuju=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","12345");
		yuju=conn.createStatement();
		String sql="select * from tb_user";
			System.out.println("id   name   sex   email  birthday");
		
		/*String sq="select * from tb_user";
			conn=yuju.executeQuery(sql);
		 sql="id   name   sex   email  birthday";
		 while(rs) {
			 String name=rs.getString("name");
				String sex=rs.getString("sex");
				String email=rs.getString("email");
				Date birthday=rs.getDate("birthday");
		 }

*/
	}

	}
