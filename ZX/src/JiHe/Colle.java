package JiHe;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϣ������Ǵ洢�������ݵļ�������
 * 
 * �������ƣ�
 * 	1�����Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���͵�����
 * 	2�����ϵĳ����Ǳ仯�ģ�����ĳ����ǹ̶���
 *
 *	Collection�ӿڣ��Ǽ��ϵĽӿڣ��淶Լ��
 *	 
 *--------| Collection ���м��ϵĸ��ӿڡ�
 *-------------| Set �ص㣺���򣬲����ظ�
 *-------------| List �ص㣺���򣬿��ظ�
 * 
 *collection�еķ���
 *
 *
 *	���ӣ�
 *		add(E e)
 *		addAll(int index, Collection<? extends E> c) 
          	��ָ�� collection �е�����Ԫ�ض����뵽�б��е�ָ��λ�ã���ѡ��������
 *	ɾ����
 *		clear() 
          		�Ӵ��б����Ƴ�����Ԫ�أ���ѡ��������
          		remove()
          		removeAll()
          		retainAll()
 *	�鿴��
 *		size()
 *
 *	�жϣ�
 *		equals(Object o) 
          		��ָ���Ķ�������б��������ԱȽϡ�
 *
 *	������
 *		toArray()
 *		iterator()
 * */
public class Colle {
	public static void main(String[] args) {
		Collection c = new ArrayList();// �ӿڲ���ʵ��
		//add  ��ӳɹ�����true��ʧ�ܷ���false
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		boolean flag = c.add("������");
		System.out.println(flag);
		System.out.println(c);
		//addAll(Collection c) ��һ�����ϵ�Ԫ����ӵ���һ�����ϵ�Ԫ����
		Collection c2 = new ArrayList();
		c2.add("��ź�");
		c2.add("������");
		c2.add("����");
		//c.addAll(c2) ;// ��c2��Ԫ����ӵ�������ȥ
		
		//ɾ���ķ���
		//c.clear();//��ռ����е�Ԫ��
		//System.out.println(c.remove("������"));//ָ�������е�Ԫ��ɾ�����ɹ�����true��ʧ�ܷ���false
		
		//removeAll(Collection c)
		System.out.println(c2);
		//c.removeAll(c2); //ɾ��c�����еĽ���Ԫ��
		//retainAll()
		//c.retainAll(c2);//����c��������c2�Ľ���Ԫ�أ�����Ԫ��ɾ��
		//size() �鿴Ԫ�ظ���
		System.out.println("�鿴Ԫ�ظ�����"+c.size());
		
		System.out.println(c);
		
		
	}
}
