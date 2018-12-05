package com.ujiuye.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Statement;
	/*
 		���ڴ��������ݿ�����ӣ��͹ر����ӵĹ��ܡ�
	*/
public class connectionFactory {
	private static String url = "jdbc:mysql://localhost:3306/JDBCtest";
	private static String username = "root";
	private static String password = "root";
	private static String driverClassName = "com.mysql.jdbc.Driver";
	
	
	/*
	  	�����������һ������   ��ʹ��Class.forName(driverClassName)��ע��һ������
	 	ʹ��DriverManager��getConnection��������һ��Connection���󣬴���url username password ������ӵĴ������������������
	*/
	public static Connection getCon(){   
		try {
			Class.forName(driverClassName);  //��������ע������
			Connection con = DriverManager.getConnection(url, username, password);   //ʹ��DriverManager��getConnection������������
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
