package sss;
//ѧϰsuper�ؼ���
//super�ؼ��ִ����˸���ռ������
	//���ã�
/*
 * ���ã�
 * 	1���Ӹ������ͬ����Աʱ��Ĭ���������з��������Ա
 * 		��ͨ��super�ؼ���ָ�����ʸ����Ա
 *  2�������������ʱ��Ĭ���ȵ��ø����޲εĹ��췽��
 *  	����ͨ��super�ؼ��ֵ����вεĹ��췽��
 *  super�ؼ��ֵ��ø��๹�췽��ע�⣺
 *  	1�����������Ĺ��췽����û��ָ�����ø���Ĺ��췽������ô
 *  		java��������������Ĺ��췽���ϼ���super���
 *  	2��super�ؼ��ֵ��ø���Ĺ��캯��ʱ�������������๹�캯����
 *  		��һ�����
 *  	3��super��this�ؼ��ֲ���ͬʱ������һ�����캯����
 *  		���������Ĺ��캯������Ϊ������䶼��Ҫ��һ��ִ�С�
 *  	
 *  	super��this������
 *  		1����������ﲻһ��
 *  			super������ռ�����ã�this�������������ĵ����߶���
 *  		2��ʹ��ǰ�᲻һ��
 *  			super�����м̳й�ϵ����ʹ�ã�this����Ҫ�̳й�ϵҲ��ʹ��
 *  		3�����ù��캯��������
 *  			super���ø���Ĺ��캯����this���ñ���Ĺ��캯��
 *  
 * */
class Fu{
	int x = 10 ;
	String name ;
	
	public Fu(){
		System.out.println("����һ�������޲εĹ��췽��");
	}
	public Fu(String name){
		this.name = name ;
		System.out.println("������εĹ��췽��.");
	}
	public void eat(){
		System.out.println("Сͷ�ְֳԷ���");
	}
}
class Zi extends Fu{
	int x = 20 ;
	public Zi(String name ){
		super(name);
	}
	public void print(){
		System.out.println("x="+super.x);
	}
	public void eat(){
		System.out.println("��ͷ���ӳ���Ϻ");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi("����");
		z.print();//��������x
	}

}
