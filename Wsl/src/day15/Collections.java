package day15;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class Collections {
	@Test
	public void test1(){
		Collection c = new ArrayList();
		c.add("����");
		c.add("��ʣ");
		c.add("����");
		c.add(400823);//��ӣ�����������Զ�װ���Ϊ������
		System.out.println(c);
		System.out.println(c.size()); //������ϳ���
		c.remove("����");// �Ƴ�ָ��Ԫ��
		System.out.println(c);
		/*c.clear();//��ռ���
		System.out.println(c);*///����Ժ����[]����
		System.out.println(c.isEmpty());//�ж��Ƿ�Ϊ�գ�Ϊ����true
		Collection c2 = new ArrayList();
		c2.add("��ʣ");
		//c2.add("����");
		System.out.println(c.contains("��ʣ"));//�鿴�Ƿ��н���,����true  ����
		c.retainAll(c2); // �ж��Ƿ��н���,��������Ԫ�أ�ɾ������Ԫ��.
		System.out.println(c);
		
	}
}
