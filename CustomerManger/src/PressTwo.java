import java.util.Scanner;

public class PressTwo {
	int m = 0 ;
	Scanner in = new Scanner(System.in);
	//int choose;
	//AddCustomer add = new AddCustomer();
	public void Two(Customer[] cus){
		System.out.print("\t\t请输入您要删除客户的id:");
		int id = in.nextInt() ;
		for(int i = 0 ; i < cus.length ; i++){
			if(id == cus[i].getId()){
				m = i ;
				break ;
			}
				
		/*int i = in.nextInt() -1;
		Customer k = add.cus[i];
		for(int j = i ; j < add.cus.length ; j++){
			add.cus[j] = add.cus[j+1];
			if(add.cus[j+1] == null){
				add.cus[j] = null ;
				add.num = j ;
				break ;
				
			}*/
		}
		Customer k = cus[m];
		for(int j = m ; j < cus.length ; j++){
			cus[j] = cus[j+1];
			if(cus[j+1] == null){
				cus[j] = null ;
				AddCustomer.num = j ;
				break ;
			}
		}
		if(cus[m] != k)
			System.out.println("成功");
		else
			System.out.println("失败");
	}
}
