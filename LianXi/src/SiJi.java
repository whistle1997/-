import java.util.Scanner;

public class SiJi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		while(true){
			System.out.println("�������·�:");
			int m = in.nextInt();
			if(m>=1 && m <= 12 ){
				if(m>=3 && m <= 5){
					System.out.println("����");
				}else if(m>=6 && m <= 8){
					System.out.println("�ļ�");
				}else if(m>=9 && m <= 11){
					System.out.println("�＾");
				}else{
					System.out.println("����");
				}
			}else{
				System.out.println("��������");
			}
		}
		}
		}


