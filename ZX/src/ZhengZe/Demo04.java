package ZhengZe;
/*
 * 作业：编写一个正则匹配一个邮箱 
 * 
 * */
public class Demo04 {
	public static void main(String[] args) {
		String em = "1234@qq.com";
		Email(em);
	}
	public static void Email(String em){
		String reg = "[1-9]\\d{4,5}@[qq,163]{2,3}.[com,net]{3}";
		System.out.println((em.matches(reg))?"合法邮箱":"非法邮箱");
	}
}
