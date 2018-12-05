package day17;

public class Test {
	public static void main(String[] args) {
		//Try t =Try.women;
		Try t = Try.man;
//		Try2 t2 =Try2.t ;
	}
}

enum Try{
	man(5),women(6) ;
	private Try(){
		System.out.println("======================");
	}
	private Try(int n){
		System.out.println(n);
	}
	public void show(){
		System.out.println(women);
	}
}

class Try2{
	public Try2(){
		System.out.println("=========================");
	}
	private static Try2 t = new Try2() ;
}