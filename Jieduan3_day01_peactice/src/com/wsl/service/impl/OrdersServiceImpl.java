package com.wsl.service.impl;

import com.wsl.bean.Orders;
import com.wsl.dao.OrdersDao;
import com.wsl.impl.OrdersDaoImpl;
import com.wsl.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {
	OrdersDao od = new OrdersDaoImpl();
	@Override
	public boolean addOrders(Orders ord , int gid) {
		// TODO Auto-generated method stub
		return od.addOrders(ord , gid);
	}

}
