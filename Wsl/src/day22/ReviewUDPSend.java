package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ReviewUDPSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(1025);//����һ�����ݴ������
		Scanner in = new Scanner(System.in);
		String s = in.next() ;
		byte[] by = s.getBytes();//Ҫ���͵�����
		InetAddress address = InetAddress.getByName("127.0.0.1") ;//���ô������ݵ�ip
		int port = 10161 ; //���ô���˿�
		DatagramPacket dp = new DatagramPacket(by , by.length , address , port); //��Ҫ��������ݴ��
		ds.send(dp); //�����ݰ�������
		byte[] b = new byte[1024] ;
		DatagramPacket dp1 = new DatagramPacket(b, b.length);
		ds.receive(dp1);
		byte[] buf = dp1.getData();
		System.out.println(new String(buf));
		ds.close();
		
	}

}
