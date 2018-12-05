package JiHe;
/*
 * 
 * 注意:Object类型的数组可以存储任意类型的数据
 * 为什么学习集合？
 * 	需求：收集我们班同学的兴趣爱好。
 * 		数组：存储兴趣爱好
 * 			每个人的兴趣爱好都不一样
 * 			String[] arr = new String[?];
 * 			长度无法确定
 * 
 * */
public class Collections {
	public static void main(String[] args) {
		Object[] ob = new Object[10];
		ob[1] = "abc" ;
		ob[2] = 'a' ;
		ob[3] = 12 ;
	}
}
