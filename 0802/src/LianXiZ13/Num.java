package LianXiZ13;
/*���췽�������� 
����һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����  
 1��������������ֵ���ҳ����нϴ��һ��ֵ  
 2����������doubleֵ�������˻�   
3�����������ַ���ֵ��������Ƿ���ͬ   
4����main�����в��Թ��캯���ĵ���*/

public class Num {
	public Num(int a , int b){
		if(a > b)
			System.out.println(a);
		else if(b > a )
			System.out.println(b);
		else
			System.out.println("��");
	}
	public Num(double a , double b , double c){
		double x = a * b * c ;
		System.out.println(x);
	}
	public Num(String str , String str2){
		if(str.equals(str2))
			System.out.println("һ��");
		else
			System.out.println("��һ��");
	}
}
