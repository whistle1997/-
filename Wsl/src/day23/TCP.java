package day23;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("10.10.89.140" , 9999) ;
		FileInputStream fis = new FileInputStream("E:/1.jpg");
		OutputStream os = s.getOutputStream();
		byte[] by = new byte[1024] ;
		int len = 0 ;
		while((len = fis.read(by)) != -1){
			os.write(by ,0 , len);
		}
		fis.close();
		s.shutdownOutput();
		
		System.out.println("------------------等待服务端反馈-------------------");
		InputStream is = s.getInputStream() ;
		byte[] b = new byte[1024];
		int len1 = is.read(b);
		System.out.println(new String(b , 0 , len1));
	}

}
