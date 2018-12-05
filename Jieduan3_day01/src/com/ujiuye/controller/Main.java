package com.ujiuye.controller;

import com.ujiuye.bean.Person;
import com.ujiuye.dao.PersonDao;
import com.ujiuye.impl.PersonDaoImpl;
import com.ujiuye.util.MyDateFatmat;

public class Main {
	
	static PersonDao pd = new PersonDaoImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person();
		per.setName("张三");
		per.setAddress("北京");
		per.setBirthday(MyDateFatmat.DateFatmat("1997-04-17"));
		per.setAge(28);
		
		pd.addPerson(per);
	}

}
