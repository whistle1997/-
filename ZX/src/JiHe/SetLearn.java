package JiHe;

import java.util.HashSet;
import java.util.Set;

/*
Set���ϣ�
	�������Ԫ�ص�˳����Ԫ�س�����˳��һ��
�����еķ���
*/
public class SetLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("����");
		set.add("����");
		set.add("����");
		System.out.println("��ӳɹ���?" + set.add("����"));//�ظ�Ԫ�ز������
		System.out.println(set); //[����, ����, ����]
	
	}

}
