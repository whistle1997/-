import org.junit.Test;

public class Demo01 {
	//在命令行显示“嗨，美女”
	@Test
	public void test1(){
		System.out.println("嗨，美女");
	}

	//根据月份得季节
	@Test
	public void test2(){
		int month = 9 ; 
		if(month >= 1 && month <= 12){
			switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println(month+"月是春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"月是夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"月是秋天");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month+"月是冬天");
				break ;
			}
		}else{
			System.out.println("不是12个月份之一");
		}
	}

	//输出
	/*
	*
	**
	***
	****
	*****
	*/
	@Test
	public void test3(){
		
		for(int i = 0 ; i < 6 ; i++){ //列
			for(int j = i ; j < 2* i +1 ; j++){  //行
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//输出圣诞树
	
	
	//排序    冒泡
}
