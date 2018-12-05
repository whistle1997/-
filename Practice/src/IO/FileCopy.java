package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis = null ;
		BufferedOutputStream bos = null ;
		BufferedReader br = null ;
		BufferedWriter bw = null ;
		try{
			bis = new BufferedInputStream(new FileInputStream("E:/A.txt"));
			bos = new BufferedOutputStream(new FileOutputStream("E:/E.txt"));
			br = new BufferedReader(new FileReader("E:/A.txt"));
			bw = new BufferedWriter(new FileWriter("E:/D.txt"));
			int len = 0 ; 
			//逐个字节复制
			/*while((len = bis.read()) != -1){
				bos.write(len);
			}*/
			//数组复制
			/*byte[] b = new byte[1024];
			while((len = bis.read(b)) != -1){
				bos.write(b);
			}*/
			
			//按行复制
			String str = "";
			while((str = br.readLine()) != null){
				bw.write(str);
				bw.newLine();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				bis.close();
				bos.close();
				br.close();
				bw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
