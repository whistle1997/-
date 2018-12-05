package JiHe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Collection c = new ArrayList();
		c.add("令计划");
		c.add("徐才厚");
		c.add("周永康");
		Object[] arr = c.toArray();//Object可以接受任意类型数组
		//把集合中的元素全部存储到一个Object数组中返回
		System.out.println("数组中的元素:"+ Arrays.toString(arr));
	*/
		Collection c = new ArrayList();
		c.add(new Person(110 , "狗娃"));
		c.add(new Person(110 , "狗剩"));
		c.add(new Person(110 , "铁蛋"));
		Object[] arr = c.toArray();
		//把编号110的人的信息输出
	}

}
