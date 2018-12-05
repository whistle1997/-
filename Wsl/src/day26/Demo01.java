package day26;

import java.util.TreeSet;

@FunctionalInterface
interface MyInter{
	void show(String s) ;
}

@FunctionalInterface
interface MyInter2{
	int show(int i) ;
}

//Lambda���ʽ
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�޲Σ��޷���ֵ����������ʡ��
		Runnable run = () -> System.out.println("lambda���ʽ");
		new Thread(run).start();
		
		//���������������з���ֵ���������Ϳ�ʡ�ԣ�return��ʡ��
		TreeSet<String> ts = new TreeSet<>((s1 , s2) -> Integer.compare(s1.length(), s2.length()));
		ts.add("wdj");
		ts.add("wdjdbbwsl");
		System.out.println(ts);
		
		//��һ������ʱ���������ͼ�()��ʡ��
		
		String t = "dadadadadada" ;
		MyInter m = s -> System.out.println(s);
		//������Ҫ���÷���
		m.show(t);
		
		
		//lambda���ʽֻ�ܽ��з������壬ʹ�õľ�Ϊ�βΣ�����ֱ�Ӵ���ʵ�Σ�����ʵ����Ҫͨ��������ø÷�������ֵ���롣
		int i = 2 ;
		MyInter2 m2 = s -> s ;
		System.out.println(m2.show(i));
	}

}
