package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;



public class UDPReceive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(8989);
		
		byte[] buf = new byte[1024] ;
		DatagramPacket dp = new DatagramPacket(buf, buf.length) ;
		
		ds.receive(dp);
		
		byte[] data = dp.getData() ;
		String ip = dp.getAddress().getHostAddress() ;
		int port = dp.getPort() ;
		System.out.println(ip);
		System.out.println(new String(data));
		System.out.println(port);
		
		ds.close();
	}

}
