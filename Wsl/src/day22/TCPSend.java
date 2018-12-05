package day22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Socket s = new Socket("localhost", 9090);
		OutputStream os = s.getOutputStream() ;
		os.write("嘿".getBytes());
		
		System.out.println("数据传输完毕");
		System.out.println("接收服务端反馈数据");
		
		InputStream is = s.getInputStream();
		byte[] b = new byte[1024] ;
		int len = is.read(b) ;
		System.out.println(new String(b , 0 , len));
		
		s.close();
	}

}
