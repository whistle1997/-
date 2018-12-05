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
 * 		迭代：
 * 			listIterator()
 * 
 * */
public class ListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		list.add("赵六");
		//有序，可重复
		System.out.println(list);
	}

}
