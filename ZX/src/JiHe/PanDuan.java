package JiHe;

import java.util.ArrayList;
import java.util.Collection;

/*�жϣ�
 * 	isEmpty()
 * 	contains(Object o)
 * 	containsAll(Collection c)
 * 
 *������
 *	toArray()
 *		���ؼ���������Ԫ�ص����� 
 * */
class Person{
	int id ;
	String name ;
	public Person(int id , String name){
		this.id = id ;
		this.name = name ;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{��ţ�"+this.id + "������"+this.name+"}";
	}
	public boolean equals(Object obj){
		Person p = (Person)obj ;
		return this.id == p.id;
	}
	//java�Ĺ淶,һ����д��equals������һ�㶼��дhashCode����
	public int hashCode(){
		return this.id;
	}
}
public class PanDuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		System.out.println("�жϼ����Ƿ��Ԫ�أ�"+ c.isEmpty());
		System.out.println("�ж��Ƿ����ָ��Ԫ��:"+ c.contains("��ź�"));
		*/
		//����Զ���Ԫ��
		Collection c = new ArrayList();
		c.add(new Person(110 , "����"));
		c.add(new Person(110 , "��ʣ"));
		c.add(new Person(110 , "����"));
		// �������ʵ�����У�ֻ�����֤һ�¾�Ϊͬһ����
		System.out.println("���ڸ�Ԫ����"+ c.contains(new Person(110 , "����")));
		//contains������equals����  �õ�ʵ�ε�equals���������Ǽ������ݵ�equals
		
		//containsAll�Ƚ�����Ԫ�أ�һ���д�����
		Collection c2 = new ArrayList() ;
		c2.add(new Person(110 , "����"));
		c2.add(new Person(110 , "chens��ʣ"));
		c2.add(new Person(100 , "����"));
		System.out.println(c.containsAll(c2));
		System.out.println(c);//��Ҫ����toString
	}

}
