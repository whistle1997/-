package day04;

public class ZhiJiaoSanJiaoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <= 9 ; i++){
			for(int j = 1 ; j <= i ; j++){
				int sum = j * i ;
				System.out.print(j+"*"+i+"="+ sum + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		for(int i = 9 ; i >=1 ; i--){
			for(int j = 1 ; j <= i ; j++){
				int sum = i * j ;
				System.out.print(i+"*"+j+"="+ sum + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		for(int i = 1 ; i <= 9 ; i++){
			for(int k = i ; k < 9 ; k++){
				System.out.print("\t");
			}
			for(int j = 1 ; j <= i ; j++){
				int sum = j * i ;
				System.out.print(j+"*"+i+"="+ sum + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		for(int i = 9 ; i >=1 ; i--){
			for(int k = 1 ; k <= 9 - i ;k++){
				System.out.print("\t");
			}
			for(int j = 1 ; j <= i ; j++){
				int sum = i * j ;
				System.out.print(i+"*"+j+"="+ sum + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		for(int i = 1 ;i <= 9 ; i++){
			for(int k = 1 ; k <= 9 - i ; k++){
				System.out.print("\t");
			}
			for(int j = 1 ; j <= i ; j++){
				int sum = j * i ;
				System.out.print(j+"*"+i+"="+ sum + "\t"+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		
	}

}
