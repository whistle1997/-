import java.util.Scanner;

public class FamilyAccount {
	static int Start = 10000;
	public static void main(String[] args) {
		System.out.println("------------------------��ͥ��֧�������------------------------");
		
		Scanner in = new Scanner(System.in);
		String show = "������Ϣ";
		String show2 = "������Ϣ";
		int Ru;
		System.out.print("\n"+"\n");
		System.out.println("                         1����֧��ϸ");
		System.out.println("                         2���Ǽ�����");
		System.out.println("                         3���Ǽ�֧��");
		System.out.println("                         4���˳�");
		System.out.print("\n"+"\n");
		//System.out.print("                           ��ѡ��1-4��");
		while(true){
			/*System.out.print("\n"+"\n");
			System.out.println("                         1����֧��ϸ");
			System.out.println("                         2���Ǽ�����");
			System.out.println("                         3���Ǽ�֧��");
			System.out.println("                         4���˳�");
			System.out.print("\n"+"\n");*/
			System.out.print("                           ��ѡ��1-4��");
			
			Ru = in.nextInt();
			System.out.print("\n"+"\n");
			/*switch(Ru){
			case 2:
				System.out.print("�����������");
				int x = in.nextInt();
				System.out.println("������ϸ");
				String str = in.next();
				show = ShowPlus(x , str); ;
			case 3:
				System.out.print("�����������");
				int n = in.nextInt();
				System.out.println("������ϸ");
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
				System.out.print("�����������");
				int x = in.nextInt();
				System.out.print("������ϸ��");
				String str = in.next();
				show = ShowPlus(x , str);
				
			}
			if(Ru == 3){
				System.out.print("������֧����");
				int n = in.nextInt();
				System.out.print("������ϸ��");
				String str1 = in.next();
				show2 = ShowJian(n , str1);
			
			}
			
			if(Ru == 4){
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
	//����2���еĲ���
	public static String ShowPlus(int x , String str){
		Start = Start + x ;
		String show = "����"+"\t"+"�˻����:"+Start+"\t"+"������:"+x+"\t"+"��ϸ:"+str;
		//System.out.println("        "+show);
		return show;
	}
	public static String ShowJian(int x , String str){
		Start = Start - x ;
		String show = "֧��"+"\t"+"�˻����: "+Start+"\t"+"֧�����: "+x+"\t"+"��ϸ: "+str;
		//System.out.println("        "+show);
		return show;
	}

}
