package JiHe;

import java.util.HashSet;

/*
HashSet :ʹ����hash��֧�֣���ȡ��
	hash�����һ����ͨ����ص㣺Ͱʽ�ṹ��һ��λ�ÿ��Դ洢���Ԫ��
	HashSet��ʵ��ԭ��
		���Ԫ���ǣ�hash���ȵ���Ԫ�ص�hashCode()�����õ�Ԫ�صĹ�ϣֵ��
		Ȼ��ͨ��Ԫ�صĹ�ϣֵ����λ�Ƶ����㣬�Ϳ��������Ԫ���ڹ�ϣ���е�
		�洢λ��
		
		��Ҫ��д�����hashCode����
		���һ��������Ԫ�ش洢��λ��Ŀǰû���κ�Ԫ�ش洢����ô��Ԫ�ؿ�ֱ��
		�洢����λ��
		
		���������������Ԫ�صĴ洢λ��Ŀǰ�Ѿ���������Ԫ�أ���ô������ø�Ԫ�ص�
		equals���������λ��Ԫ���ٱȽ�һ�Σ��������true����ô��Ԫ�����λ���ϵ�
		Ԫ����Ϊ�ظ�Ԫ�أ���������ӣ��������false����ô����ӡ�
*/

class Persons{
	int id ;
	String name ;
	public Persons(int id ,String name){
		this.id = id ;
		this.name = name ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{���:"+this.id + "����:" + this.name + "}" ;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//û���һ������͵���һ��hashCode����
		return this.id ; 
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Persons o = (Persons)obj ;
		return this.id == o.id;
	}
}

public class HashSetStudy {
	public static void main(String[] args) {
		/*HashSet set = new HashSet() ;
		set.add("����");
		set.add("��ʣ");
		set.add("����");
		System.out.println("���ϵ�Ԫ��:" + set);*/
		
		HashSet set = new HashSet();
		set.add(new Persons(110 , "����"));
		set.add(new Persons(120 , "��ʣ"));
		set.add(new Persons(130 , "����"));
		set.add(new Persons(110 , "����"));//Ҳ�����
		System.out.println(set);
	}
}
