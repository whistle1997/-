package day16;

import java.util.HashSet;

public class Demo01 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person("¹·µ°",12));
		set.add(new Person("¹·ÍŞ",12));
		set.add(new Person("¹·µ°",12));
		set.add(new Person("¹·ÍŞ",12));
		set.add(new Person("´óæ¤",14));
		for(Object obj : set)
			System.out.println(obj);
	}
}
class Person{
	private String name ; 
	private int age ;
	public Person(){}
	public Person(String name , int age){
		this.name = name ;
		this.age = age ;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ĞÕÃû£º"+name+" "+ "ÄêÁä:"+age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("--------");
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("==========");
		if(obj instanceof Person){
			Person p = (Person)obj;
			return name == p.getName() && age == p.getAge();
		}else
			throw new ClassCastException("ÀàĞÍ´íÎó");
	}
}