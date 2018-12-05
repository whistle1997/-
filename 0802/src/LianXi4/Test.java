package LianXi4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("输入两个数进行运算:");
		Number n = new Number(in.nextInt() , in.nextInt());
		System.out.println("和为："+n.addition());
		System.out.println("差为："+n.subtration());
		System.out.println("积为："+n.mult());
		System.out.println("商为："+n.div());
	}
}
