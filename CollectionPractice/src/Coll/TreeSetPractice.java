package Coll;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		set.add(new Person("狗娃", 19));
		set.add(new Person("铁蛋", 17));
		set.add(new Person("铁蛋", 17));
		set.add(new Person("大妞", 16));
		//person 类没有实现comparable接口并重写compareTo方法，添加时无法自动调用compareTo方法来进行比较
		System.out.println(set);
		
		//方法二：写一个类实现Comparator接口，重写compare方法，并在实例化TreeSet时将比较器传入其中
		Set set2 = new TreeSet(new MyCompare());
		set.add(new Person("狗娃", 19));
		set.add(new Person("铁蛋", 18));
		set.add(new Person("铁蛋", 17));
		set.add(new Person("大妞", 16));
		System.out.println(set2);
	}

}
class MyCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		if(o1 instanceof Person && o2 instanceof Person){
			Person p1 = (Person)o1 ;
			Person p2 = (Person)o2 ;
			int num = p1.getAge() - p2.getAge() ;
			//return num == 0 ? p1.getName().compareTo( p2.getName()) : num ;
			if(num == 0)
				return p1.getName().compareTo(p2.getName());
			return num ;
		}
		throw new ClassCastException();
	}
	
}