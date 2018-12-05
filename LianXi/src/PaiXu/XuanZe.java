package PaiXu;

public class XuanZe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {19 , 28 , 5, 2 , 83 ,61};
		
		XuanZe1(arr);
		//System.out.println(x);
		
	}
	/*public static int XuanZe1(int[] arr){
		for(int i = 0 ; i < arr.length - 1; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[j] < arr[i]){
					int temp = arr[j] ;
					arr[j] = arr[i]; 
					arr[i] = temp ;
				}
			}
		}
		return ShaiXuan(arr , 19);
	}*/
	/*public static int ShaiXuan(int[] arr , int key){
		int low = 0 ;
		int height = arr.length - 1;
		while(low != height){
			int center = (low + height) / 2;
			if(key == arr[center]){
				return center ;
			}else if(key > arr[center]){
				low = center + 1 ;
			}else if(key < arr[center]){
				 
				height = center - 1 ;
			}
		}
		return -1;
		
	}*/
	public static void XuanZe1(int[] arr){
		for(int i = 0 ; i < arr.length - 1 ; i++){
			int index = i ;
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[j] < arr[index])
					index = j ;
			}
			if(index != i ){
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		Print(arr);
	}
	public static void Print(int[] arr){
		for(int num : arr){
			System.out.println(num);
		}
	}

}
