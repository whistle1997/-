package day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerCh {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(9090) ;
		while(true){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try{
						Socket s = ss.accept();
						InputStream is = s.getInputStream();
						InputStreamReader isr = new InputStreamReader(is);
						BufferedReader br = new BufferedReader(isr) ;
						FileOutputStream fos = new FileOutputStream("E:/Q.txt");
						OutputStreamWriter osw = new OutputStreamWriter(fos) ;
						BufferedWriter bw = new BufferedWriter(osw);
						String str = null;
						while((str = br.readLine()) != null){
							bw.write(str);
							bw.newLine();
							bw.flush();
							//System.out.println("----");
						}
						bw.close();
						s.close();
						System.out.println("Ω” ’ÕÍ±œ");
					}catch(IOException e){
						System.out.println(e);
					}
					

				}
			}).start();
		}
		
	}

}
