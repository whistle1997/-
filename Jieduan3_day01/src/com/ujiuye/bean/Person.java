package com.ujiuye.bean;

import java.io.Serializable;
import java.util.Date;

/*
   建立数据模型需要实现Serializable接口，在网络传输中将对象序列化，提高网络传输速度
*/
public class Person implements Serializable{
	
	/*
	 	变量名要和表的字段一一对应
	*/
	private int id ;
	
	private String name;
	private String address;
	private Date birthday;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
