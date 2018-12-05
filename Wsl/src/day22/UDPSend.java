package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(9191) ;
		byte[] data = "你是赵树争吧".getBytes() ;
		
		InetAddress address = InetAddress.getByName("10.10.89.145");
		int port = 8989 ;
		DatagramPacket dp = new DatagramPacket(data, data.length , address , port);
		ds.send(dp);
		System.out.println("已发送");
		ds.close();
	}

}
