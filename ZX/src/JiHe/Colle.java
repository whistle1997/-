package JiHe;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合：集合是存储对象数据的集合容器
 * 
 * 集合优势：
 * 	1、集合可以存储任意类型的对象数据，数组只能存储同一类型的数据
 * 	2、集合的长度是变化的，数组的长度是固定的
 *
 *	Collection接口，是集合的接口，规范约束
 *	 
 *--------| Collection 单列集合的根接口。
 *-------------| Set 特点：无序，不可重复
 *-------------| List 特点：有序，可重复
 * 
 *collection中的方法
 *
 *
 *	增加：
 *		add(E e)
 *		addAll(int index, Collection<? extends E> c) 
          	将指定 collection 中的所有元素都插入到列表中的指定位置（可选操作）。
 *	删除：
 *		clear() 
          		从此列表中移除所有元素（可选操作）。
          		remove()
          		removeAll()
          		retainAll()
 *	查看：
 *		size()
 *
 *	判断：
 *		equals(Object o) 
          		将指定的对象与此列表进行相等性比较。
 *
 *	迭代：
 *		toArray()
 *		iterator()
 * */
public class Colle {
	public static void main(String[] args) {
		Collection c = new ArrayList();// 接口不能实现
		//add  添加成功返回true，失败返回false
		c.add("令计划");
		c.add("徐才厚");
		c.add("周永康");
		boolean flag = c.add("郭美美");
		System.out.println(flag);
		System.out.println(c);
		//addAll(Collection c) 把一个集合的元素添加到另一个集合的元素中
		Collection c2 = new ArrayList();
		c2.add("徐才厚");
		c2.add("郭美美");
		c2.add("狗娃");
		//c.addAll(c2) ;// 把c2的元素添加到集合中去
		
		//删除的方法
		//c.clear();//清空集合中的元素
		//System.out.println(c.remove("郭美美"));//指定集合中的元素删除，成功返回true，失败返回false
		
		//removeAll(Collection c)
		System.out.println(c2);
		//c.removeAll(c2); //删除c集合中的交集元素
		//retainAll()
		//c.retainAll(c2);//保留c集合中与c2的交集元素，其他元素删除
		//size() 查看元素个数
		System.out.println("查看元素个数："+c.size());
		
		System.out.println(c);
		
		
	}
}
