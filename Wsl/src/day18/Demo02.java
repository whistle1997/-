package day18;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int JieCheng = 5 ;
			System.out.println(JieCheng(JieCheng));
		}
		
	public static int JieCheng(int JieCheng){
		int sum = 0 ;
		if(JieCheng > 1){
			return sum *JieCheng(JieCheng - 1);
		}
		return 1 ;
	}
}
