package day03;

import java.util.Scanner;

public class WanNianLi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		int year = in.nextInt();
		int month = in.nextInt();
		int day = 0 ;
		int monthday = 0 ;
		for(int i = 1900 ; i < year ; i++){
			if((i% 4 == 0 && i %100 != 0)|| i % 400 == 0){
				day += 366 ;
			}else{
				day += 365 ;
			}
		}
		for(int j = 1 ; j <= month ; j++){
			if(j <=7 && j != 2){
				if(j % 2 != 0){
					monthday = 31 ;
				}else{
					monthday = 30 ;
				}
			}else if(j >= 8){
				if(j % 2 == 0){
					monthday = 31 ;
				}else{
					monthday = 30 ;
				}
			}
			if(j == 2){
				if((year % 4 == 0 &&year % 100 !=0 )||( year % 400 == 0)){
					monthday = 29;
				}else{
					monthday = 28;
				}
			}
			if(j < month){
				day += monthday ;
			}
		}
		int week = (day+1) % 7 ;
		System.out .println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六");
		for(int k = 0 ; k < week ; k++){
			System.out.print("\t");
		}
		for(int a = 1 ; a <= monthday ; a++){
			System.out.print(a+"\t");
			if((day+a)%7 == 6){
				System.out.println();
			}
		}
	}

}
