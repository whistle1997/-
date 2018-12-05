
public class Clean {
	int num = 0 ;
	public int[] cleanArr(int[] arr){
		//先计算出重复元素个数
		int num = 0 ;
		for(int i = 0 ; i < arr.length -1 ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					num++ ;
					break ;
				}
			}
		}
		int[] newArr = new int[arr.length - num];
		for(int i = 0 ; i < arr.length ; i++){
			int temp = arr[i] ;
			boolean flag = false ;//默认不是重复元素
			int index = 0 ;
			//检查新数组是否存在已有元素
			for(int j = 0 ; j < newArr.length ; j++){
				if(newArr[j] == temp){
					flag = true ;
					break ;
				}
			}
			//不是重复元素
			if(flag == false){
				newArr[index++] = temp ;	
			}
			
		}
		//把旧数组元素存入新数组
		return newArr ;
	}
}
