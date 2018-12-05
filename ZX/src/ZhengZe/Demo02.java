package ZhengZe;
/*
 * 正则表达式
 * 		
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Demo02 {

	public static void main(String[] args) {
		/*
		 * 预定义字符类
		 * 	. 任何字符（与行结束符可能匹配也可能不匹配）
		 * 	\d数字：[0~9]
		 * 	\D非数字：[^0~9]
		 * 	\s空白字符：[ \t\n\x0B\f\r]
		 * 	\S非空白字符：[^\s]
		 * 	\w单词字符：[a-z A-Z _ 0-9]
		 * 	\W非单词字符：[^\w]
		 * 注意：任何预定义字符没有加上数量词之前，都只能匹配一个字符而已
		 * 
		 * 
		 * 		
		 * */
		System.out.println("任意字符："+("a".matches(".")));
		System.out.println("数字字符："+("1".matches("\\d")));
		System.out.println("非数字字符："+("@".matches("\\D")));
		System.out.println("空白字符："+("\r".matches("\\s")));
		System.out.println("非空白字符："+("a".matches("\\S")));
		System.out.println("单词字符："+("_".matches("\\w")));
		System.out.println("非单词字符："+("@".matches("\\W")));
		
		/*
		 * 数量词：
		 * 	X ? X , 问号表示一次或者一次也没有
		 * 	X*  X, 星号表示0或多次
		 * 
		 * */
		System.out.println("?一次或者一次也没有："+("1".matches("\\d?")));
		System.out.println("* 零次或者多次："+("123".matches("\\d*")));
		System.out.println("+ 至少出现一次："+("1".matches("\\d+")));
		System.out.println("{n} 恰好出现n次："+("13991386570".matches("\\d{11}")));
		System.out.println("{次数,} 至少要出现的次数："+("123".matches("\\d{3,}")));
		System.out.println("{次数1,次数2} 指定出现的次数范围："+("1233".matches("\\d{3,4}")));
		
		/*
		 *  范围词：控制出现字符的范围
		 * 	注意：范围词里面不管有多长，没有数量词配合都只能匹配一个字符
		 * */
		
		System.out.println("出现的字符为其中一个"+("a".matches("[abc]"))); //没有数量词只能匹配一个
		System.out.println("非abc："+("a".matches("^abc]")));
		System.out.println("字符可以出现在a~zA~Z和$之间:"+("a".matches("[a-zA-Z$]")));
	}

}
