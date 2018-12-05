package HomeWork;

import java.util.Scanner;

public class FamilyAccount {
	static int Money = 10000;
	
	public static void main(String[] args) {
		System.out.print("\n"+"\n");
		System.out.println("                         1、收支明细");
		System.out.println("                         2、登记收入");
		System.out.println("                         3、登记支出");
		System.out.println("                         4、退出");
		Scanner in = new Scanner(System.in);
		
		int m = 0;
		String show1 = "收入\t"+Money+"\t";
		String show2 = "支出\t"+Money+"\t";
		while(true){
			System.out.print("                         请选择(1-4)：");
			m = in.nextInt();
//			case 2 :
			if(m == 2){
				System.out.print("       本次收入金额:");
				int x = in.nextInt();
				System.out.print("       本次收入说明:");
				String str = in.next();
				show1 = pressTwo(x , str);
			}
			//case 3 :
			if(m == 3){	
			System.out.print("       本次支出金额:");
				int n = in.nextInt();
				System.out.print("       本次支出说明:");
				String str1 = in.next();
				show2 = pressThree(n , str1);
			}
			if(m == 1 ){
				Print();
				System.out.println(show1);
				System.out.println(show2);
			}
			if(m == 4){
				System.out.print("确定要退出吗？Y/N:");
				String s = in.next();
				if(s.equals("Y")){
					break;
				}else{
					continue;
				}
			}
		}
	}

	public static String pressTwo(int x , String str){
		Money += x ;
		String show = "收入\t"+Money+"\t"+x+"\t"+str;
		return show;
	}
	public static String pressThree(int x , String str){
		Money -= x;
		String show = "支出\t"+Money+"\t"+x+"\t"+str;
		return show;
	}
	public static void Print(){
		System.out.println("-----------------当前收支明细记录-----------------");
		System.out.println("收支\t账户金额\t收支金额\t说 明");
		
		
	}
	/*public static void printTwo(int x , String str){
		System.out.println("收入\t"+Money+"\t"+x+"\t说明"+str);
	}
	public static void printThree(int x , String str){
		System.out.println("支出\t"+Money+"\t"+x+"\t说明"+str);
	}*/
}
