package JiHe;

import java.util.ArrayList;
import java.util.Collection;

/*判断：
 * 	isEmpty()
 * 	contains(Object o)
 * 	containsAll(Collection c)
 * 
 *迭代：
 *	toArray()
 *		返回集合中所有元素的数组 
 * */
class Person{
	int id ;
	String name ;
	public Person(int id , String name){
		this.id = id ;
		this.name = name ;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{编号："+this.id + "姓名："+this.name+"}";
	}
	public boolean equals(Object obj){
		Person p = (Person)obj ;
		return this.id == p.id;
	}
	//java的规范,一般重写了equals方法，一般都重写hashCode方法
	public int hashCode(){
		return this.id;
	}
}
public class PanDuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Collection c = new ArrayList();
		c.add("令计划");
		c.add("徐才厚");
		c.add("周永康");
		System.out.println("判断集合是否空元素："+ c.isEmpty());
		System.out.println("判断是否存在指定元素:"+ c.contains("徐才厚"));
		*/
		//添加自定义元素
		Collection c = new ArrayList();
		c.add(new Person(110 , "狗娃"));
		c.add(new Person(110 , "狗剩"));
		c.add(new Person(110 , "铁蛋"));
		// 如果在现实生活中，只有身份证一致就为同一个人
		System.out.println("存在该元素吗："+ c.contains(new Person(110 , "铁蛋")));
		//contains依赖于equals方法  用到实参的equals方法，并非集合数据的equals
		
		//containsAll比较所有元素，一个有错都不行
		Collection c2 = new ArrayList() ;
		c2.add(new Person(110 , "狗娃"));
		c2.add(new Person(110 , "chens狗剩"));
		c2.add(new Person(100 , "铁蛋"));
		System.out.println(c.containsAll(c2));
		System.out.println(c);//需要重新toString
	}

}
