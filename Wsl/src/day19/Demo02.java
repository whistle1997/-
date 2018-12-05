package day19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class Demo02 {
	@Test
	public void test1(){
		FileWriter fw = null;
		FileReader fr  = null ;
		try{
			fr  = new FileReader("E:/A.txt");
			 fw = new FileWriter("E:/a/A.txt");
			char[] ch = new char[1024];
			int len = 0 ;
			while((len = fr.read(ch)) != -1){
				fw.write(ch , 0 , len);
			}
		}catch(IOException e){
			System.out.println("IO “Ï≥£");
		}finally{
			try{
				fr.close();
				fw.close();
			}catch(IOException e){
				System.out.println("IO “Ï≥£");
			}
		}
		
	}
}
