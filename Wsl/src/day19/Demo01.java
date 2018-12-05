package day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Demo01 {
	@Test
	public void test1() throws IOException{
		//切割图片
		//先读入缓冲区
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/1.jpg"));
		int len = 0 ;
		int i = 1 ;
		byte[] b = new byte[1024] ;
		while((len = bis.read(b)) != -1){
			//写入一个文件夹
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/1/"+i+".jpg"));
			bos.write(b , 0 , len);
			bos.close();
			i++ ;
		}
		bis.close();
	}
	
	@Test
	public void test2() throws IOException{
		//先读取所有
		File f = new File("E:/1");
		File[] files = f.listFiles() ;
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/ r.jpg"));
		for(int i = 0 ; i < files.length  ; i++){
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/1/"+(i+1)+".jpg"));
			byte[] b = new byte[1024] ;
			int len = 0 ;
			while((len = bis.read(b)) != -1){
				
				bos.write(b);
			}
			bis.close();
		}
		bos.close();
	}
}
