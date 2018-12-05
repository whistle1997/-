package day22;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resouce1 {
	private String[] str = new String[1] ;
	private int count = 1 ;
	final Lock lock = new ReentrantLock();  //创建一个锁对象
	final Condition pro  = lock.newCondition();//条件接口，控制不同对象的阻塞释放  
	final Condition con = lock.newCondition(); 

	public void save(String name){
			lock.lock();
			try{
				
					while(str[0] != null){
						try {
							pro.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						str[0] = name + count ;
						System.out.println(Thread.currentThread().getName()+"当前生产的是" + str[0]  );
						count++ ;
						con.signalAll();
					
					
					
				
			}finally{
				lock.unlock();
			}
			
			
	}
	public void get(){
	
				while(str[0] == null){
					try {
						con.await();
					} catch (InterruptedException e) {
						
					}
				}
				System.out.println(Thread.currentThread().getName()+"当前正在消费"+ str[0]  );
				str[0] = null ;
				pro.signalAll();
			}
	
}


class Product1 implements Runnable{
	private Resouce1 r ;
	public Product1(Resouce1 r){
		this.r = r ;
	}
	public void run(){
		while(true)
			r.save("巧克力");
	}
}

class Coustemer1 implements Runnable{
	private Resouce1 r ;
	public Coustemer1(Resouce1 r){
		this.r = r ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			r.get();
	}
}

public class Demo02 {

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
