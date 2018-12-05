package day21;
 //Ä£ÄâÒ»¸öËÀËø

class Death1 implements Runnable{
	
	private Boolean flag ;
	public Death1(Boolean flag){
		this.flag = flag ;
	}
	public void run(){
		if(flag){
			synchronized (choose.o1) {
				System.out.println("£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡");
				synchronized (choose.o2) {
					System.out.println("+++++++++++++++++++++++++++++++++++++++++");
				}
			}
		}else{
			synchronized (choose.o2) {
				System.out.println("??????????????????????????????????");
				synchronized (choose.o1) {
					System.out.println("_______________________________________________________");
				}
			}
		}
	}
}

class choose{
	public static Object o1 = new Object();
	public static Object o2 = new Object();
}
public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Death1(true));
		Thread t2 = new Thread(new Death1(false));
		t1.start();
		t2.start();
		
	}

}
