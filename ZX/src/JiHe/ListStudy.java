package JiHe;

import java.util.ArrayList;
import java.util.List;
/*
 * 	List
 * 		���򣺲���ָ��Ȼ˳����ָ���˳�������˳��һ��
 * 	list�ӿ������еķ���:
 * 		��ӣ�
 * 			add(int index , E element)
 * 			addAll(int index , Collection<? extends E> c)
 * 		��ȡ:
 * 			get(int index)
 * 			indexOf(Object o )
 * 			LastIndexOf(Object o )
 * 			subList(int fromIndex , int toIndex)
 * 		�޸ģ�
 * 			set(int index , Collection)
 * 		������
 * 			listIterator()
 * 
 * */
public class ListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		//���򣬿��ظ�
		System.out.println(list);
	}

}
