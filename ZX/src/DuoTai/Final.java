package DuoTai;
/*
 * final(���յ�   ���η�)
 * 	final���÷���
 * 		1��final����һ���������͵ı���ʱ���ñ����������¸�ֵ
 * 			��ֵ��һ�ε�ֵΪ���յġ�
 * 		2��final�ؼ�������һ��Ӧ�����ͱ���ʱ���ñ�����������ָ���µĶ���
 * 		3��final����һ��������ʱ�򣬸ú������ܱ���д
 * 		4������һ�����ʱ�򣬸��಻�ܱ��̳�
 * ���������η�һ��Ϊ  public static final.
 * 	ԭ��
 * 
 * */
class Ciecle{
	double r;
	final double pi = 3.14 ; // ���յı���,�̶�����
	public Ciecle(double r){
		this.r=r ;
	}
	public void getArea(){
		System.out.println("Բ�ε������:"+r*r*pi);
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ciecle c = new Ciecle(4.0);
		c = new Ciecle(5.0);//c����ָ��һ���µĶ���,final Ciecle c ��ʱc����ָ���µĶ���
		
		
	}

}
