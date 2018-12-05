package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class DieDai {
	@Test
	public void test1(){
		Collection c = new ArrayList();
		c.add(new Person("狗娃",23));
		c.add(new Person("狗剩",24));
		c.add(new Person("铁蛋",34));
		
		System.out.println(c ); // 如果不在Person类重写toSting方法，则输出地址
		
		Iterator it = c.iterator(); //创建这个集合的迭代器对象
		//使用while循环实现迭代器遍历
		while(it.hasNext()){ //hasNext()，指针在集合顶部，查看是否有下一个元素，如果有，则返回true
			Object obj = it.next();
			System.out.println(obj); // next() ,取出下一个元素，指针向下移动一位。
			
			//存入集合的元素为Object类型，为了访问元素的属性和方法，需要向下转型
			Person p = (Person)(obj);
			System.out.println(p.age);
			
			//循环中出现两个next()方法，指针会向下移动两位。所以尽量不要出现两个next方法。
		}
	}
}
class Person{
	int age ;
	String name ;
	public Person(String name , int age){
		this.age = age ;
		this.name = name ;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "=====" +age;
	}
}