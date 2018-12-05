package com.wsl.dao;

import java.util.List;

import com.wsl.bean.Orders;
import com.wsl.bean.OtherObject;


public interface OrdersDao {
	
	//对订单进行的操作添加订单
	public boolean addOrders(Orders order,int gid);
	
	public List<OtherObject> getInfo(int id);
}
