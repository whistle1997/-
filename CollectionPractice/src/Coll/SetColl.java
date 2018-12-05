package Coll;

import java.util.HashSet;
import java.util.Set;

public class SetColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add(new Person("狗娃", 18));
		set.add(new Person("铁蛋", 18));
		set.add(new Person("铁蛋", 18));
		set.add(new Person("大妞", 18));
		//[姓名：铁蛋 年龄：18, 姓名：狗娃 年龄：18, 姓名：铁蛋 年龄：18, 姓名：大妞 年龄：18]
		//全部添加是因为Person没有重写HashCode方法和euqals方法，添加时先比较hashCode，如果相同则调用equals
		System.out.println(set); //[姓名：狗娃 年龄：18, 姓名：铁蛋 年龄：18, 姓名：大妞 年龄：18]
	}

}
