package JiCheng;



class Fu{
	int x = 10 ;
	String name ;
	public Fu(String name){
		this.name = name ;
		System.out.println("���Ǹ����вεĹ��췽��");
	}
	public Fu(){
		System.out.println("���Ǹ����޲εĹ��췽��");
	}
}
class Zi extends Fu{
	int x = 20 ;
	public Zi(String name){
		super(name);//ָ�����ø���һ�������Ĺ��캯����
	}
	public void print(){
		System.out.println("x = "+x);
		System.out.println("x2 = "+ super.x);
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi("��ͷ����");//��ʱ������������x�����ڴ��п��ٿռ�
						//�ռ���һ�������ڱ���̳�������x��ר�����ڴ洢�̳���������������
		
		//z.print();//�ͽ�ԭ��
		System.out.println("name="+z.name);
		
	}

}
