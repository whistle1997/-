package Day09;

import java.util.Scanner;

public class PaiXu {
Scanner in = new Scanner(System.in);
	
	public int[] MaoPao(int[] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print("请输入第"+(i+1)+"个数");
			
			arr[i] = in.nextInt();
		}
		for(int i = 0 ; i < arr.length - 1   ; i++){
			for(int j = 0 ; j < arr.length - 1 -i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
				}
			}
		}
		return arr ;
	}
	public int[] Age(int[] b){
		for(int i = 0 ; i < b.length - 1   ; i++){
			for(int j = 0 ; j < b.length - 1 -i; j++){
				if(b[j] >b[j+1]){
					int temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp ;
				}
			}
		}
		return b ;
	}
}
