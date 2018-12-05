package com.oracle.team.service;

public enum Status {
    FREE{
    	@Override
    	public String getInfo() {
    		// TODO Auto-generated method stub
    		return "FREE";
    	}
    }, BUSY{
    	@Override
    	public String getInfo() {
    		// TODO Auto-generated method stub
    		return "BUSY";
    	}
    }, VOCATION{
    	@Override
    	public String getInfo() {
    		// TODO Auto-generated method stub
    		return "VOCATION";
    	}
    };
    public abstract String getInfo() ;
}
