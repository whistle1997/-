package CollectionHomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	Scanner in = new Scanner(System.in);
	public void viewUI() throws InputMismatchException{
		
		while(true){
			System.out.println("\t\tA.��¼                              B.ע��");
			System.out.print("\tѡ����Ҫ���еĲ���:");
			
			
			String choose = in.next();
			if(choose.equalsIgnoreCase("A")){
				System.out.println("");
				//new login();
			}else if(choose.equalsIgnoreCase("B")){
				System.out.print("\t����ע���û���:");
				String id = in.next();
				System.out.print("\t��������:");
				String passkey = in.next() ;
				
			}else
				throw new InputMismatchException();
		}
	}
}
