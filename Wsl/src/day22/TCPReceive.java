package day22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��������
		ServerSocket ss = new ServerSocket(9090);
		Socket s = ss.accept() ;
		InputStream is = s.getInputStream() ;
		byte[] b = new byte[1024] ;
		int len = is.read(b) ;
		System.out.println(new String(b , 0 , len));
		
		//��ͻ��˷�������
		OutputStream os = s.getOutputStream();
		byte[] by = "����������".getBytes() ;
		os.write(by);
		
		s.close();
		ss.close();
	}

}
