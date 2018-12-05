package com.wsl.service.impl;

import java.util.List;
import java.util.Map;

import com.wsl.bean.Goods;
import com.wsl.dao.GoodsDao;
import com.wsl.impl.GoodsDaoImpl;
import com.wsl.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	GoodsDao gdi = new GoodsDaoImpl();
	@Override
	public void GoodsList() {
		// TODO Auto-generated method stub
		
		List<Goods> list = gdi.GoodsList();
		System.out.println(list);
		
		for(Goods g : list)
			System.out.println(g.getGid()+":"+g);
	}
	@Override
	public String GoodsName(int gid) {
		// TODO Auto-generated method stub
		return gdi.GoodsName(gid);
	}

}
