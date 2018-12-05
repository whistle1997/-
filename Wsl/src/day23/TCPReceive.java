package day23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(8989) ;
		
		while(true){
			Socket s = ss.accept() ;
			Thread t = new Thread(new TCPRun(s));
			t.start();
		}
	}

}


class TCPRun implements Runnable{
	private Socket s ;
	public TCPRun(Socket s ){
		this.s = s ;
	}
	public void run(){
		try{
			
			InputStream is = s.getInputStream() ;
			byte[] by = new byte[1024] ;
			int len = is.read(by);
			System.out.println(new String(by , 0 , len));
			
			System.out.println("=================");
			
			OutputStream os = s.getOutputStream() ;
			os.write("打死那个石家庄人!".getBytes());
			
			s.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}