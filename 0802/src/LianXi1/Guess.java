package LianXi1;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Word w = new Word();
		int m ;
		while(true){
			System.out.print("输入数字:");
			m = in.nextInt();
			if(m > w.getV())
				System.out.println("大了");
			else if(m < w.getV())
				System.out.println("小了");
			else{
				System.out.println("猜对了");
				break;
			}
		}
	}

}
