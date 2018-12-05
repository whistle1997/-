package Sort;

import java.util.Arrays;

import org.junit.Test;

public class Sort {
	//ð������
	@Test
	public void test1(){
	
		int[] arr = {234,123,54,2,4,547,12};
		for(int i = 0 ; i < arr.length -1 ; i++){ // ���ƱȽϴ���
			for(int j = 0 ; j < arr.length - 1 - i ; j++){ //ÿ�ֱȽϻ�ѽϴ�Ԫ�ط��ں�ߣ�����Ҫ��ȥ�ȽϺ�ߵ�Ԫ��
				if(arr[j] > arr[j + 1]){
					int temp = arr[j] ;
					arr[j] = arr[j + 1] ;
					arr[j + 1] = temp ;
				}
			}
		}
		for(int num : arr)
			System.out.print(num + "  ");
	}

	//ѡ������1
	@Test
	public void test2(){
		int[] arr = {234,123,54,2,4,547,12};
		for(int i = 0 ; i < arr.length - 1 ; i++){
			for(int j = i + 1 ; j < arr.length  ; j++){
				if(arr[i] < arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp ;
				}
			}
		}
		for(int num : arr)
			System.out.print(num+" ");
	}

	//ѡ������2
	@Test
	public  void test3(){
		int[] arr = {234,123,54,2,4,547,12};
		for(int i = 0 ; i < arr.length - 1 ; i++){
			int index = i ;
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[index] < arr[j])
					index = j ;
			}
			if(index != i){
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp ;
			}
		}
		for(int num : arr){
			System.out.print(num + "  ");
		}
		
	}

	//�������ṩ�ķ���
	@Test
	public void test4(){
		int[] arr = {234,123,54,2,4,547,12};
		Arrays.sort(arr);
		for(int num : arr)
			System.out.print(num + " ");
	}
}
