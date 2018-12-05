package com.wsl.bean;

import java.io.Serializable;

public class Goods implements Serializable {
	private int gid;
	private String gname;
	private double price;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "商品名：" + gname + ",价格" + price;
	}
	
	
}
