package com.wsl.bean;

import java.io.Serializable;

public class Orders implements Serializable {
	private String oid;
	private String odis;
	private int count;
	private Person per;
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOdis() {
		return odis;
	}
	public void setOdis(String odis) {
		this.odis = odis;
	}
	
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "订单编号: +" + oid + ", 商品描述:" + odis + ",购买数量" + count;
	}
	
	
}	
