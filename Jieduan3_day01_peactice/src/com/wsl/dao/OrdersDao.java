package com.wsl.dao;

import java.util.List;

import com.wsl.bean.Orders;
import com.wsl.bean.OtherObject;


public interface OrdersDao {
	
	//�Զ������еĲ�����Ӷ���
	public boolean addOrders(Orders order,int gid);
	
	public List<OtherObject> getInfo(int id);
}
