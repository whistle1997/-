package LianXi2;
/*��д����Frock�ࡣ
�����ߴ�size����ɫcolor���۸�price������ ������,��Ӧ���Ե�get/set����

��Frock��������˽�еľ�̬����currentNum����ʼֵΪ100000����Ϊ�·����������к���ʼֵ��
�������еľ�̬����getNextNum����Ϊ��������Ψһ���кŵķ�����ÿ����һ�Σ���currentNum����100������Ϊ����ֵ��*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frock f = new Frock();
		f.setColor("��ɫ");
		f.setPrice(180);
		f.setSize("xxxL");
		int m = f.getNextNum();
		System.out.println("�·��ߴ�Ϊ"+f.getSize()+","+f.getColor()+"�ۼ�"+f.getPrice()+",����Ψһ���к�Ϊ"+m);
	}

}
