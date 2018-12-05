package com.wsl.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.wsl.bean.Orders;
import com.wsl.dao.OrdersDao;
import com.wsl.util.C3p0DataSouce;
import com.wsl.bean.OtherObject;

public class OrdersDaoImpl implements OrdersDao {
	QueryRunner qr = new QueryRunner(C3p0DataSouce.getDs());
	
	@Override
	public boolean addOrders(Orders order,int gid) {
		String sql = "insert into orders(oid,odis,count , per_ord) values(?,?,?,?)";
		boolean flag = false ;
		int i = 0;
		try {
			i = qr.update(sql, order.getOid(),order.getOdis(),order.getCount(),order.getPer().getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			flag = true;
		}
	    boolean nflag=false;
		if(flag){
	    	/*
	    	 * 如果订单添加成功
	    	 * 我们才回去向我们的关系表添加数据
	    	 * */
	    	String nsql="insert into orderitem(order_fk,goods_fk) values(?,?)";
	    	try {
				nflag = qr.update(nsql, order.getOid(),gid) > 0;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		if(flag&&nflag){
			return true;
		}
		return false;
	}

	@Override
	public List<OtherObject> getInfo(int id) {
		String sql ="SELECT g.gname,g.price,o.oid FROM goods g, orderitem od,(SELECT oid FROM orders WHERE per_fk="+id+") o WHERE o.oid=od.`order_fk` AND od.`goods_fk`=g.`gid`";
		try {
			List<OtherObject> list = qr.query(sql , new BeanListHandler<OtherObject>(OtherObject.class));
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}
	
	
	
//	@Override
//	public boolean addOrders(Orders ord) {
//		
//		String sql = "insert into orders(oid,odis,count,per_ord) values(?,?,?,?);";
//		try{
//			int i = qr.update(sql, ord.getOid(),ord.getOdis(),ord.getCount(),ord.getPer().getId());
//			if(i > 0){
//				return true;
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return false;
//	}

}
