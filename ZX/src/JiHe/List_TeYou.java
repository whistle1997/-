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
 * 
 * List�ӿ������еķ����߱����ص㣺�����ķ�������������ֵ��
 * 
 * ֻ��List�ӿ�����ļ�����ž߱�����ֵ�������ӿ�����ļ����඼û������ֵ
 * 		
 * 		������
 * 			listIterator()
 * 
 * */
public class List_TeYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("����");
		list.add("��ʣ");
		list.add("����"); // ��Ԫ����ӵ����ϵ�ĩβ��
		//��ӷ���
		/*list.add(1 , "�Ա�ɽ");*/ //��Ԫ����ӵ������е�ָ������ֵλ��
		/*List list2 = new ArrayList<>();
		list2.add("��ɽ");
		list2.add("С����");
		list.addAll(2 , list2);*/ 
		//��list2��Ԫ����ӵ�listָ������λ�õ�λ����
		
		
		//��ȡ����
		/*System.out.println(list.get(0));//��������ֵ��ȡ�����е�Ԫ��
		//��������Ԫ��
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println(list.indexOf("��ɽ"));//�ҳ�ָ��Ԫ���ڼ����е�һ�γ��ֵ�����ֵ
		System.out.println(list.lastIndexOf("����"));//�ҳ�ָ��Ԫ���ڼ��������һ�γ��ֵ�����ֵ
		List sublist = list.subList(1, 3) ;//ָ����ʼ�����������ֵ������ȡָ��Ԫ��
		System.out.println(sublist);*/
		
		
		//�޸ĵķ���
		list.set(0 , "��ɽ"); //ʹ��ָ����Ԫ���滻ָ������ֵ��Ԫ��
		
		System.out.println(list);
	}

}
