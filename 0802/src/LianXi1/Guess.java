package LianXi1;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Word w = new Word();
		int m ;
		while(true){
			System.out.print("��������:");
			m = in.nextInt();
			if(m > w.getV())
				System.out.println("����");
			else if(m < w.getV())
				System.out.println("С��");
			else{
				System.out.println("�¶���");
				break;
			}
		}
	}

}
