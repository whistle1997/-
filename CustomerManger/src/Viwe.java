import java.util.Scanner;

//展示操作选项，选择，录入数据
public class Viwe {
	Scanner in = new Scanner(System.in);
	int choose;
	AddCustomer add = new AddCustomer();
	
	public void print(){
		
		while(true){
			System.out.println("=============客户管理信息系统=============");
			System.out.println("\t\t1、增加用户");
			System.out.println("\t\t2、删除用户");
			System.out.println("\t\t3、展示用户信息");
			System.out.println("\t\t4、显示某用户");
			System.out.println("\t\t5、停止");
			System.out.print("\t选择您希望的操作:");
			choose = in.nextInt();
			if(choose == 1){
					PressOne p = new PressOne();
					Customer c = p.One();
					boolean b = add.addC(c);
					if(b)
						System.out.println("\t添加成功!");
					else
						System.out.println("\t添加失败....");
			}
			if(choose == 3){
				System.out.println("\t\tid\t姓名\t年龄\t性别\tVIP类型");
				for(int i = 0 ; i < add.cus.length ; i++){
					if(add.cus[i] != null)
						System.out.println(add.cus[i].getInf0());
				}
				System.out.println();
			}
			if(choose == 2){
				PressTwo p = new PressTwo();
				p.Two(add.cus);
				/*System.out.print("\t\t请输入您要删除客户的姓名:");
				String name = in.next() ;
				int m = 0 ;
				for(int i = 0 ; i < add.cus.length ; i++){
					if(name.equals(add.cus[i].getName())){
						m = i ;
						break ;
					}
						
				int i = in.nextInt() -1;
				Customer k = add.cus[i];
				for(int j = i ; j < add.cus.length ; j++){
					add.cus[j] = add.cus[j+1];
					if(add.cus[j+1] == null){
						add.cus[j] = null ;
						add.num = j ;
						break ;
						
					}
				}
				Customer k = add.cus[m];
				for(int j = m ; j < add.cus.length ; j++){
					add.cus[j] = add.cus[j+1];
					if(add.cus[j+1] == null){
						add.cus[j] = null ;
						add.num = j ;
						break ;
					}
				}
				if(add.cus[m] != k)
					System.out.println("成功");
				else
					System.out.println("失败");*/
			}
			if(choose == 4){
				System.out.print("\t\t输入您要查找的客户id:");
				int id = in.nextInt() ;
				try{
					for(int i = 0 ; i < add.cus.length ; i++){
						if(id==add.cus[i].getId()){
							System.out.println("\t\tid\t姓名\t年龄\t性别\tVIP类型");
							System.out.println(add.cus[i].getInf0());
							break;
						}
					}
				}catch(NullPointerException e){
					System.out.println("\t\t您还未登记客户信息。");
					System.out.println( );
				}
				/*int i = in.nextInt() - 1;
				System.out.println("\t\t姓名\t年龄\t性别");
				System.out.println(add.cus[i].getInf0());*/
			}
			if(choose == 5){
				System.out.print("\t\t确定退出？ Y/N:");
				String s = in.next();
				if(s.equals("Y")){
					break;
				}
			}
		}
	}
}
