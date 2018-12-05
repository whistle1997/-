package com.oracle.team.domain;

import com.oracle.team.service.Status;

public class Programmer extends Employee{
//	- memberId : int - status: Status
//	- equipment: Equipment
	
	private int memberId ; //��¼��Ա���뿪���ŶӺ����Ŷ��е�ID
	private Status status = Status.FREE; //mö�٣���ʾԱ��״̬
	private Equipment equipment ; // �䱸���豸
	private String position;
	
	private int  m ;
	public Programmer(int m ,int id, String name, int age, double salary , String position , Equipment equipment) {
		super(id, name, age, salary);
		this.m = m ;
		this.position = position ;
		this.equipment = equipment ;
	}
	public int getM(){
		return m ;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t"+ this.position  + "\t" +status.getInfo() + "\t\t\t" + equipment.getDescription();
	}
	public String Info(){
		return super.toString() + "\t"+ this.position  + "\t" +status.getInfo() ;
	}
}
