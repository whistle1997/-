package com.oracle.team.domain;

import com.oracle.team.service.Status;

public class Architect extends Designer{
	
	//-stock : int
	private int stock ; //�ɷ�
	private String position = "�ܹ�ʦ";
	public Architect(int m , int id, String name, int age, double salary, double bonus, int stock ,String position ,Equipment equipment) {
		super(m , id, name, age, salary,  bonus , position , equipment);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.Info() + "\t"+ stock + "\t"+super.getEquipment().getDescription();
	}
	
	
}
