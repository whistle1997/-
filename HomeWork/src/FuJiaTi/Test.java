package FuJiaTi;
/*1������һ����ʾѧ����Ϣ����Student��Ҫ�����£�
��1����Student�ĳ�Ա������
sNO����ʾѧ�ţ�sName��ʾ������sSex��ʾ�Ա�sAge��ʾ���䣻sJava����ʾJava�γ̳ɼ���
��2����Student�������Ĺ��췽���� 
�ڹ��췽����ͨ���β���ɶԳ�Ա�����ĸ�ֵ������
��3����Student�ķ�����Ա��
getNo���������ѧ�ţ� 
getName��������������� 
getSex����������Ա�
getAge����������䣻
getJava���������Java �γ̳ɼ�
������Student�Ķ��壬�����������Ķ������ÿ��ѧ������Ϣ�����㲢��������ѧ��Java���Գɼ���ƽ��ֵ���Լ����㲢�������Java���Գɼ������ֵ����Сֵ��*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(01, "�ϴ�", "��", 21, 100);
		Student s2 = new Student(02, "�϶�", "��", 21, 95);
		Student s3 = new Student(03, "����", "��", 20, 90);
		Student s4 = new Student(04, "����", "��", 20, 85);
		Student s5 = new Student(05, "����", "��", 20, 80);
		System.out.println(s1.getsName()+" ѧ��:"+s1.getsNO()+"\t�Ա�:"+s1.getsSex()+"\t����"+s1.getsAge()+"\tjava�ɼ�"+s1.getsJava());
		System.out.println(s2.getsName()+" ѧ��:"+s2.getsNO()+"\t�Ա�:"+s2.getsSex()+"\t����"+s2.getsAge()+"\tjava�ɼ�"+s2.getsJava());
		System.out.println(s3.getsName()+" ѧ��:"+s3.getsNO()+"\t�Ա�:"+s3.getsSex()+"\t����"+s3.getsAge()+"\tjava�ɼ�"+s3.getsJava());
		System.out.println(s4.getsName()+" ѧ��:"+s4.getsNO()+"\t�Ա�:"+s4.getsSex()+"\t����"+s4.getsAge()+"\tjava�ɼ�"+s4.getsJava());
		System.out.println(s5.getsName()+" ѧ��:"+s5.getsNO()+"\t�Ա�:"+s5.getsSex()+"\t����"+s5.getsAge()+"\tjava�ɼ�"+s5.getsJava());
		int avg = (s1.getsJava()+s2.getsJava()+s3.getsJava()+s4.getsJava()+s5.getsJava()) / 5 ;
		System.out.println("ƽ���ɼ�Ϊ:"+avg);
		int[] java = new int[5];
		int min = s1.getsJava();
		if(s2.getsJava()<min)
			min = s2.getsJava();
		if(s3.getsJava() < min)
			min = s3.getsJava();
		if(s4.getsJava()<min)
			min = s4.getsJava();
		if(s5.getsJava()<min)
			min = s5.getsJava();
		System.out.println("��СֵΪ��"+min);
		int max = s1.getsJava();
		if(s2.getsJava()>max)
			max = s2.getsJava();
		if(s3.getsJava() >max)
			max = s3.getsJava();
		if(s4.getsJava()>max)
			max = s4.getsJava();
		if(s5.getsJava()>max)
			max = s5.getsJava();
		System.out.println("���ֵΪ��"+max);
	}

}
