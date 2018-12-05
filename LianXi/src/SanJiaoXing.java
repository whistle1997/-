import java.util.Scanner;

public class SanJiaoXing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int height = input.nextInt();
		for(int i = 0 ; i < height ; i++){
			for(int j = 0 ; j < height - i - 1; j++){
				System.out.print("  ");
			}
			for(int k = 0 ; k < 2*i+1;k++){
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
