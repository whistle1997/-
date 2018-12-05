package Day09;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
		
		int[] arr = new int[5];
		PaiXu p = new PaiXu();
		int[] arr1 = p.MaoPao(arr);
		for(int num : arr1)
			System.out.print(num+" ");
		System.out.println();
		System.out.println("===========================================");*/
		
		PeoplePai n = new PeoplePai();
		n.AgePai();
		//PaiXu p = new PaiXu();
		/*int[] b = new int[5];
		People[] per = new People[5];
		for(int i = 0 ; i < per.length ; i++){
			People peo = new People();
			System.out.print("输入年龄:");
			int age = in.nextInt() ;
			peo.setAge(age);
			System.out.print("输入姓名:");
			String name = in.next() ;
			peo.setName(name);
			per[i] = peo ;
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
		}*/
		/*for(int i = 0 ; i < b.length ; i++){
			System.out.print("输入年龄:");
			int age = in.nextInt() ;
			People per = new People();
			per.setAge(age);
			b[i] = per.getAge();
		}
		int[] arr2 = p.Age(b);
		for(int num : arr2)
			System.out.print(num+" ");*/
	}
	
	

}
