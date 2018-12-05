package day23;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(9090) ;
		
		while(true){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try{
						Socket s = ss.accept() ;
						InputStream is = s.getInputStream();
						String ip = s.getInetAddress().getHostName();
						int count = 1 ;
						File f = new File("E:/a/qiege/" + ip + ".jpg");
						while(f.exists()){
							f = new File("E:/a/qiege/" + ip +"("+ count + ")"+ ".jpg");
						}
						FileOutputStream fos = new FileOutputStream(f) ;
						byte[] by = new byte[1024] ;
						int len = 0 ;
						while((len = is.read(by)) != -1){
							fos.write(by , 0 , len) ; 
						}
						
						fos.close();
						System.out.println("接收完毕");
						
						System.out.println("-----------------------------------------");
						
						OutputStream os = s.getOutputStream();
						os.write("文件上传完毕".getBytes());
						
						s.close();
						
					}catch(IOException e){
						System.out.println(e);
					}
					
				}
			}).start();
 		}
	}

}
