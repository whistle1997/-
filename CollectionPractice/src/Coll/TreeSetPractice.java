package Coll;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		set.add(new Person("����", 19));
		set.add(new Person("����", 17));
		set.add(new Person("����", 17));
		set.add(new Person("���", 16));
		//person ��û��ʵ��comparable�ӿڲ���дcompareTo���������ʱ�޷��Զ�����compareTo���������бȽ�
		System.out.println(set);
		
		//��������дһ����ʵ��Comparator�ӿڣ���дcompare����������ʵ����TreeSetʱ���Ƚ�����������
		Set set2 = new TreeSet(new MyCompare());
		set.add(new Person("����", 19));
		set.add(new Person("����", 18));
		set.add(new Person("����", 17));
		set.add(new Person("���", 16));
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