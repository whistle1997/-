package com.ujiuye.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import com.ujiuye.bean.Person;
import com.ujiuye.dao.PersonDao;
import com.ujiuye.util.connectionFactory;

public class PersonDaoImpl implements PersonDao {

	@Override
	public boolean addPerson(Person per) {
		
		Connection con = connectionFactory.getCon();
		PreparedStatement ps = null ;
		try {
			String sql = "insert into person(name,address,birthday,age) values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, per.getName());
			ps.setString(2, per.getAddress());
			ps.setDate(3,new java.sql.Date(per.getBirthday().getTime()));
			ps.setInt(4, per.getAge());
			int i = ps.executeUpdate();
			if(i > 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			connectionFactory.closeJDBC(con, ps);
		}
		
		return false;
	}

	@Override
	public boolean deletePerson(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePerson() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Person> selectPerson() {
		// TODO Auto-generated method stub
		return null;
	}

}
