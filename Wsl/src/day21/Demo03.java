package day21;
//单例的线程安全

class Single{
	private static Object o = new Object();
	private Single(){}
	
	private static Single s = null ;
	public static Single getSingle(){
		if(s == null){
			synchronized (o) {
				if(s == null)
					s = new Single();
			}
		}
		return s ;
	}
}

class Test implements Runnable{
	public void run(){
		System.out.println(Single.getSingle());
	}
}

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		Thread  t1 = new Thread(test);
		Thread  t2 = new Thread(test);
		t1.start();
		t2.start();
	}

}
