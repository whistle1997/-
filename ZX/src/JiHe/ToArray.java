package JiHe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		Object[] arr = c.toArray();//Object���Խ���������������
		//�Ѽ����е�Ԫ��ȫ���洢��һ��Object�����з���
		System.out.println("�����е�Ԫ��:"+ Arrays.toString(arr));
	*/
		Collection c = new ArrayList();
		c.add(new Person(110 , "����"));
		c.add(new Person(110 , "��ʣ"));
		c.add(new Person(110 , "����"));
		Object[] arr = c.toArray();
		//�ѱ��110���˵���Ϣ���
	}

}
