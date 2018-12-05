package com.wsl.dao;



import java.util.List;

import com.wsl.bean.Goods;

public interface GoodsDao {
	
	public List<Goods> GoodsList();	
	
	public String GoodsName(int gid);
}
