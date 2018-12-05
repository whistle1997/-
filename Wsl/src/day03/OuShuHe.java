package day03;

public class OuShuHe {

	public static void main(String[] args) {
		//for—≠ª∑
		for(int i = 100 ; i < 600 ; i++){
			int a = i / 100 ;
			int b = i /10 %10;
			int c = i % 10 ;
			if(i == a*a*a + b*b*b + c*c*c){
				System.out.println(i);
			}
		}
		System.out.println();
		//while
		int i = 100 ;
		while(i < 600){
			int a = i / 100 ;
			int b = i /10 %10;
			int c = i % 10 ;
			if(i == a*a*a + b*b*b + c*c*c){
				System.out.println(i);
			}
			i++;
		}
		System.out.println();
		//do  while 
		int k =100 ;
		do{
			int a = k / 100 ;
			int b = k /10 %10;
			int c = k % 10 ;
			if(k == a*a*a + b*b*b + c*c*c){
				System.out.println(k);
			}
			k++;
		}while(k < 600);
	
	}
}


