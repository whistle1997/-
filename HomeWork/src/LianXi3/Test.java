package LianXi3;

import java.util.Scanner;

//3��
/*��дJava����ģ��򵥵ļ�������
������ΪNumber���࣬�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С���д���췽��������n1��n2��ʼֵ����Ϊ���ඨ��ӣ�addition����
����subtration�����ˣ�multiplication��������division���ȹ��г�Ա�������ֱ��������Ա����ִ�мӡ������ˡ��������㡣
��main�����д���Number��Ķ��󣬵��ø�������������ʾ��������*/

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("n1:");
		double n1 = in.nextInt();
		System.out.print("n2:");
		double n2 = in.nextInt();
		Number n = new Number(n1, n2);
		System.out.println("��Ϊ:"+n.addition());
		System.out.println("��Ϊ:"+n.sub());
		System.out.println("��Ϊ��"+n.mult());
		System.out.println("��Ϊ:"+n.div());
	}

}
