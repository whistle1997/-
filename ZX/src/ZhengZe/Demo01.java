package ZhengZe;
	/*
	 * 正则表达式：用于操作字符串的一个规则，正则表达式的规则使用了
	 * 特殊的符号表示。
	 * 
	 * 
	 * 校验一个QQ号
	 * 	1、不能0开头
	 * 	2、长度5~11
	 * 	3、只能有数字组成
	 * 
	 * 	
	 * */
public class Demo01 {
	public static void main(String[] args) {
		String QQ = "1234567";
		/*if(!QQ.startsWith("0") ){
			if(QQ.length() >= 5 && QQ.length() <= 11){
				try{
					Long.parseLong(QQ);
					System.out.println("合法QQ");
				}catch(Exception e){
					System.out.println("非法QQ，QQ号只能由数字组成");
				}
			}else{
				System.out.println("QQ号只能5到11位");
			}
		}else{
			//以0开头
			System.out.println("QQ号不能以0开头");
		}*/
		System.out.println(QQ.matches("[1-9]\\d{4,10}")?"合法QQ":"非法QQ");
	}
	
	
	
}
