package LianXi4;
/*���췽�� 
��дJava����ģ��򵥵ļ������� 
������ΪNumber���࣬�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С�
��д���췽��������n1��n2��ʼֵ����Ϊ���ඨ��ӣ�addition��������subtration����
�ˣ�multiplication��������division���ȹ��г�Ա�������ֱ��������Ա����ִ�мӡ������ˡ��������㡣 
��main�����д���Number��Ķ��󣬵��ø�������������ʾ��������*/

public class Number {
	private int n1 , n2 ;
	public Number(int n1 , int n2){
		this.n1 = n1 ;
		this.n2 = n2 ;
	}
	public int addition(){
		int n = n1 + n2;
		return n ;
	}
	public int subtration(){
		int n = n1 - n2 ;
		return n ;
	}
	public int mult(){
		int n = n1 * n2 ;
		return n ;
	}
	public double div(){
		double x = n1 ;
		double x2 = n2 ;
		double n = x / x2 ;
		return n ;
	}
}
