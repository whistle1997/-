package com.wsl.dao;

import java.util.List;

import com.wsl.bean.Person;

public interface PersonDao {
	public boolean addPerson(Person per); //�����
	
	public boolean deletePerson(int id); //����idɾ��һ��person��¼
	
	public boolean updatePerson(Person per); //����ĳ����¼
	
	public List<Person> getAllInfo();
	
	public Person getPerson(int id);
	
//	public Person login(int id);
}
