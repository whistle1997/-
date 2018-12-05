package JiHe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*迭代：
	listIterator()
	具备iterator接口所有方法
	特有的方法:
		添加：
		 hasPrevious()  问有没有上一个元素
		 previous()		当前指针向上移动一个单位，再取出当前指针执行的元素
		 				先移动再取
		 对比next() : 先取元素再移动
-----------------------------------		 
		 add(E e) 把当前元素插入到当前指针指向的位置上
		 set(E e) 替换迭代器最后一次返回的元素
		 
*/
public class List_diedai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋");
		list.add("美美");
		
		ListIterator it = list.listIterator();//返回一个List接口中特有的迭代器
		/*it.next() ;
		System.out.println("又上一个元素吗?"+it.hasPrevious());//当前指针指向第0个元素
		System.out.println("获取上一个元素："+it.previous());
		
		//倒叙输出数组
		while(it.hasNext()){
			it.next();
		}
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}*/
		it.next();
		it.set("张三");
		System.out.println(list);
	}

}
