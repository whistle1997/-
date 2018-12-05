package JiHe;

import java.util.ArrayList;
import java.util.List;

/*
 * 	List
 * 		有序：不是指自然顺序，是指添加顺序与输出顺序一致
 * 	list接口中特有的方法:
 * 		添加：
 * 			add(int index , E element)	
 * 			addAll(int index , Collection<? extends E> c)
 * 		获取:
 * 			get(int index)
 * 			indexOf(Object o )
 * 			LastIndexOf(Object o )
 * 			subList(int fromIndex , int toIndex)
 * 		修改：
 * 			set(int index , Collection)
 * 
 * List接口中特有的方法具备的特点：操作的方法都存在索引值。
 * 
 * 只有List接口下面的集合类才具备索引值，其他接口下面的集合类都没用索引值
 * 		
 * 		迭代：
 * 			listIterator()
 * 
 * */
public class List_TeYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋"); // 把元素添加到集合的末尾处
		//添加方法
		/*list.add(1 , "赵本山");*/ //把元素添加到集合中的指定索引值位置
		/*List list2 = new ArrayList<>();
		list2.add("本山");
		list2.add("小沈阳");
		list.addAll(2 , list2);*/ 
		//把list2的元素添加到list指定索引位置的位置上
		
		
		//获取方法
		/*System.out.println(list.get(0));//根据索引值获取集合中的元素
		//遍历集合元素
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println(list.indexOf("本山"));//找出指定元素在集合中第一次出现的索引值
		System.out.println(list.lastIndexOf("狗娃"));//找出指定元素在集合中最后一次出现的索引值
		List sublist = list.subList(1, 3) ;//指定开始与结束的索引值，并截取指定元素
		System.out.println(sublist);*/
		
		
		//修改的方法
		list.set(0 , "本山"); //使用指定的元素替换指定索引值的元素
		
		System.out.println(list);
	}

}
