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
//		//��ʵ��compareable�ӿ����ܴ��룬����
//		for(Object obj : set)
//			System.out.println(obj);
		
		
		
		//������ֱ�Ӷ���Comparator
		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if(o1 instanceof Student && o2 instanceof Student){
					Student s1 = (Student)o1;
					Student s2 = (Student)o2;
					return s1.getName().length() - s2.getName().length();
				}else
					throw new ClassCastException("�������ʹ���");
			}
			
			
		});
		set.add(new Student("wsl3" , 21));
		set.add(new Student("wdj" , 18));
		set.add(new Student("wsl54" , 23));
		set.add(new Student("wsl2224" , 21));
		set.add(new Student("wsl1" , 89));
		System.out.println(set);
		
		//������ʵ��comparator����
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
			throw new ClassCastException("�������ʹ���");
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
		return "������"+name+" "+ "����:"+age;
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
		throw new ClassCastException("��������ȷ������");
		
	}
}