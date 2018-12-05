package day25;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Demo04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c = null ;
		try {
			c = Class.forName("day25.Demo04");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//构造方法
		Constructor[] cons = c.getConstructors();
		for(Constructor con : cons){
			String str = Modifier.toString(con.getModifiers());
			String name = con.getName();
			Class[] type = con.getParameterTypes();
			System.out.print(str + " " + name + "(");
			if(type.length == 0)
				System.out.print("){}");
			for(int i = 0 ; i < type.length ; i++){
				
				if(i == type.length - 1){
					System.out.print(type[i] + "){}");
				}else{
					System.out.print(type[i] + ",");
				}
			}
			System.out.println();
		}
	}

}
