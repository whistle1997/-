package com.wsl.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.wsl.bean.Person;
import com.wsl.dao.PersonDao;
import com.wsl.util.C3p0DataSouce;


public class PersonDaoImpl implements PersonDao{
	QueryRunner qr = new QueryRunner(C3p0DataSouce.getDs());
	@Override
	public boolean addPerson(Person per) {
		String sql = "insert into person(id,name,address,birthday,age) values(?,?,?,?,?)";
		try{
			int i = qr.update(sql);
			if(i > 0)
				return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
		
//		Connection con = connectionFactory.getCon();
//		PreparedStatement ps = null ;
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, per.getId());
//			ps.setString(2,per.getName());
//			ps.setString(3, per.getAddress());
//			ps.setDate(4, new java.sql.Date(per.getBirthday().getTime()));
//			ps.setInt(5, per.getAge());
//			int i = ps.executeUpdate();
//			if(i > 0){
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			connectionFactory.closeAll(con, ps);
//		}
		
	}

	@Override
	public boolean deletePerson(int id) {
		String sql = "delete from person where id = ?";
		
		try {
			int i = qr.update(sql, id);
			if(i > 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
//		Connection con = C3p0DataSouce.getCon();
//		PreparedStatement ps = null;
//		try {
//			ps =con.prepareStatement(sql);
//			ps.setInt(1, id);
//			int i = ps.executeUpdate();
//			if(i > 0){
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			C3p0DataSouce.closeAll(con, ps);
//		}
//		return false;
	}

	@Override
	public boolean updatePerson(Person per) {
		String sql = "update person set name = ? , address = ? , birthday = ? , age = ? where id = 2";
		
		try {
			int i = qr.update(sql, per.getName(),per.getAddress(),new java.sql.Date(per.getBirthday().getTime()),per.getAge());
			if(i > 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
//		Connection con = C3p0DataSouce.getCon();
//		PreparedStatement ps = null ;
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setString(1,per.getName());
//			ps.setString(2, per.getAddress());
//			ps.setDate(3, new java.sql.Date(per.getBirthday().getTime()));
//			ps.setInt(4, per.getAge());
//			int i = ps.executeUpdate();
//			if(i > 0){
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			C3p0DataSouce.closeAll(con, ps);
//		}
//		return false;
	}

	@Override
	public List<Person> getAllInfo() {
		String sql = "select id,name,address,birthday,age from person";
		
		try {
			List<Person> list = qr.query(sql, new BeanListHandler<Person>(Person.class));
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
//		Connection con = C3p0DataSouce.getCon();
//		PreparedStatement ps = null ;
//		ArrayList<Person> list = new ArrayList<>(); 
//		try {
//			ps = con.prepareStatement(sql);
//			ResultSet li = ps.executeQuery();
//			while(li.next()){
//				Person per = new Person();
//				per.setId(li.getInt(1));
//				per.setName(li.getString(2));
//				per.setAddress(li.getString(3));
//				per.setBirthday(li.getDate(4));
//				per.setAge(li.getInt(5));
//				
//				list.add(per);
//			}
//			return list;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			C3p0DataSouce.closeAll(con, ps);
//		}
//		return null;
	}
	
	public Person getPerson(int id){
		String sql = "select id,name,address,birthday,age from person where id = " + id;
		
		try {
			Person per = qr.query(sql, new BeanHandler<Person>(Person.class));
			return per;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
//		Connection con = C3p0DataSouce.getCon();
//		PreparedStatement ps = null ;
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, id);
//			ResultSet li = ps.executeQuery();
//			li.next();
//			Person per  = new Person();
//			per.setId(li.getInt(1));
//			per.setName(li.getString(2));
//			per.setAddress(li.getString(3));
//			per.setBirthday(li.getDate(4));
//			per.setAge(li.getInt(5));
//			
//			return per;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}finally{
//			C3p0DataSouce.closeAll(con, ps);
//		}
//		return null;
	}

//	@Override
//	public Person login(int id) {
//		String sql = "select id,name,address,birthday,age from id = ?";
//		if(setSQL.setSql(sql, id) > 0){
//	
//		}
//		return null;
//	}
}
