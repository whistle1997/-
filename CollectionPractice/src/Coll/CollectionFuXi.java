package Coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionFuXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection��һ����ڣ����ɱ�ʵ����
		Collection coll = new ArrayList(); //ͨ��ʵ����������ʵ������
		//��ӷ���
		coll.add("123");
		coll.add("1234");
		coll.add("12345");
		coll.add(new Person("����", 18));
		coll.add(new Person("����", 18));
		System.out.println(coll); //[123, 1234, 12345, ���������� ���䣺18, ���������� ���䣺18]
		//�ص㣺�����������˳����ͬ�������ظ������ʱû�е��ñȽϷ�������equals��compareTo��compare�ȣ�
		//���ʱ����������ͻ��Զ�װ��
		
		//��ȡ����
		System.out.println(coll.size());//5
		
		//�Ƴ�ָ��Ԫ��(����Boolean���ͽ��)
		System.out.println(coll.remove("123")); //true
		
		//���Ԫ��
		//coll.clear();
		//System.out.println(coll);// []
		
		//����
		//����һ
		for(Object obj : coll){
			System.out.println(obj);
			/*1234
			12345
			���������� ���䣺18
			���������� ���䣺18*/

		}
		//��������������
		Iterator it = coll.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		/*1234
		12345
		���������� ���䣺18
		���������� ���䣺18*/
		System.out.println("========================================================================");
		System.out.println();
		
		List list = new ArrayList();
		
		list.add("123");
		list.add(new Person("����", 18));
		list.add(new Person("����", 18));
		//��ָ��λ�����Ԫ��
		list.add(3 , new Person("��˧��" , 21));
		/*Iterator it1 = list.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next()); //���ϽǱ��0��ʼ��Ԫ��������Ǳ�Ϊ3��λ��
		}
		System.out.println(list.ge
		\t(0)); // ����ָ���������ض����Ԫ��
		
		System.out.println(list.remove(3)); //��������˧�� ���䣺21
		//ɾ��ָ��������Ӧ��Ԫ�أ����������Ԫ�ص�ֵ
*/		
		System.out.println(list.set(1 , "wdj")); //1234
		//�滻ָ��������Ӧ��Ԫ�أ��������޸�ǰ��ֵ
		
		ListIterator listIt = list.listIterator();//list���еĵ�����������ǰ�������������ʹ��������������е���ɾ�Ĳ�ȷ���
		System.out.println();
		listIt.add(345);
		while(listIt.hasNext()){
			
			System.out.println(listIt.next()); //�������±���
		}
		while(listIt.hasPrevious()){
			System.out.println(listIt.previous()); //�������ϱ���
		}
	}

}
