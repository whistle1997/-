package day21;
//火车站售票，假设4个窗口，100张票，售票互不影响

class Ticket implements Runnable{
	private int ticket = 100 ;//初始票有100张
	private Object obj = new Object();
	public void run(){
		//ticket是共享资源，如果不加同步锁，则会出现重复获取的现象，出现问题
		while(true){
			synchronized (obj) {
				/*if(ticket > 0){
					System.out.println(Thread.currentThread().getName() + "剩余票数:" + ticket);
					ticket-- ;
					//还可通过synchronize修饰方法进行
				}*/
				use();
			}
			
		}
	}
	
	public synchronized void use(){
		if(ticket > 0){
			System.out.println(Thread.currentThread().getName() + "剩余票数:" + ticket);
			ticket-- ;
		}
	}
}

public class Demo06 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t = new Ticket() ;
		Thread t1 = new Thread(t); 
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
