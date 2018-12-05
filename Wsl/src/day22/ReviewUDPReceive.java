package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReviewUDPReceive {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(10161);//创建端点
		byte[] buf = new byte[1024] ;//创建数组用于接收发送来的数据
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		
		byte[] b = dp.getData() ; //获取传输的数据
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort() ;
		System.out.println(new String(b));
		System.out.println(ip);
		System.out.println(port);
		String str = new String(b);
		int count = 0 ;
		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i) ;
			if(c >= 'A' && c <= 'Z' && c >= 'a' && c <= 'z'){
				count++ ;
			}
		}
		byte[] by = ("字符有" + count + "个").getBytes();
		DatagramPacket dp1 = new DatagramPacket(by, by.length);
		ds.send(dp1);
		ds.close();
	}

}
