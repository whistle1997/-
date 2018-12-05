package day16;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<Student> set = new TreeSet<Student>();
//		set.add(new Student("wsl" , 21));
//		set.add(new Student("wdj" , 18));
//		set.add(new Student("wsl" , 23));
//		set.add(new Student("wsl" , 21));
//		set.add(new Student("wsl" , 89));
//		//不实现compareable接口则不能存入，报错。
//		for(Object obj : set)
//			System.out.println(obj);
		
		
		
		//构造器直接定义Comparator
		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if(o1 instanceof Student && o2 instanceof Student){
					Student s1 = (Student)o1;
					Student s2 = (Student)o2;
					return s1.getName().length() - s2.getName().length();
				}else
					throw new ClassCastException("输入类型错误");
			}
			
			
		});
		set.add(new Student("wsl3" , 21));
		set.add(new Student("wdj" , 18));
		set.add(new Student("wsl54" , 23));
		set.add(new Student("wsl2224" , 21));
		set.add(new Student("wsl1" , 89));
		System.out.println(set);
		
		//创建类实现comparator方法
		TreeSet<Student> set2 = new TreeSet<Student>(new MyCompare());
		set2.add(new Student("wsl3" , 21));
		set2.add(new Student("wdj" , 18));
		set2.add(new Student("wsl54" , 23));
		set2.add(new Student("wsl2224" , 21));
		set2.add(new Student("wsl1" , 89));
		System.out.println(set2);
	}

}
class MyCompare implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student){
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			return s1.getName().length() - s2.getName().length();
		}else
			throw new ClassCastException("输入类型错误");
	}
	
}
class Student implements Comparable<Object>{
	private String name ; 
	private int age ;
	public Student(){}
	public Student(String name , int age){
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
		return "姓名："+name+" "+ "年龄:"+age;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Student){
			Student s = (Student)o;
			int m = name.compareTo(s.getName());
			if(m == 0){
				return age - s.getAge() ;
			}else
				return m ;
		}
		throw new ClassCastException("请输入正确的类型");
		
	}
}