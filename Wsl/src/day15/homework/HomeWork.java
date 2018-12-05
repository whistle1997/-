package day15.homework;

import java.util.ArrayList;

import org.junit.Test;

//去除重复元素
public class HomeWork {
	@Test
	public void test1(){
		ArrayList<Person> l = new ArrayList<Person>();
		l.add(new Person("张三"));
		l.add(new Person("张三"));
		l.add(new Person("李四"));
		l.add(new Person("王五"));
		l.add(new Person("赵六"));
		l.add(new Person("王五"));
		l.add(new Person("赵六"));
		//System.out.println(l);
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(l.get(0));
		for(int i = 1 ; i < l.size() ; i++){
			Person p = (Person)l.get(i);
			boolean flag = true ;
			for(int j = 0 ; j < list.size() ; j++){
				Person per = (Person)list.get(j) ;
				if(p.equals(per)){
					flag = false ;
					break;
				}
			}
			if(flag)
				list.add(p);
				
		}
		System.out.println(l);
		System.out.println(list);
	}
}
class Person{
	private String name ;
	public Person(String name){
		this.name = name ;
	}
	public String getName(){
		return name ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj ;
		if(this.name.equals(p.getName()))
			return true ;
		else
			return false ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名："+name;
	}
}