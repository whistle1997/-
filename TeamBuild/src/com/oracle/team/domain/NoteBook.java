package com.oracle.team.domain;

public class NoteBook implements Equipment{
//	model: String
//	- price: double
	private String model ;
	private double price ;
	
	
	public NoteBook(String model, double price) {
		this.model = model;
		this.price = price;
	}


	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return model+"(" + price + ")";
	}

}
