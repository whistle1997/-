package ProperLiu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GongnengLiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.put("zhangsan", "chouxiedaimade");
		prop.put("lisi", "kaiche");
		prop.put("wangwu", "chuzi");
		try{
			prop.store(new FileOutputStream("E:/F.txt"), "ddddd");
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
