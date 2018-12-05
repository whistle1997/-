package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ReviewUDPSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(1025);//创建一个数据传输对象
		Scanner in = new Scanner(System.in);
		String s = in.next() ;
		byte[] by = s.getBytes();//要发送的数据
		InetAddress address = InetAddress.getByName("127.0.0.1") ;//设置传输数据的ip
		int port = 10161 ; //设置传输端口
		DatagramPacket dp = new DatagramPacket(by , by.length , address , port); //将要传输的数据打包
		ds.send(dp); //将数据包发送走
		byte[] b = new byte[1024] ;
		DatagramPacket dp1 = new DatagramPacket(b, b.length);
		ds.receive(dp1);
		byte[] buf = dp1.getData();
		System.out.println(new String(buf));
		ds.close();
		
	}

}
