package day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCPClientCh {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1" , 9090);
		
		FileReader fr = new FileReader("E:/A.txt");
		BufferedReader br = new BufferedReader(fr);
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osr);
		//转换为字符流
		byte[] b = new byte[1024];
		String str = "";
		while((str = br.readLine()) != null){
			bw.write(str);
			bw.newLine();
			bw.flush();
		
		}
		s.shutdownInput();;
		bw.close();
		br.close();
		System.out.println("发送完毕");
			
	}	
}


