package day16;

import java.util.Collections;
import java.util.TreeSet;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();
		set.add(123) ;
		set.add(1) ;
		set.add(764);
		set.add(535);
		System.out.println(set);
		Collections.reverseOrder();
		System.out.println(set);
	}

}
