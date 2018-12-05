import java.util.Scanner;

public class FamilyAccount {
	static int Start = 10000;
	public static void main(String[] args) {
		System.out.println("------------------------家庭收支记账软件------------------------");
		
		Scanner in = new Scanner(System.in);
		String show = "暂无信息";
		String show2 = "暂无信息";
		int Ru;
		System.out.print("\n"+"\n");
		System.out.println("                         1、收支明细");
		System.out.println("                         2、登记收入");
		System.out.println("                         3、登记支出");
		System.out.println("                         4、退出");
		System.out.print("\n"+"\n");
		//System.out.print("                           请选择1-4：");
		while(true){
			/*System.out.print("\n"+"\n");
			System.out.println("                         1、收支明细");
			System.out.println("                         2、登记收入");
			System.out.println("                         3、登记支出");
			System.out.println("                         4、退出");
			System.out.print("\n"+"\n");*/
			System.out.print("                           请选择1-4：");
			
			Ru = in.nextInt();
			System.out.print("\n"+"\n");
			/*switch(Ru){
			case 2:
				System.out.print("请输入收入金额：");
				int x = in.nextInt();
				System.out.println("输入明细");
				String str = in.next();
				show = ShowPlus(x , str); ;
			case 3:
				System.out.print("请输入收入金额：");
				int n = in.nextInt();
				System.out.println("输入明细");
				String str1 = in.next();
				show2 = ShowJian(n , str1);break;
			case 1:
				System.out.println(show);
				System.out.println(show2);
			}*/
			if(Ru == 1){
				System.out.println(show);
				System.out.println(show2);
				
			}
			if(Ru == 2){
				System.out.print("请输入收入金额：");
				int x = in.nextInt();
				System.out.print("输入明细：");
				String str = in.next();
				show = ShowPlus(x , str);
				
			}
			if(Ru == 3){
				System.out.print("请输入支出金额：");
				int n = in.nextInt();
				System.out.print("输入明细：");
				String str1 = in.next();
				show2 = ShowJian(n , str1);
			
			}
			
			if(Ru == 4){
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
	//输入2进行的操作
	public static String ShowPlus(int x , String str){
		Start = Start + x ;
		String show = "收入"+"\t"+"账户余额:"+Start+"\t"+"收入金额:"+x+"\t"+"明细:"+str;
		//System.out.println("        "+show);
		return show;
	}
	public static String ShowJian(int x , String str){
		Start = Start - x ;
		String show = "支出"+"\t"+"账户余额: "+Start+"\t"+"支出金额: "+x+"\t"+"明细: "+str;
		//System.out.println("        "+show);
		return show;
	}

}
