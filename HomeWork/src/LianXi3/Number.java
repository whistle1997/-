package LianXi3;
/*3��
��дJava����ģ��򵥵ļ�������
������ΪNumber���࣬�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С���д���췽��������n1��n2��ʼֵ����Ϊ���ඨ��ӣ�addition��������subtration�����ˣ�multiplication����
����division���ȹ��г�Ա�������ֱ��������Ա����ִ�мӡ������ˡ��������㡣
��main�����д���Number��Ķ��󣬵��ø�������������ʾ��������*/

public class Number {
	private double n1 ;
	private double n2 ;
	
	public Number(double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double addition(){
		double x = n1 + n2 ;
		return x ;
	}
	public double sub(){
		double x = n1 - n2 ;
		return x ;
	}
	public double mult(){
		double x = n1 * n2 ;
		return x ;
	}
	public double div(){
		double x = n1 / n2;
		return x ;
	}
}
