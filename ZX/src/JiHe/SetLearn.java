package JiHe;

import java.util.HashSet;
import java.util.Set;

/*
Set集合：
	无序：添加元素的顺序与元素出来的顺序不一致
无特有的方法
*/
public class SetLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("张三");
		set.add("李四");
		set.add("王五");
		System.out.println("添加成功吗?" + set.add("李四"));//重复元素不可添加
		System.out.println(set); //[李四, 张三, 王五]
	
	}

}
