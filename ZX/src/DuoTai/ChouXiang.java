package DuoTai;
/*
 * Ŀǰ���⣺
 * 	1��������run������������ȷ
 * 	2��û��ǿ��֪ͨ����һ��Ҫ��дrun����
 * 
 *   Ӧ�ó���������������һ�������ʱ�򣬷��ָ�������ȷʵ����ĳ����Ϊ����������
 * 			��ô���ǿ��Գ�ȡ������Ϊ������������ȥʵ�֣������������Ϊ��ʹ�ó�������
 * ������ô���ǿ��Ҫ������һ��Ҫʵ��ָ���ķ�����
 * 	
 * �������ϸ�ڣ�
 * 		1�����һ������û�з����壬��ô�ú�������ʹ��abstract���Σ��Ѹú������γɳ���ĺ���
 * 		2�����һ��������˳���ĺ���������Ҳ������abstact����			
 * 		3�����һ���ǳ�����̳��˳����࣬��ô����ѳ���������г��󷽷�ȫ��ʵ�֡�
 * 		4����������Դ��ڷǳ��󷽷���Ҳ���Դ��ڳ��󷽷�
 * 		5����������Բ����ڳ��󷽷�
 * 		6�������಻�ܴ�������
 * 			�ʣ�Ϊʲô���ܴ�������
 * 				��Ϊ�������Ǵ��ڳ��󷽷��ģ�������ó����ഴ������Ļ�
 * 				��ô����Ķ�����õĳ��󷽷���û���κ������
 * 		7���������Ǵ��ڹ��캯���ģ��乹�캯�����ṩ�����ഴ������ĳ�ʼ����������Ե�
 * */
abstract class Animal{
	String name ; 
	String color ;
	public Animal(String name , String color){
		this.name = name ;
		this.color = color ;
	}
	public abstract void run();
}

class Dog extends Animal{
	public Dog(String name , String color){
		super(name ,color);
	}
	public void run(){
		System.out.println(name+"����������");
	}
}
class Fish extends Animal{
	public Fish(String name , String color){
		super(name ,color);
	}
	public void run(){
		System.out.println(name+"��ˮ����");
	}
}
public class ChouXiang {
	public static void main(String[] args) {
		Dog d = new Dog("����Ȯ","��ɫ");
		d.run();
		Fish f = new Fish("����","���ɫ");
		f.run();
	}
}
