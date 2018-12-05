package day22;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TodayReview {
	// 生产者消费者模型
	public static void main(String[] args) {
		// 生产者消费者模型是指两个线程同时操作一个共享对象，如不处理，线程运行会乱
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
	final Lock lock = new ReentrantLock();  //创建一个锁对象
	final Condition pro  = lock.newCondition();//条件接口，控制不同对象的阻塞释放  
	final Condition cons = lock.newCondition(); 
	// 将s和count设为共享数据
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
				System.out.println(Thread.currentThread().getName() +  s[0] + "为生产者" + count);
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
				System.out.println(Thread.currentThread().getName() + s[0] + "为消费者" + count);
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
		d.save("狗娃");
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
