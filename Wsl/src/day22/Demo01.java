package day22;
//������������
/*
 * �������ߵ�������
 * 	�ڹ���������ӷ���������ͬһ���ݽ��в�����Ȼ��ֱ���run�����е��ã�Ϊ�˱�֤��������ͬһ����ͨ���߳���Ĺ��췽�����빲������󣬻�ȡͬһ����
 * 	ͨ��if�жϣ�ȷ����ǰ�ĸ��߳�Ӧ��ִ�У��������ִ�е��̻߳�ȡ����Դ����ͨ��Object���µ�wait������������̣߳���һ�̻߳�ȡ����Դִ�У���Ϻ�
 * ͨ��notify�������ѵȴ��е��̣߳����߳̽���ִ�У����໥���š�
 * 
 * 
 * �������߶�������
 * 	����ڵ������������߻�����ֱ������߳����У�������ظ�������Ϊ���߳����к��ѵ��̲߳�һ��Ϊ��֮���Ӧ���̣߳������Ǻ͸��߳���ͬ���̣߳����³���
 * �ظ���������Ϊ�˽��������⣬������Ҫ��������if�жϽ����ظ������������жϸ�Ϊwhileѭ��������֮����ܳ�������������Ϊ�߳��ڻ������������л����
 * ͬʱ���������������������ˣ���notify��������ΪnotifyAll �������߳�ִ�н������������̣߳��Ͳ����������������Ϊ�����˲���Ҫ���̣߳�����Ч�ʽ��͡�
 * 
 */
class Resouce {
	private String[] str = new String[1] ;
	private int count = 1 ;
	private Object lock = new Object();
	public void save(String name){
			synchronized (lock) {
				while(str[0] != null){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						
					}
				}
				str[0] = name + count ;
				System.out.println(Thread.currentThread().getName()+"��ǰ��������" + str[0]  );
				count++ ;
				lock.notifyAll();
			}
	}
	public void get(){
			synchronized (lock) {
				while(str[0] == null){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						
					}
				}
				System.out.println(Thread.currentThread().getName()+"��ǰ��������"+ str[0]  );
				str[0] = null ;
				lock.notifyAll();
			}
	}
}


class Product implements Runnable{
	private Resouce r ;
	public Product(Resouce r){
		this.r = r ;
	}
	public void run(){
		while(true)
			r.save("�ɿ���");
	}
}

class Coustemer implements Runnable{
	private Resouce r ;
	public Coustemer(Resouce r){
		this.r = r ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			r.get();
	}
}

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resouce r = new Resouce() ;
		Product p = new Product(r);
		Coustemer c = new Coustemer(r);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(p);
		Thread t4 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
