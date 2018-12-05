package com.wsl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;




public class C3p0DataSouce {
	
	
	public static DataSource getDs(){
		ComboPooledDataSource ds = new ComboPooledDataSource();
		return ds;
	}
		
}
