package day25;

import java.lang.reflect.Constructor;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Class<?> c = null ;//����һ��class����try  catch���񴴽�ʱ���쳣
		try {
			c = Class.forName("day25.Person"); //������class�������Person��
		} catch (Exception e) {
			// TODO: handle exception
		}
		Person p = null ;
		try{
			
			p = (Person)c.newInstance();  //ʹ���޲ι��췽��
		}catch(Exception e){
			
		}
		System.out.println(p);
		Constructor<?> con = null ;
		try {
			con = c.getConstructor(String.class , int.class); //�вι��췽��,��������в�д��������޲�
			Person p1 = (Person)con.newInstance("zhangsan" , 18) ; // ���캯�����Σ�����޲Σ���ֻд����
			System.out.println(p1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
