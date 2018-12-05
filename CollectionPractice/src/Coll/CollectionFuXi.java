package Coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionFuXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection是一个借口，不可被实例化
		Collection coll = new ArrayList(); //通过实现类来进行实例化。
		//添加方法
		coll.add("123");
		coll.add("1234");
		coll.add("12345");
		coll.add(new Person("狗娃", 18));
		coll.add(new Person("狗蛋", 18));
		System.out.println(coll); //[123, 1234, 12345, 姓名：狗娃 年龄：18, 姓名：狗蛋 年龄：18]
		//特点：有序（输入输出顺序相同），可重复（添加时没有调用比较方法，如equals，compareTo，compare等）
		//添加时输入基本类型会自动装箱
		
		//获取长度
		System.out.println(coll.size());//5
		
		//移除指定元素(返回Boolean类型结果)
		System.out.println(coll.remove("123")); //true
		
		//清空元素
		//coll.clear();
		//System.out.println(coll);// []
		
		//遍历
		//方法一
		for(Object obj : coll){
			System.out.println(obj);
			/*1234
			12345
			姓名：狗娃 年龄：18
			姓名：狗蛋 年龄：18*/

		}
		//方法二：迭代器
		Iterator it = coll.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		/*1234
		12345
		姓名：狗娃 年龄：18
		姓名：狗蛋 年龄：18*/
		System.out.println("========================================================================");
		System.out.println();
		
		List list = new ArrayList();
		
		list.add("123");
		list.add(new Person("狗娃", 18));
		list.add(new Person("狗蛋", 18));
		//在指定位置添加元素
		list.add(3 , new Person("吴帅霖" , 21));
		/*Iterator it1 = list.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next()); //集合角标从0开始，元素添加至角标为3的位置
		}
		System.out.println(list.ge
		\t(0)); // 根据指定索引返回对象的元素
		
		System.out.println(list.remove(3)); //姓名：吴帅霖 年龄：21
		//删除指定索引对应的元素，并返回这个元素的值
*/		
		System.out.println(list.set(1 , "wdj")); //1234
		//替换指定索引对应的元素，并返回修改前的值
		
		ListIterator listIt = list.listIterator();//list特有的迭代器，可以前后遍历，并可以使用这个迭代器特有的增删改查等方法
		System.out.println();
		listIt.add(345);
		while(listIt.hasNext()){
			
			System.out.println(listIt.next()); //从上向下遍历
		}
		while(listIt.hasPrevious()){
			System.out.println(listIt.previous()); //从下向上遍历
		}
	}

}
