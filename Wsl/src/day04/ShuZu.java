package day04;

public class ShuZu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		for(int i = 0 ; i < arr.length ; i++){
			if(i == 0){
				System.out.print("{"+arr[i]+",");
			}else if(i != arr.length - 1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]+"}");
			}
		}
	}

}
