package com.offcn.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

//与用户交互的类
public class ExamView {
	Scanner in = new Scanner(System.in);
	ItemService is = new ItemService("E:/Exam/Items.txt");
	char[] answer = new char[10];
	static int  score = 0 ;
	public char getUserAction(){
		char c ;
		while(true){
			String s ;
			try {
				s = in.nextLine().toUpperCase();
			} catch (Exception e) {
				// TODO: handle exception
				s = in.next() ;
			}
			
			c = s.charAt(0);
			if(c == 'A' || c == 'B' || c == 'C' || c == 'D'  || c == 'N'  || c == 'P' || c =='F')
				break;
			else{
				System.out.print("输入有误，请重新输入：");
			}
			
		}
		return c ;	
	}
	
	public void displayItem(int no){
		try{
			System.out.println(is.getItem(no));
			if(answer[no] == 'A' || answer[no] =='B'|| answer[no] == 'C' || answer[no] == 'D'){
				System.out.println("您上次的选择为：" + answer[no]);
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("答题已结束");
			for(int j = 0 ; j < answer.length ; j++){
				if(is.getItem(j).getAnswer().equals(String.valueOf(answer[j]))){
					score += 10 ;
				}
			}
			System.out.println("本次考试结束,总分:" + score);
			is.saveAnswer(answer);
			show();
		}
	}

	public void testExam(){
		int i = 0 ;
		
		System.out.println(is.showMassage());
		System.out.print("\r\n\t按N进入考试，按P首页:");
		char en = getUserAction();
		if(en == 'N'){
			
			while(true){
				displayItem(i);
				System.out.print("输入您的选择(N下一题/P上一题):");
				
				char c = getUserAction();
				System.out.println();
				if(c == 'N'){
					i++;
					continue;
				}else if(c == 'P'){
					if(i != 0){
						i-- ;
						continue ;
					}
					
					else
						continue ;
				}
				if(c == 'A' || c == 'B'  || c == 'C' || c == 'D'){
					answer[i] = c ;
					i++;
					continue ;
				}
				if(i == 10){
					
					break;
					
				}
				if(c == 'F'){
					System.out.print("确定退出答题?(Y/N)");
					String exit  = in.nextLine();
					if(exit.equalsIgnoreCase("Y")){
						for(int j = 0 ; j < answer.length ; j++){
							//System.out.println(is.getItem(j).getAnswer());
							if(is.getItem(j).getAnswer().equals(String.valueOf(answer[j]))){
								score += 10 ;
							}
						}
						System.out.println("本次考试结束,总分:" + score);
						
						break ;
					}else{
						continue;
					}
				}
				
			}
			
		}else{
			show();
		}
		System.out.println("===============");
		is.saveAnswer(answer);
		
		System.out.print("按N返回首页:");
		if(in.nextLine().equalsIgnoreCase("N"))
			show();
		//System.out.println("答题结束");
	}
	
	public void show(){
		System.out.println("\t\t1、进入考试");
		System.out.println("\t\t2、显示上次考试记录");
		System.out.print("选择操作:");
		String choose ;
		while(true){
			try {
				choose = in.nextLine();			
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.print("输入正确选项:");
				choose = in.nextLine();
				continue ;
			}
			
			switch(choose){
			case "1" :
				for(int i = 0 ; i < answer.length ; i++)
					answer[i] = ' ';
				testExam();
				break ;
			case "2" :
				is.getAnswer();
				show();
				break ;
				default:
					System.out.println("输入错误，返回首页");
					show();
			}
		}
	}
}
