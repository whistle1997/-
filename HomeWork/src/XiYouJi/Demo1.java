package XiYouJi;
/*1����Ҫ���дJavaӦ�ó���
��1����д���μ������ࣨXiYouJiRenWu��
���������У���ߣ�height�������֣�name����������weapon��
�����У���ʾ���֣�printName)����ʾ������printWeapon)
��2���������main�����д�����������zhuBaJie��sunWuKong�����ֱ�Ϊ��
�ǵ��������ԣ�name,weapon����ֵ�����ֱ����printName, printWeapon����
��ʾ�������������ֵ��*/

public class Demo1 {
	public static void main(String[] args) {
		XiYouJiRenWu zhuBaJie = new XiYouJiRenWu(180 , "��˽� " , "�ųݶ���");
		XiYouJiRenWu sunWuKong = new XiYouJiRenWu(180 , "�����" , "�𹿰�");
		zhuBaJie.printName();
		zhuBaJie.printWeapon();
		sunWuKong.printName();
		sunWuKong.printWeapon();
		
	}
	
}
