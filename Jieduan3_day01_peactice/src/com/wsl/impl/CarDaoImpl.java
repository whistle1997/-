package com.wsl.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.wsl.bean.Car;
import com.wsl.dao.CarDao;
import com.wsl.util.C3p0DataSouce;

public class CarDaoImpl implements CarDao {

	@Override
	public boolean addCar(Car car) {
		String sql = "insert into car(cid,cdis) values(?,?)";
//		
//		Connection con = connectionFactory.getCon();
//		PreparedStatement ps = null ;
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, car.getCid());
//			ps.setString(2, car.getCdis());
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
		QueryRunner qr = new QueryRunner(C3p0DataSouce.getDs());
		try {
			if(qr.update(sql, car.getCdis(),car.getCdis())>0){
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
