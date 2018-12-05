package PaiXu;

public class ErFenChaZhao {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int x = PaiXu(arr , 8);
		System.out.println(x);

	}
	public static int PaiXu(int[] arr , int key){
		int low = 0;  //将low指针放在数组的第一个位置
		int height = arr.length - 1 ; //将height指针放在数组最后一个位置
		while(height >= low){ 
			int center = (low + height) / 2 ;  
			if(key > arr[center]){
				low = center + 1 ;
			}else if(key < arr[center]){
				height = center - 1 ;
			}else{
				return center ;
			}
		}
		return -1 ;
	}
}
