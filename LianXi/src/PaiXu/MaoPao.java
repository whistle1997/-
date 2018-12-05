package PaiXu;

public class MaoPao {

	public static void main(String[] args) {
		int[] arr = {19 , 28 , 5, 2 , 83 ,61};
		MaoPao1(arr);
		for(int s : arr){
			System.out.println(s);
		}
	}
	public static int[] MaoPao1(int[] arr){
		for(int i = 0 ; i < arr.length - 1   ; i++){
			for(int j = 0 ; j < arr.length - 1 -i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
				}
			}
		}
		return arr;
	}
}
