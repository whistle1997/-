package day17;

import java.util.HashMap;
import java.util.Set;

public class Demo01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		String str = "qisufrehuwhruthdsjhdq";
		char[] ch = str.toCharArray() ;
		for(int i = 0 ; i < ch.length ; i++){
			if(!(map.containsKey(ch[i]))){
				map.put(ch[i], 1);
			}else if(map.containsKey(ch[i])){
				int m = (int)map.get(ch[i])+1;
				map.replace(ch[i], m);
			}
		}
		Set set = map.keySet();
		for(Object o : set){
			System.out.println(o+"="+map.get(o));
		}
	}

}
