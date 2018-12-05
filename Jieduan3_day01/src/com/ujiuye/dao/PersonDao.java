package com.ujiuye.dao;

import java.util.List;

import com.ujiuye.bean.Person;

//dao包用于指定规则，对每个对象要进行什么操作
public interface PersonDao {
	//添加一条person对象记录
	public boolean addPerson(Person per);
	
	//删除一条person对象记录
	public boolean deletePerson(int id);
	
	//修改一条person对象记录
	public boolean updatePerson();
	
	//查询person对象
	public List<Person> selectPerson();
}
