package LianXi4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������������������:");
		Number n = new Number(in.nextInt() , in.nextInt());
		System.out.println("��Ϊ��"+n.addition());
		System.out.println("��Ϊ��"+n.subtration());
		System.out.println("��Ϊ��"+n.mult());
		System.out.println("��Ϊ��"+n.div());
	}
}
