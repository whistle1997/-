package day23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1" , 8989);
		OutputStream os = s.getOutputStream();
		os.write("我是石家庄人".getBytes());
		
		System.out.println("=======================");
		
		InputStream is = s.getInputStream();
		byte[] by = new byte[1024] ;
		int len = is.read(by);
		System.out.println(new String(by , 0 , len));
	}

}
