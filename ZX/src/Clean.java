
public class Clean {
	int num = 0 ;
	public int[] cleanArr(int[] arr){
		//�ȼ�����ظ�Ԫ�ظ���
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
			boolean flag = false ;//Ĭ�ϲ����ظ�Ԫ��
			int index = 0 ;
			//����������Ƿ��������Ԫ��
			for(int j = 0 ; j < newArr.length ; j++){
				if(newArr[j] == temp){
					flag = true ;
					break ;
				}
			}
			//�����ظ�Ԫ��
			if(flag == false){
				newArr[index++] = temp ;	
			}
			
		}
		//�Ѿ�����Ԫ�ش���������
		return newArr ;
	}
}
