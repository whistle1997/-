import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	Scanner in = new Scanner(System.in);
	public void UI(){
		System.out.println("**************************************************************************");
		System.out.println("\n\n\n\n");
		System.out.println("\t\t\t\t欢迎使用图书管理系统");
		System.out.println("\n\n\n\n");
		System.out.println("**************************************************************************");
		while(true){
			System.out.print("请选择输入："+ "\t(A)用户登录" + "\t(B)用户注册" + "\t(Q)退出系统");
			String choose = in.next();
			if(choose.equalsIgnoreCase("A")){
				 
			}else if(choose.equalsIgnoreCase("B")){
				inner:while(true){
					System.out.println("注册新用户");
					System.out.print("\t输入用户名：");
					String id = in.next() ;
					String passkey ;
					if(id != null){
						System.out.print("\t输入密码：");
						passkey = in.next();
						break inner;
					}else{
						throw new InputMismatchException("请规范输入");
					}
					
				}
			}
		}
	}
}
