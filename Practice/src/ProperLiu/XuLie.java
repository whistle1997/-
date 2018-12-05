package ProperLiu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XuLie {
	public static void main(String[] args) {
		ObjectOutputStream oos = null ;//序列化
		ObjectInputStream ois = null ; //非序列化
		try{
			oos = new ObjectOutputStream(new FileOutputStream("E:/X.txt"));
			oos.writeInt(123);
			oos.writeBoolean(true);
			oos.write("lalalal".getBytes());
			
			ois = new ObjectInputStream(new FileInputStream("E:/X.txt"));
			int num = ois.readInt();
			boolean b = ois.readBoolean();
			
			System.out.println(num + " " + b);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				oos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
