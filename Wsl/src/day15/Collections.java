package day15;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class Collections {
	@Test
	public void test1(){
		Collection c = new ArrayList();
		c.add("狗娃");
		c.add("狗剩");
		c.add("铁蛋");
		c.add(400823);//添加，添加整数是自动装箱成为类类型
		System.out.println(c);
		System.out.println(c.size()); //输出集合长度
		c.remove("狗娃");// 移除指定元素
		System.out.println(c);
		/*c.clear();//清空集合
		System.out.println(c);*///清空以后盒子[]还在
		System.out.println(c.isEmpty());//判断是否为空，为空则true
		Collection c2 = new ArrayList();
		c2.add("狗剩");
		//c2.add("铁蛋");
		System.out.println(c.contains("狗剩"));//查看是否有交集,有则true  ？？
		c.retainAll(c2); // 判断是否有交集,保留交集元素，删除其他元素.
		System.out.println(c);
		
	}
}
