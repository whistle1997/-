package MianShi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
1��ʹ��File���е�length����
	ʹ�õݹ鼼������ȡ������ļ����µ�ÿ���ļ���Ȼ��ʹ��length�����õ����Ĵ�С���������ļ��Ĵ�С��������

2��ʹ���������е�available����
ʹ�õݹ鼼������ȡ������ļ����µ�ÿ���ļ���ʹ�����������ļ�������Ȼ��ʹ��available��ȡ������ļ����ܴ�С

 */
public class Demo01 {
	public static void main(String[] args) {
		File f = new File("E:/a");
		System.out.println(DaXiao(f));
		
		System.out.println();
		
		System.out.println(DaXiao1(f));
	}
	
	//length����
	public static long DaXiao(File f){
		File[] files = f.listFiles();
		long num = 0 ;
		for(File ff : files){
			if(ff.isDirectory()){
				num += DaXiao(ff);
			}else{
				num += ff.length() ;
			}
		}
		return num ;
	}
	
	//available����
	public static long DaXiao1(File f){
		File[] files = f.listFiles() ;
		int num = 0 ;
		for(File file : files){
			if(file.isDirectory()){
				num += DaXiao1(file);
			}else{
				try{
					FileInputStream in = new FileInputStream(file);
					num += in.available() ;
				}catch(IOException e){
					System.out.println("IO�쳣");
				}
			}
		}
		return num ;
	}
}

