package LianXiZ19;
/*���һ����ϸ��Ϊ���Ρ������Ρ�Բ�κ���Բ�εġ�ͼ�Ρ��ࡣʹ�ü̳н���Щͼ�η��࣬
�ҳ�����Ϊ���ಿ�ֵĹ�ͬ����(��У׼��)�ͷ���(�续������ʼ��)����������Щͼ���Ƿ��ܽ�һ������Ϊ���ࡣ 
����ֻ����ʵ��˼�룬�����Ǿ���ʵ�ֵ�ϸ�ڣ�ʵ�ַ�ʽ�����ɷ��ӡ�*/

class Shape {
	int bian ;
	public Shape(int bian){
		this.bian = bian ;
	}
}
class JuXing extends Shape{
	int n ;
	public JuXing(int bian , int n){
		super(bian);
		System.out.println("������"+n+"���ߣ��߳�Ϊ"+bian);
	}
}
class SanJiao extends Shape{
	int n ;
	public SanJiao(int bian , int n){
		super(bian);
		System.out.println("��������"+n+"���ߣ��߳�Ϊ"+bian);
	}
}
class circle extends Shape{
	public static final double PI = 3.14 ;
	public circle(int bian){
		super(bian);
		System.out.println("Բ���а뾶����"+bian+"�����"+(PI*bian*bian));
	}
}
class Test{
	public static void main(String[] args) {
		JuXing j = new JuXing(23, 4);
		SanJiao s = new SanJiao(4, 3);
		circle c = new circle(5);
	}
}