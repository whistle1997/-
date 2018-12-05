package com.oracle.team.domain;


public class Designer extends Programmer {

	// -bonus : double
	private double bonus; // 奖金
	private String position = "设计师";
	public Designer(int m ,int id, String name, int age, double salary, double bonus ,String position , Equipment equipment) {
		super(m ,id, name, age, salary , position ,equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.Info() + "\t" + bonus + "\t\t" + super.getEquipment().getDescription();
	}
	
	@Override
	public String Info() {
		// TODO Auto-generated method stub
		return super.Info() + "\t" + bonus;
	}
}
