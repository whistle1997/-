import java.util.Scanner;

public class SiJi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		while(true){
			System.out.println("ÇëÊäÈëÔÂ·Ý:");
			int m = in.nextInt();
			if(m>=1 && m <= 12 ){
				if(m>=3 && m <= 5){
					System.out.println("´º¼¾");
				}else if(m>=6 && m <= 8){
					System.out.println("ÏÄ¼¾");
				}else if(m>=9 && m <= 11){
					System.out.println("Çï¼¾");
				}else{
					System.out.println("¶¬¼¾");
				}
			}else{
				System.out.println("ÊäÈëÓÐÎó");
			}
		}
		}
		}


