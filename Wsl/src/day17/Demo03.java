package day17;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ��ö��ֵ
		Sex nan = Sex.male; //������male����
		nan.function();//����male�����function����
		System.out.println(nan.name);
		nan.show();
		System.out.println();
		Sex nv = Sex.famale;
		nv.function(); // famale��function
		System.out.println(nv.name); //��Ա����������
	}

}

enum Sex{
	male("����"){
		public void function(){
			System.out.println("��");
		}
	}, famale{
		public void function(){
			System.out.println("Ů");
		}
	};  //ö����������ö��ֵ��ֻ���Դ�����������
	//��ͬ��
	private Sex(){}
	//public static Sex male = new male();
	//�ɴ�����Ա����
	String name;
	//��Ա����
	public void show(){
		System.out.println("����һ��ö����");
	}
	//���췽��
	//�޲κ��вξ���,Ĭ�ϵ����޲�
	private Sex(String name){
		this.name= name ;
	}
	//���󷽷�,��Ҫ��ö��ֵ��д
	public abstract void function();
}