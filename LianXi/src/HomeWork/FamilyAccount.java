package HomeWork;

import java.util.Scanner;

public class FamilyAccount {
	static int Money = 10000;
	
	public static void main(String[] args) {
		System.out.print("\n"+"\n");
		System.out.println("                         1����֧��ϸ");
		System.out.println("                         2���Ǽ�����");
		System.out.println("                         3���Ǽ�֧��");
		System.out.println("                         4���˳�");
		Scanner in = new Scanner(System.in);
		
		int m = 0;
		String show1 = "����\t"+Money+"\t";
		String show2 = "֧��\t"+Money+"\t";
		while(true){
			System.out.print("                         ��ѡ��(1-4)��");
			m = in.nextInt();
//			case 2 :
			if(m == 2){
				System.out.print("       ����������:");
				int x = in.nextInt();
				System.out.print("       ��������˵��:");
				String str = in.next();
				show1 = pressTwo(x , str);
			}
			//case 3 :
			if(m == 3){	
			System.out.print("       ����֧�����:");
				int n = in.nextInt();
				System.out.print("       ����֧��˵��:");
				String str1 = in.next();
				show2 = pressThree(n , str1);
			}
			if(m == 1 ){
				Print();
				System.out.println(show1);
				System.out.println(show2);
			}
			if(m == 4){
				System.out.print("ȷ��Ҫ�˳���Y/N:");
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
		String show = "����\t"+Money+"\t"+x+"\t"+str;
		return show;
	}
	public static String pressThree(int x , String str){
		Money -= x;
		String show = "֧��\t"+Money+"\t"+x+"\t"+str;
		return show;
	}
	public static void Print(){
		System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
		System.out.println("��֧\t�˻����\t��֧���\t˵ ��");
		
		
	}
	/*public static void printTwo(int x , String str){
		System.out.println("����\t"+Money+"\t"+x+"\t˵��"+str);
	}
	public static void printThree(int x , String str){
		System.out.println("֧��\t"+Money+"\t"+x+"\t˵��"+str);
	}*/
}
