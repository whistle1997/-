package JiHe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*������
	listIterator()
	�߱�iterator�ӿ����з���
	���еķ���:
		��ӣ�
		 hasPrevious()  ����û����һ��Ԫ��
		 previous()		��ǰָ�������ƶ�һ����λ����ȡ����ǰָ��ִ�е�Ԫ��
		 				���ƶ���ȡ
		 �Ա�next() : ��ȡԪ�����ƶ�
-----------------------------------		 
		 add(E e) �ѵ�ǰԪ�ز��뵽��ǰָ��ָ���λ����
		 set(E e) �滻���������һ�η��ص�Ԫ��
		 
*/
public class List_diedai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("����");
		list.add("��ʣ");
		list.add("����");
		list.add("����");
		
		ListIterator it = list.listIterator();//����һ��List�ӿ������еĵ�����
		/*it.next() ;
		System.out.println("����һ��Ԫ����?"+it.hasPrevious());//��ǰָ��ָ���0��Ԫ��
		System.out.println("��ȡ��һ��Ԫ�أ�"+it.previous());
		
		//�����������
		while(it.hasNext()){
			it.next();
		}
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}*/
		it.next();
		it.set("����");
		System.out.println(list);
	}

}
