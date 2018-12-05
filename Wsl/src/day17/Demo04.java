package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//泛型
		//集合中的泛型（规定泛型中的数据类型）
		ArrayList<String> list = new ArrayList<>();//只允许存入String类型
		Collections.addAll(list, "weq","wqre","sdf"); //不能输入String类型以外的数据
		System.out.println(list);
		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() { //接口中规定类型

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
