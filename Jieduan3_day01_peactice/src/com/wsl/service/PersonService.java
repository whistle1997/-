package com.wsl.service;

import com.wsl.bean.Person;

public interface PersonService {
	public boolean addPeron(Person per);
	
	public Person getPerson(int id);
}
