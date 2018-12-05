package com.wsl.bean;

import java.io.Serializable;

public class OtherObject implements Serializable {
	private String gname;
	private double price;
	private String oid;

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

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	@Override
	public String toString() {
		return "OtherObject [gname=" + gname + ", price=" + price + ", oid=" + oid + "]";
	}
	
 
}
