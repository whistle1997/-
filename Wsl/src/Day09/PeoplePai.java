package Day09;

import java.util.Scanner;

public class PeoplePai {
//	int[] b = new int[5];
	People[] per = new People[2];
	Scanner in = new Scanner(System.in);
	public void AgePai(){
		for(int i = 0 ; i < per.length ; i++){
			/*People peo = new People();
			System.out.print("输入年龄:");
			int age = in.nextInt() ;
			peo.setAge(age);
			System.out.print("输入姓名:");
			String name = in.next() ;
			peo.setName(name);
			per[i] = peo ;*/
			System.out.println("输入身份：P为人，S为学生，T为老师");
			String str = in.next();
			if(str.equals("P")){
				System.out.print("输入姓名：");
				String name = in.next() ;
				System.out.print("输入年龄：");
				int age = in.nextInt();
				per[i] = new People(age , name);
			}else if(str.equals("S")){
				System.out.print("输入姓名：");
				String name = in.next() ;
				System.out.print("输入年龄：");
				int age = in.nextInt();
				System.out.println("输入学号：");
				int id = in.nextInt();
				per[i] = new Student(name ,age , id);
			}else if(str.equals("T")){
				System.out.print("输入姓名：");
				String name = in.next() ;
				System.out.print("输入年龄：");
				int age = in.nextInt();
				System.out.println("输入工号：");
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
