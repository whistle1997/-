package com.wsl.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class connectionTool {
	private static String url = "jdbc:mysql://3306/JDBCtest";
	private static String user = "root";
	private static String password = "root";
	private static String DriverClassName = "com.mysql.jdbc.Driver";
	
	public static Connection getCon(){
		try {
			Class.forName(DriverClassName);
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			return con ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void closeAll(Connection con , PreparedStatement ps){
		try {
			if(con != null){
				con.close();
			}
			if(ps != null){
				ps.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
