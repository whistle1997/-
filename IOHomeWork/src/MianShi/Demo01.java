package MianShi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
1、使用File类中的length方法
	使用递归技术，获取到这个文件夹下的每个文件，然后使用length方法得到它的大小，将所有文件的大小加起来。

2、使用输入流中的available方法
使用递归技术，获取到这个文件夹下的每个文件，使用输入流和文件关联，然后使用available获取到这个文件的总大小

 */
public class Demo01 {
	public static void main(String[] args) {
		File f = new File("E:/a");
		System.out.println(DaXiao(f));
		
		System.out.println();
		
		System.out.println(DaXiao1(f));
	}
	
	//length方法
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
	
	//available方法
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
					System.out.println("IO异常");
				}
			}
		}
		return num ;
	}
}

