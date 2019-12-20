package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Text_conn {
	public static void main(String[] args) throws Exception {
		//驱动
		Class.forName("com.mysql.jdbc.Driver");
		//连接
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","12345");
		// 通过连接对象获取语句对象
		Statement yuju=conn.createStatement();
		//定义sql语句
		String sql="UPDATE tb_user set email = 'Jack@126.com' where id=1";
		//执行sql语句
		yuju.execute(sql);
				
	}

}
