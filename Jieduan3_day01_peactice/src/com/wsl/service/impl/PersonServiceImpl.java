package com.wsl.service.impl;

import com.wsl.bean.Person;
import com.wsl.dao.CarDao;
import com.wsl.dao.PersonDao;
import com.wsl.impl.CarDaoImpl;
import com.wsl.impl.PersonDaoImpl;
import com.wsl.service.PersonService;

public class PersonServiceImpl implements PersonService {
	PersonDao pd= new PersonDaoImpl(); 
	CarDao cd = new CarDaoImpl();
	@Override
	public boolean addPeron(Person per) {
		if(pd.addPerson(per) && cd.addCar(per.getCar())){
			return true;
		}
		
		return false;
	}
	@Override
	public Person getPerson(int id) {
		return pd.getPerson(id);

	}

}
