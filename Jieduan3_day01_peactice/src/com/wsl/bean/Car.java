package com.wsl.bean;

import java.io.Serializable;

public class Car implements Serializable{
	private int cid;
	private String cdis;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCdis() {
		return cdis;
	}
	public void setCdis(String cdis) {
		this.cdis = cdis;
	}
	
	
}
