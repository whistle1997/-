package day17;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap map = new TreeMap();
		map.put(new Person("狗娃",18), "印度尼西亚");
		map.put(new Person("狗剩",19), "老挝");
		map.put(new Person("铁蛋",17), "越南");
		map.put(new Person("大美",23), "刚果布拉柴贝尔");
		System.out.println(map); //如果不实现compareable接口则会报错：ClassCastException
		Set set = map.keySet();
		for(Object obj : set){
			System.out.println(obj + "  " + map.get(obj));
		}
		System.out.println("\n\n\n");
		TreeMap map2 = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person)o1 ;
				Person p2 = (Person)o2 ;
				int num = p1.name.compareTo(p2.name);
				return num == 0 ? p1.age - p2.age : num ;
			}
		});
		map2.put(new Person("狗娃",18), "印度尼西亚");
		map2.put(new Person("狗剩",19), "老挝");
		map2.put(new Person("铁蛋",17), "越南");
		map2.put(new Person("大美",23), "刚果布拉柴贝尔");
		Set set1 = map2.entrySet();
		
		for(Object o : set1){
			Map.Entry me = (Map.Entry)o;
			System.out.println(me.getKey() + "  " + me.getValue());
		}
	}

}
class Person implements Comparable{
	int age ;
	String name ;
	public Person(String name , int age){
		this.age = age ;
		this.name = name ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名："+ name+" "+"年龄："+ age;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p = (Person)o;
		int num = this.age -p.age ;
		return num == 0 ? this.name.compareTo(p.name) : num ;
	}
}
