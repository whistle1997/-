package day22;
//生产者消费者
/*
 * 单生产者单消费者
 * 	在共享类中添加方法，访问同一数据进行操作，然后分别在run方法中调用，为了保证操作的是同一对象，通过线程类的构造方法传入共享类对象，获取同一对象
 * 	通过if判断，确定当前哪个线程应该执行，如果不该执行的线程获取了资源，则通过Object类下的wait方法阻塞这个线程，另一线程获取到资源执行，完毕后
 * 通过notify方法唤醒等待中的线程，两线程交替执行，不相互干扰。
 * 
 * 
 * 多生产者多消费者
 * 	如果在单消费者生产者基础上直接添加线程运行，会出现重复现象，因为当线程运行后唤醒的线程不一定为与之相对应的线程，可能是和该线程相同的线程，重新出现
 * 重复操作现象，为了解决这个问题，我们需要对上述的if判断进行重复操作，及将判断改为while循环。更改之后可能出现死锁现象，因为线程在唤醒阻塞过程中会出现
 * 同时阻塞的现象，造成死锁，因此，将notify方法更改为notifyAll 方法，线程执行结束后唤醒所有线程，就不会产生死锁，但因为唤醒了不必要的线程，所以效率降低。
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
				System.out.println(Thread.currentThread().getName()+"当前生产的是" + str[0]  );
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
				System.out.println(Thread.currentThread().getName()+"当前正在消费"+ str[0]  );
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
			r.save("巧克力");
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
