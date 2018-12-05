package day22;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TodayReview {
	// ������������ģ��
	public static void main(String[] args) {
		// ������������ģ����ָ�����߳�ͬʱ����һ����������粻�����߳����л���
		Data d = new Data();
		Pro p = new Pro(d);
		Cons c = new Cons(d);
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

class Data {
	private int count = 1;
	private String[] s = new String[1];
	//private Object lock = new Object();
	final Lock lock = new ReentrantLock();  //����һ��������
	final Condition pro  = lock.newCondition();//�����ӿڣ����Ʋ�ͬ����������ͷ�  
	final Condition cons = lock.newCondition(); 
	// ��s��count��Ϊ��������
	public void save(String name) {

		lock.lock();
		try{
			while (true) {
				while (s[0] != null) {
					try {
						pro.await();
					} catch (InterruptedException e) {

					}
				}
				s[0] = name;
				System.out.println(Thread.currentThread().getName() +  s[0] + "Ϊ������" + count);
				count++;
				cons.signalAll();
		}
		}finally{
			lock.unlock();
		}
	}


	public void get() {

		lock.lock();
		try{
			while (true) {
				while(s[0] == null) {
					try {
						cons.await();
					} catch (InterruptedException e) {

					}
				}
				System.out.println(Thread.currentThread().getName() + s[0] + "Ϊ������" + count);
				s[0] = null;
				pro.signalAll();
			}
		}finally{
			lock.unlock();
		}
		
	}
}

class Pro implements Runnable {
	private Data d;

	public Pro(Data d) {
		this.d = d;
	}

	public void run() {
		d.save("����");
	}
}

class Cons implements Runnable {
	private Data d;

	public Cons(Data d) {
		this.d = d;
	}

	public void run() {
		d.get();
	}
}
