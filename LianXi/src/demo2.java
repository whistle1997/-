import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int height = input.nextInt();
		for(int i = 0 ; i < height ; i++){
			for(int j = height - i - 1 ; j > 0 ; j--){
				System.out.print("  ");
			}
			for(int k = height ; k < 2*i+1;k++){
				System.out.print("*");
			}
			System.out.println();
		}


	}

}