package People;
//5����Ҫ���дJavaӦ�ó���
//��1������һ������People���ࣺ
//���ԣ����������䡢�Ա����
//��Ϊ��˵��������ӷ�������
//��д��Ϊ�������Ը�ֵ�Ĺ��췽����
//��2�����������ࣺ
//����һ���������С����������Ա��С�������18�꣬���1.80��
//�øö�����ó�Ա������
//˵������ã���
//����23+45��ֵ
//�����ָ�Ϊ�����ġ�

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People("����", 18, "��",180);
		p.talk();
		int sum = p.sum();
		String name = p.changeName();
		System.out.println("��Ϊ:"+sum);
		System.out.println("����Ϊ:"+name);
	}

}
