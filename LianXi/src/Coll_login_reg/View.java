package Coll_login_reg;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	Scanner in = new Scanner(System.in);
	Server s = new Server();
	public void UI(){
		while(true){
			System.out.println("ѡ�����Ĳ���\t\t\t(A.��¼)\t\t(B.ע��)");
			String choose = in.next() ;
			if(choose.equalsIgnoreCase("A")){
				System.out.print("����id:");
				String id = in.next() ;
				System.out.print("��������:");
				String passkey = in.next() ;
				s.login(id , passkey);
			}else if(choose.equalsIgnoreCase("B")){
				System.out.print("����ע��id:");
				String id = in.next() ;
				System.out.print("����ע������:");
				String passkey = in.next() ;
				User u  = new User(id , passkey) ;
				
				s.reg(u);
				//System.out.println(c.list);
			}else{
				System.out.println("��ѡ��A��B");
			}
		}
	}
}
