package day25;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo02 {
	public static void main(String[] args) {
		Class c = null ;
		try {
			c = Class.forName("day25.Person");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Method[] mon = c.getMethods();
		for(Method m : mon){
			String s = Modifier.toString(m.getModifiers());
			Class<?> type = m.getReturnType() ;
			String name = m.getName() ;
			Class[] p = m.getParameterTypes();
			System.out.print(s + " " + type + " " + name + "(");
			for(int i = 0 ; i < p.length ; i++){
				if(i == p.length - 1){
					System.out.println(p[i] + "){}");
				}else{
					System.out.println(p[i] + ",");
				}
			}
			System.out.println();
		}
	}
}
