package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		//�����еķ��ͣ��涨�����е��������ͣ�
		ArrayList<String> list = new ArrayList<>();//ֻ�������String����
		Collections.addAll(list, "weq","wqre","sdf"); //��������String�������������
		System.out.println(list);
		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() { //�ӿ��й涨����

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
			
		});
		set.add(123);
		set.add(567);
		set.add(234);
		set.add(1);
		System.out.println(set);
	}

}
