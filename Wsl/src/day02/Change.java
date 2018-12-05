package day02;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt() ;
		int n = in.nextInt() ;
		int temp = 0;
		temp = m ;
		m = n ;
		n = temp ;
		System.out.println(m);
		System.out.println(n);

	}

}
