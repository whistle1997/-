package Day09;

import java.util.Scanner;

public class PeoplePai {
//	int[] b = new int[5];
	People[] per = new People[2];
	Scanner in = new Scanner(System.in);
	public void AgePai(){
		for(int i = 0 ; i < per.length ; i++){
			/*People peo = new People();
			System.out.print("��������:");
			int age = in.nextInt() ;
			peo.setAge(age);
			System.out.print("��������:");
			String name = in.next() ;
			peo.setName(name);
			per[i] = peo ;*/
			System.out.println("������ݣ�PΪ�ˣ�SΪѧ����TΪ��ʦ");
			String str = in.next();
			if(str.equals("P")){
				System.out.print("����������");
				String name = in.next() ;
				System.out.print("�������䣺");
				int age = in.nextInt();
				per[i] = new People(age , name);
			}else if(str.equals("S")){
				System.out.print("����������");
				String name = in.next() ;
				System.out.print("�������䣺");
				int age = in.nextInt();
				System.out.println("����ѧ�ţ�");
				int id = in.nextInt();
				per[i] = new Student(name ,age , id);
			}else if(str.equals("T")){
				System.out.print("����������");
				String name = in.next() ;
				System.out.print("�������䣺");
				int age = in.nextInt();
				System.out.println("���빤�ţ�");
				int id = in.nextInt();
				per[i] = new Teacher(name ,age , id);
			}
		}
		for(int i = 0 ; i < per.length - 1   ; i++){
			for(int j = 0 ; j < per.length - 1 -i; j++){
				if(per[j].getAge() > per[j+1].getAge()){
					People temp = per[j];
					per[j] = per[j+1];
					per[j+1] = temp ;
				}
			}
		}
		for(int i = 0 ; i < per.length ; i++){
			System.out.println(per[i].getInfo());
		}
	}
}
