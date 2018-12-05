package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PicCut {

	private static BufferedInputStream bis1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/1.jpg"));
		byte[] by = new byte[1024];
		int len = 0 ;
		while((len = bis.read(by)) != -1){
			for(int i = 1 ; i <285 ; i++){
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/a/qiege/" + i + ".jpg"));
				bos.write(by);
				bos.close();
			}
		}
		bis.close();
		
		BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("E:/q.jpg"));
		for(int i = 1 ; i < 285 ; i++){
			
			bis1 = new BufferedInputStream(new FileInputStream("E:/a/qiege/" + i + ".jpg"));
			byte[] b = new byte[1024];
			int len1 = 0 ;
			while((len1 = bis1.read(b)) != -1){
				bos1.write(b);
			}
			bis1.close();
		}
		
		bos1.close();	
	}

}
