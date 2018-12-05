package day21;

class ShouPiao implements Runnable{
	private int Piao = 100 ;
	private Object obj = new Object();
	public void run(){
		while(Piao > 0){
//			synchronized (obj) {
//			
//				System.out.println(Thread.currentThread().getName() + "剩余票数为:" + Piao);
//				Piao-- ;
//			}
			test();
		}
	}
	
	
	public synchronized void test(){
		synchronized (obj) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "剩余票数为:" + Piao);
			Piao-- ;
		}
	}
}

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShouPiao sp = new ShouPiao();
		Thread t = new Thread(sp);
		Thread t2 = new Thread(sp);
		t.start();
		t2.start();
	}

}
