package com.offcn.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

//���û���������
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
				System.out.print("�����������������룺");
			}
			
		}
		return c ;	
	}
	
	public void displayItem(int no){
		try{
			System.out.println(is.getItem(no));
			if(answer[no] == 'A' || answer[no] =='B'|| answer[no] == 'C' || answer[no] == 'D'){
				System.out.println("���ϴε�ѡ��Ϊ��" + answer[no]);
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("�����ѽ���");
			for(int j = 0 ; j < answer.length ; j++){
				if(is.getItem(j).getAnswer().equals(String.valueOf(answer[j]))){
					score += 10 ;
				}
			}
			System.out.println("���ο��Խ���,�ܷ�:" + score);
			is.saveAnswer(answer);
			show();
		}
	}

	public void testExam(){
		int i = 0 ;
		
		System.out.println(is.showMassage());
		System.out.print("\r\n\t��N���뿼�ԣ���P��ҳ:");
		char en = getUserAction();
		if(en == 'N'){
			
			while(true){
				displayItem(i);
				System.out.print("��������ѡ��(N��һ��/P��һ��):");
				
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
					System.out.print("ȷ���˳�����?(Y/N)");
					String exit  = in.nextLine();
					if(exit.equalsIgnoreCase("Y")){
						for(int j = 0 ; j < answer.length ; j++){
							//System.out.println(is.getItem(j).getAnswer());
							if(is.getItem(j).getAnswer().equals(String.valueOf(answer[j]))){
								score += 10 ;
							}
						}
						System.out.println("���ο��Խ���,�ܷ�:" + score);
						
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
		
		System.out.print("��N������ҳ:");
		if(in.nextLine().equalsIgnoreCase("N"))
			show();
		//System.out.println("�������");
	}
	
	public void show(){
		System.out.println("\t\t1�����뿼��");
		System.out.println("\t\t2����ʾ�ϴο��Լ�¼");
		System.out.print("ѡ�����:");
		String choose ;
		while(true){
			try {
				choose = in.nextLine();			
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.print("������ȷѡ��:");
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
					System.out.println("������󣬷�����ҳ");
					show();
			}
		}
	}
}
