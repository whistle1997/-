package day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("E:/a/A.txt" );
		fos.write("helloworld".getBytes());
		fos.write("hahaha".getBytes());
		
		fos.close();
		///输出流将数据写入目标文件
		
		FileInputStream fis = new FileInputStream("E:/a/A.txt");
		byte[] by = new byte[15];
		
		/*while(fis.read(by) != -1){
			System.out.println(new String(by,0,fis.read(by)));
		}
		*/
		int num = fis.read(by);
		while(num != -1){
			System.out.print(new String(by , 0 , num));
			num = fis.read(by);
		}
		
		
		//复制
		FileInputStream fis1 = new FileInputStream("E:/a/A.txt");
		FileOutputStream fos1 = new FileOutputStream("E:/A.txt" );
		byte[] by1 = new byte[15];
		int num1 = fis1.read(by1);
		while(num1 != -1){
			fos1.write(by1);
			num1 = fis1.read(by1);
		}
		fos1.close();
	}
	
	
}
