package Coll;

import java.util.HashSet;
import java.util.Set;

public class SetColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add(new Person("����", 18));
		set.add(new Person("����", 18));
		set.add(new Person("����", 18));
		set.add(new Person("���", 18));
		//[���������� ���䣺18, ���������� ���䣺18, ���������� ���䣺18, ��������� ���䣺18]
		//ȫ���������ΪPersonû����дHashCode������euqals���������ʱ�ȱȽ�hashCode�������ͬ�����equals
		System.out.println(set); //[���������� ���䣺18, ���������� ���䣺18, ��������� ���䣺18]
	}

}
