import org.junit.Test;

public class Demo01 {
	//����������ʾ���ˣ���Ů��
	@Test
	public void test1(){
		System.out.println("�ˣ���Ů");
	}

	//�����·ݵü���
	@Test
	public void test2(){
		int month = 9 ; 
		if(month >= 1 && month <= 12){
			switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println(month+"���Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"��������");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"��������");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month+"���Ƕ���");
				break ;
			}
		}else{
			System.out.println("����12���·�֮һ");
		}
	}

	//���
	/*
	*
	**
	***
	****
	*****
	*/
	@Test
	public void test3(){
		
		for(int i = 0 ; i < 6 ; i++){ //��
			for(int j = i ; j < 2* i +1 ; j++){  //��
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//���ʥ����
	
	
	//����    ð��
}
