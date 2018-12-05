package com.wsl.dao;

import java.util.List;

import com.wsl.bean.Person;

public interface PersonDao {
	public boolean addPerson(Person per); //添加人
	
	public boolean deletePerson(int id); //按照id删除一条person记录
	
	public boolean updatePerson(Person per); //更改某条记录
	
	public List<Person> getAllInfo();
	
	public Person getPerson(int id);
	
//	public Person login(int id);
}
