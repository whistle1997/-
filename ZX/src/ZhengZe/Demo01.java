package ZhengZe;
	/*
	 * ������ʽ�����ڲ����ַ�����һ������������ʽ�Ĺ���ʹ����
	 * ����ķ��ű�ʾ��
	 * 
	 * 
	 * У��һ��QQ��
	 * 	1������0��ͷ
	 * 	2������5~11
	 * 	3��ֻ�����������
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
					System.out.println("�Ϸ�QQ");
				}catch(Exception e){
					System.out.println("�Ƿ�QQ��QQ��ֻ�����������");
				}
			}else{
				System.out.println("QQ��ֻ��5��11λ");
			}
		}else{
			//��0��ͷ
			System.out.println("QQ�Ų�����0��ͷ");
		}*/
		System.out.println(QQ.matches("[1-9]\\d{4,10}")?"�Ϸ�QQ":"�Ƿ�QQ");
	}
	
	
	
}
