package day12;

import java.util.Arrays;

import org.junit.Test;

public class Demo4 {
	@Test
	public void test1(){
		String str = "abvidnkzaif" ;
		char[] ch = str.toCharArray();
		Arrays.sort(ch); // sort�����շ���ֵ�����Բ������������
		
		String str1 = new String(ch);
		System.out.println(str1);
		System.out.println(String.valueOf(ch));
	}
	@Test
	public void test2(){
		String str = "asjhfjaenmxhhfhsas";
		int count = 0 ;
		char key = 'h';
		for(int i = 0 ; i < str.length() ;i++){
			if(str.charAt(i) == key)
				count++ ;
		}
		System.out.println(count);
	}
	@Test
	public void test3(){
		String str = "abs Asdfa Efsdf fyusi";
		String[] s =str.split(" ");
		String str1 = "";
		//Arrays.sort(s);
		for(int i = 0 ; i< s.length -1 ; i++){
			int index = i ;
			for(int j = i + 1 ; j < s.length ; j++){
				if(s[i].compareTo(s[j]) < 0){
					index = j ;
					
				}
			}
			if(index != i){
				String temp = s[i];
				s[i] = s[index] ;
				s[index] = temp ;
			}
		}
		for(String st : s){
			str1 += st+" " ;
		}
		System.out.println(str1);
	}
	@Test
	public void test4(){
		String str = "abcde" ;
		for(int i = 0 ; i < str.length() ; i++){//����ѭ������
			for(int start = 0 , end = str.length() - i ; end <= str.length() ; start++ , end++){
				System.out.print(str.substring(start, end)+"\t");
			}
			System.out.println();
		}
		
	}
	@Test
	public void test5(){
		String str = "    asfdsfsg    ";
		char[] c = str.toCharArray();
		int start = 0 ;
		int end = c.length - 1 ;
		for(int i = 0 ; i < c.length ; i++){
			if(c[i] == 'a'){
				start = i ;
				break ;
			}
		}
		for(int j = end ; j > 0 ; j--){
			if(c[j] == 'g'){
				end = j + 1 ;
				break ;
			}
		}
		String str2 = str.substring(start, end);
		System.out.println(str2);
		//System.out.println(str[0]);
	}
	@Test
	public void test6(){
		String str = "11 -11 -1 -101 123 21 12 101";
		String[] s = str.split(" ");
		int[] arr = new int[s.length];
		for(int i = 0 ; i < s.length ; i++){
			arr[i] = Integer.parseInt(s[i]);
		}
		//ѡ������
//		for(int i = 0 ; i < arr.length - 1 ; i++){
//			int index = i ;
//			for(int j = i+ 1 ; j < arr.length ; j++){
//				if(arr[i] > arr[j])
//					index = j ;
//			}
//			if(index != i){
//				int temp = arr[i] ;
//				arr[i] = arr[index] ;
//				arr[index] = temp ;
//			}
//		}
		
		
		
		Arrays.sort(arr);
		str = Arrays.toString(arr); // ֱ�ӵ���Arrays������д��toString()����������������תΪString����
		System.out.println(str);
		String str1 = "";
		for(int i = 0 ; i < arr.length ; i++){  // �������� +�����κ��������ݱ�ΪString���ͣ�����������+���ӣ���Ϊ�ַ�����
			str1 += arr[i] + " ";
		}
		System.out.println(str1);
		String str2 = "";
		for(int i = 0 ; i < arr.length ; i++){// ����String���toString()������������תΪ�ַ�������
			str2 += String.valueOf(arr[i]) + " ";
		}
		System.out.println(str2);
		String str3 = "";
		for(int i = 0 ; i < arr.length ; i++){ //Integer ����д��toString�������Խ�����תΪ�ַ�������
			str3 += Integer.toString(arr[i]) + " ";
		}
		System.out.println(str3);
	}
	@Test
	public void test7(){
		String str = "sjdhfjsjdfjs";
		for(int i = 0 ; i < str.length() ; i++){ // ����ѭ������
			for(int start = 0 , end = str.length() - i ; end <= str.length() ; start++ , end++){
				System.out.print(str.substring(start, end)+"\t");
			}
			System.out.println();
		}
	}
}
