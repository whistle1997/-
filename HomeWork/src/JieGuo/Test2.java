package JieGuo;
/*���Ϊ��
 * 	��̬�����Fu
		��̬�����Zi
		��������Fu
		���췽��Fu
		��������Zi
		���췽��Zi
		
		ԭ������������Zi�����Zi��̳�Fu�࣬���Խ�Zi��Fu�еľ�̬��������޼��ص��������ľ�̬����ִ�У�Zi�๹�췽��
		��һ��������super();,�������������ڹ��췽��ִ�У�������ִ��Fu�еĹ������顢���췽������ִ��Zi��Ĺ������顢���췽��
 * */

class Fu {
	static {
		System.out.println("��̬�����Fu");
	}

	{
		System.out.println("��������Fu");
	}

	public Fu() {
		System.out.println("���췽��Fu");
	}
}

class Zi extends Fu {
	static {
		System.out.println("��̬�����Zi");
	}

	{
		System.out.println("��������Zi");
	}

	public Zi() {
		System.out.println("���췽��Zi");
	}
}

       class Test2{

       public static void main(String[] args){
Zi z = new Zi(); //��д��ִ�н����
           }


       }
       
     