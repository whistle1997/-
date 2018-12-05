package com.wsl.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wsl.bean.Person;
import com.wsl.dao.PersonDao;
import com.wsl.util.connectionTool;

public class PersonDaoImpl implements PersonDao {

	@Override
	public boolean addPerson(Person per) {
		String sql = "insert into person(name,address,birthday,age) values(?,?,?,?)";
		
		Connection con = connectionTool.getCon();
		PreparedStatement ps = null;
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, "ÕÔÁù");
			ps.setString(2, "ÖØÇì");
			ps.setDate(3, null);
			ps.setInt(4, 25);
			
			int i = ps.executeUpdate();
			if(i > 0 ){
				return true;
			}
		}catch(Exception e){
			
		}
		return false;
	}

}
