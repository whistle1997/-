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
		os.write("��".getBytes());
		
		System.out.println("���ݴ������");
		System.out.println("���շ���˷�������");
		
		InputStream is = s.getInputStream();
		byte[] b = new byte[1024] ;
		int len = is.read(b) ;
		System.out.println(new String(b , 0 , len));
		
		s.close();
	}

}
