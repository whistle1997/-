import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class View {
	Scanner in = new Scanner(System.in);
	Server s = new Server();
	public void UI(){
		boolean flag = true ;
		System.out.println("===================学生信息系统===================");
		while(flag){
			System.out.println("\t\t1、增加学生信息");
			System.out.println("\t\t2、删除学生信息");
			System.out.println("\t\t3、查看所有学生信息");
			System.out.println("\t\t4、查看某学生信息");
			System.out.println("\t\t5、修改学生信息");
			System.out.println("\t\t6、退出系统");
			System.out.print("选择操作：");
			
			int choose = in.nextInt();
		
			  
			
			switch(choose){
				case 1:
				
					System.out.print("键入姓名:");
					String name = in.next() ;
					System.out.print("键入学号:");
					int id = in.nextInt() ;
					System.out.print("键入性别:");
					String sex = in.next() ;
					if(s.add(name , id , sex)){
						System.out.println("\t成功");
					}else{
						System.out.println("\t失败");
					}
					
					continue;
			
					
				case 2:
					if(s.map.size() != 0){
						Set set = s.map.keySet();
						System.out.print("\t从中选择要删除记录的学号:");
						System.out.println(set);
						int num = in.nextInt();
						s.delete(num);
					}else
						System.out.println("\t请先登记学生信息");
					/*if(s.delete(num))
						System.out.println("删除成功");
					else
						System.out.println("删除失败");*/
				
					continue;
				case 3:
					//System.out.println(s.map.values());
					if(s.map.size() == 0 )
						System.out.println("还未录入数据");
					Set set = s.map.keySet();
					for(Object key : set){
						System.out.println(s.map.get(key));
					}
					continue;
				
				case 4:
					if(s.map.size() != 0){
						Set set1 = s.map.keySet();
						System.out.println(set1);
						System.out.print("选择要查阅的学号：");
						int Num = in.nextInt() ;
						s.show(Num);
					}else
						System.out.println("\t请先登记学生信息");
					
					continue;
					
				case 5:
					
				case 6:
					System.out.println("确定退出？ Y/N");
					String exit = in.next();
					if(exit.equals("Y"))
						//break;
						flag = false ;
			}
			
		}
	}
}
