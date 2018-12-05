package day21;
//单例的线程安全

class SingleTest implements Runnable {
	private static SingleTest s = null ;
	private SingleTest(){};
	private static Object obj = new Object();
	public static SingleTest getSingle(){
		if(s == null){
			synchronized (obj) {
				if(s == null){
					s = new SingleTest();
				}
			}
		}
		return s ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getSingle());
	}
}

public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTest s = SingleTest.getSingle() ;
		Thread t1 = new Thread(s) ;
		Thread t2 = new Thread(s);
		t1.start();
		t2.start();
		
	}

}
