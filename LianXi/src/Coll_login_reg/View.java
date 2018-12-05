package Coll_login_reg;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	Scanner in = new Scanner(System.in);
	Server s = new Server();
	public void UI(){
		while(true){
			System.out.println("Ñ¡ÔñÄúµÄ²Ù×÷\t\t\t(A.µÇÂ¼)\t\t(B.×¢²á)");
			String choose = in.next() ;
			if(choose.equalsIgnoreCase("A")){
				System.out.print("ÊäÈëid:");
				String id = in.next() ;
				System.out.print("ÊäÈëÃÜÂë:");
				String passkey = in.next() ;
				s.login(id , passkey);
			}else if(choose.equalsIgnoreCase("B")){
				System.out.print("ÊäÈë×¢²áid:");
				String id = in.next() ;
				System.out.print("ÊäÈë×¢²áÃÜÂë:");
				String passkey = in.next() ;
				User u  = new User(id , passkey) ;
				
				s.reg(u);
				//System.out.println(c.list);
			}else{
				System.out.println("ÇëÑ¡ÔñA»òB");
			}
		}
	}
}
