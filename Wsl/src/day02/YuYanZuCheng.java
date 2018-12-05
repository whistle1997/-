package day02;

public class YuYanZuCheng {

	public static void main(String[] args) {
		int x = 3567;
		int t = x / 1000;
		int h = x / 100 % 10 ; 
		int ten = x % 100  / 10;
		int ge = x % 10;
		int sum = t  + h + ten + ge ;
		System.out.println("各数位的和为："+sum);

	}

}
