package JiHe;

import java.util.HashSet;

/*
HashSet :使用了hash表支持，存取快
	hash表就是一个普通表格，特点：桶式结构，一个位置可以存储多个元素
	HashSet的实现原理：
		添加元素是，hash会先调用元素的hashCode()方法得到元素的哈希值，
		然后通过元素的哈希值经过位移等运算，就可以算出该元素在哈希表中的
		存储位置
		
		需要重写对象的hashCode方法
		情况一：如果算出元素存储的位置目前没有任何元素存储，那么该元素可直接
		存储到该位置
		
		情况二：如果算出该元素的存储位置目前已经存在其他元素，那么还会调用该元素的
		equals方法，与该位置元素再比较一次，如果返回true，那么该元素与该位置上的
		元素视为重复元素，不允许添加，如果返回false，那么则添加。
*/

class Persons{
	int id ;
	String name ;
	public Persons(int id ,String name){
		this.id = id ;
		this.name = name ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{编号:"+this.id + "姓名:" + this.name + "}" ;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//没添加一个对象就调用一次hashCode方法
		return this.id ; 
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Persons o = (Persons)obj ;
		return this.id == o.id;
	}
}

public class HashSetStudy {
	public static void main(String[] args) {
		/*HashSet set = new HashSet() ;
		set.add("狗娃");
		set.add("狗剩");
		set.add("铁蛋");
		System.out.println("集合的元素:" + set);*/
		
		HashSet set = new HashSet();
		set.add(new Persons(110 , "狗娃"));
		set.add(new Persons(120 , "狗剩"));
		set.add(new Persons(130 , "铁蛋"));
		set.add(new Persons(110 , "狗娃"));//也添加了
		System.out.println(set);
	}
}
