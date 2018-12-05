package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class DieDai {
	@Test
	public void test1(){
		Collection c = new ArrayList();
		c.add(new Person("����",23));
		c.add(new Person("��ʣ",24));
		c.add(new Person("����",34));
		
		System.out.println(c ); // �������Person����дtoSting�������������ַ
		
		Iterator it = c.iterator(); //����������ϵĵ���������
		//ʹ��whileѭ��ʵ�ֵ���������
		while(it.hasNext()){ //hasNext()��ָ���ڼ��϶������鿴�Ƿ�����һ��Ԫ�أ�����У��򷵻�true
			Object obj = it.next();
			System.out.println(obj); // next() ,ȡ����һ��Ԫ�أ�ָ�������ƶ�һλ��
			
			//���뼯�ϵ�Ԫ��ΪObject���ͣ�Ϊ�˷���Ԫ�ص����Ժͷ�������Ҫ����ת��
			Person p = (Person)(obj);
			System.out.println(p.age);
			
			//ѭ���г�������next()������ָ��������ƶ���λ�����Ծ�����Ҫ��������next������
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