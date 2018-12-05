package day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null ;
		try{
			br = new BufferedReader(new FileReader("E:/A.txt"));
			String str = "" ;
			ArrayList<Person> list = new ArrayList<>();
			str = br.readLine();
			while(str != null){
				String n = br.readLine();
				if(n != null){
					list.add(new Person(str , Integer.parseInt(n)));
					str = br.readLine() ;
				}else{
					break;
				}
					
			
			}
			System.out.println(list);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				br.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
class Person{
	private String name ;
	private int age ;
	public Person(String name , int age){
		this.name = name ;
		this.age = age ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "–’√˚:"+name+" " + "ƒÍ¡‰:" + age;
	}
}