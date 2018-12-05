package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("E:/A.txt") ;
		FileOutputStream fos = new FileOutputStream("E:/P.txt");
		byte[] by = new byte[1024] ;
		int len = 0 ;
		while((len = fis.read(by)) != -1){
			fos.write(by);
		}
		fos.close();
		fis.close();

	}

}
