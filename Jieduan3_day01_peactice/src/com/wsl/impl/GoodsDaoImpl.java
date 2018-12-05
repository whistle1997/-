package com.wsl.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.wsl.bean.Goods;
import com.wsl.dao.GoodsDao;
import com.wsl.util.C3p0DataSouce;

public class GoodsDaoImpl implements GoodsDao {
	QueryRunner qr = new QueryRunner(C3p0DataSouce.getDs());
	@Override
	public List<Goods> GoodsList() {
		String sql = "select gid,gname,gprice from goods";
		
//		ArrayList<Goods> map = new ArrayList<>();
//		Connection con = C3p0DataSouce.getCon();
//		PreparedStatement ps = null ;
//		
//		try {
//			
//			ps = con.prepareStatement(sql);
//			
//			ResultSet list = ps.executeQuery();
//	
//			while(list.next()){
//				Goods goods = new Goods();
//				goods.setGid(list.getInt(1));
//				goods.setGname(list.getString(2));
//				goods.setPrice(list.getDouble(3));
//				
//				map.add(goods);
//			}
//			
//			return map;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return null;
		
		
		try {
			List<Goods> list = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String GoodsName(int gid) {
		String sql = "select gname from goods where gid ="+gid;
//		Connection con = C3p0DataSouce.getCon();
//		PreparedStatement ps = null;
//		String name = null ;
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, gid);
//			ResultSet rs = ps.executeQuery();
//			rs.next();
//			name = rs.getString(1);
//			return name;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return null;
		try {
			Goods goods = qr.query(sql, new BeanHandler<Goods>(Goods.class));
			String name = goods.getGname();
			System.out.println(name);
			return name;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
