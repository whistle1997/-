package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ProPer {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
//		prop.put("username" , "狗娃");  //key和value必须为String类型
//		prop.put("passkey", "123456") ;
//		prop.store(new FileOutputStream("E:/A.txt"), "JustLearn");
		
		prop.load(new FileInputStream("E:/A.txt"));
		Set<Object> set = prop.keySet();
		for(Object key : set){
			String k = (String)key ;
			System.out.println(k + " " + prop.getProperty(k));
		}
	}	

}
