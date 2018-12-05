package day03;

import java.util.Scanner;

public class WanNianLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入年份:");
		int year = in.nextInt();
		System.out.println("请输入月份:");
		int month = in.nextInt();
		System.out .println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六");
		int day = 0 ;
		int monthday = 0 ;
		for(int i = 1900 ; i < year ; i++){
			if(i % 4 == 0 && i % 100 !=0 || i % 400 == 0){
				day += 366;
			}else{
				day += 365;
			}
		}
		for(int j = 1 ; j < month  ; j++){
			if(j == 1 || j == 3 || j ==5 || j ==7 || j ==8 || j ==10 || j ==12){
				day += 31;
			}else if(j == 2 && (year % 4 == 0 &&year % 100 !=0 )||( year % 400 == 0)){
				day += 29;
			}else if(j == 2){
				day += 28;
			}else{
				day += 30;
			}
		}
	//System.out.println(day);
		
			switch(month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					monthday = 31;break;
				case 2:
					if((year % 4 == 0 &&year % 100 !=0 )||( year % 400 == 0)){
						monthday = 29;
					}else{
						monthday = 28;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					monthday = 30 ;
			}
			int week = day % 7 + 1;
			int firstday = 0 ;
			//for(int x =0 ; x < 7 ; x++){
				if(week == 7){
					firstday = 0 ;
				}else{
					firstday = week ;
				}
				for(int k = 0; k <firstday ; k++){
					System.out.print ("\t");
				}
				for(int f = 1 ; f <= monthday ; f++){
					System.out.print(f+"\t");
					if((day+f)%7 == 6){
						System.out.print("\n");
					}
				}
			//}
			System.out.println(monthday);
		}
	}


