package day13;

import java.util.InputMismatchException;

class Person implements Comparable{
	private String name ;
	private int age ;
	public Person(String name , int age){
		this.name = name ;
		this.age = age ;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Person){
			Person p = (Person)o ;
			int num =  this.name.compareTo(p.name);
			if(num == 0){
				return this.age - p .age ;
			}else
				return num ;
		}else
			throw new InputMismatchException();
	}
	
}
public class LianXI {
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan" , 21) ;
		Person p2 = new Person("lisi" , 21) ;
		Person p3 = new Person("zhangsan" , 22) ;
		int num1 = p1.compareTo(p2);
		
	}
}
