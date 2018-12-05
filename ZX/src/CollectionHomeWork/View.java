package CollectionHomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	Scanner in = new Scanner(System.in);
	public void viewUI() throws InputMismatchException{
		
		while(true){
			System.out.println("\t\tA.登录                              B.注册");
			System.out.print("\t选择您要进行的操作:");
			
			
			String choose = in.next();
			if(choose.equalsIgnoreCase("A")){
				System.out.println("");
				//new login();
			}else if(choose.equalsIgnoreCase("B")){
				System.out.print("\t输入注册用户名:");
				String id = in.next();
				System.out.print("\t输入密码:");
				String passkey = in.next() ;
				
			}else
				throw new InputMismatchException();
		}
	}
}
