package com.ujiuye.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Statement;
	/*
 		用于创建与数据库的链接，和关闭链接的功能。
	*/
public class connectionFactory {
	private static String url = "jdbc:mysql://localhost:3306/JDBCtest";
	private static String username = "root";
	private static String password = "root";
	private static String driverClassName = "com.mysql.jdbc.Driver";
	
	
	/*
	  	这个方法创建一个链接   ，使用Class.forName(driverClassName)来注册一个驱动
	 	使用DriverManager的getConnection方法创建一个Connection对象，传入url username password 完成链接的创建，并返回这个链接
	*/
	public static Connection getCon(){   
		try {
			Class.forName(driverClassName);  //创建对象，注册驱动
			Connection con = DriverManager.getConnection(url, username, password);   //使用DriverManager的getConnection方法创建连接
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void closeJDBC(Connection con , PreparedStatement ps){
		try{
			if(con != null){
				con.close();
			}
			if(ps != null){
				ps.close();
			}
		}catch(Exception e){
			
		}
		
	}
}
