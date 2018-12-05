package day03;

import java.util.Scanner;

public class ShiJinZhi {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		int T = in.nextInt();
		char[] ShiLiuJinZhi = {'a','b','c','d','e','f','g'};
		int sum = 0;
		int i = 0 ;
		if(T <= 16 && T >= 10){
			i = T - 10 ;
			System.out.print(ShiLiuJinZhi[i]);
		}else if(T>0 && T < 10){
			System.out.println(T);
		}else if( T > 16 ){
			while(T / 16 >= 0){
				sum = T % 16 ;
				if(sum >= 10){
					int x = sum - 10;
					System.out.print(ShiLiuJinZhi[x]);
				}else{
					System.out.print(sum);
				}
				
				if(T / 16 ==0){
					break;
				}
				T /= 16 ;
			}
		}
	}

}
