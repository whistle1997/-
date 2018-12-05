package day21;


class Time extends Thread{
	public void run(){
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(System.currentTimeMillis());
			//System.out.println(i + "++++++++++++++++");
		}
	}
}


public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		t.start();
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(i + "=====");
		}
	}

}
