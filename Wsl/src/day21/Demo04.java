package day21;

//À¿À¯
class Death implements Runnable{
	private Boolean flag ;
	public Death(Boolean flag){
		this.flag = flag ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag){
			synchronized (GetClass.o1) {
				System.out.println("!!!!!!!!!!!!!!!!");
				synchronized (GetClass.o2) {
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				}
			}
		}else{
			synchronized (GetClass.o2) {
				System.out.println("????????????????????");
				synchronized (GetClass.o1) {
					System.out.println("?????????????????");
				}
			}
		}
	}
	
}

class GetClass{
	static Object o1 = new Object();
	static Object o2 = new Object();
}
public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Death(true));
		Thread t2 = new Thread(new Death(false));
		t1.start();
		t2.start();
	}

}
