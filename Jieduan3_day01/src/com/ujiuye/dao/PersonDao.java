package com.ujiuye.dao;

import java.util.List;

import com.ujiuye.bean.Person;

//dao������ָ�����򣬶�ÿ������Ҫ����ʲô����
public interface PersonDao {
	//���һ��person�����¼
	public boolean addPerson(Person per);
	
	//ɾ��һ��person�����¼
	public boolean deletePerson(int id);
	
	//�޸�һ��person�����¼
	public boolean updatePerson();
	
	//��ѯperson����
	public List<Person> selectPerson();
}
