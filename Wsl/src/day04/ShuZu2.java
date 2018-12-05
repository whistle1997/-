package day04;

public class ShuZu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		//int[] arr = {1,2,3,4,5,6,7,8};
		for(int i = 0 ; i <= arr.length / 2 ; i++){
					int temp = 0 ;
					temp = arr[i];
					arr[i] = arr[arr.length-i-1];
					arr[arr.length-i-1] = temp ;
			
		}
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+",");
		}

	}

}
