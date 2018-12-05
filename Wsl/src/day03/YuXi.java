package day03;

import java.util.Scanner;

//根据数字给出相应季节
public class YuXi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x == 3 || x == 4 || x ==5){
			System.out.println("春");
		}
		else if(x == 6 || x == 7 || x ==8){
			System.out.println("夏");
		}
		else if(x == 9 || x == 10 || x ==11){
			System.out.println("秋");
		}
		else if(x == 12 || x == 1 || x ==2){
			System.out.println("冬");
		}
		else{
			System.out.println("输错了您!");
		}
	}

}
