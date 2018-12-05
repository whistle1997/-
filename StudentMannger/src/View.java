import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class View {
	
	private Scanner in = new Scanner(System.in);
	private Service s = new Service() ;
	
	
	public void Show() throws InputMismatchException{ //交互
		System.out.println("===================学生信息系统===================");
		boolean flag = true ;
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
			case 1 :
				System.out.print("键入学号:");
				Integer id = in.nextInt() ;
				System.out.print("键入姓名:");
				String name = in.next() ;
				System.out.print("键入年龄:");
				int age = in.nextInt() ;
				if(name != null && id > 0 && id != null && age > 0 && age <100 ){
					if(s.addStudents(id, name, age))
						System.out.println("\t输入成功");
					else
						System.out.println("\t输入失败");
					
				}else
					System.out.println("\t输入失败");
			
				break ;
			case 2:
				
				System.out.println("\t当前存有的学号及对应姓名:");
				System.out.println("\t学号\t姓名");
				Set<Integer> set2 = s.showAll().keySet();
				for(Integer key : set2)
					System.out.println("\t"+s.showAll().get(key).getInfo());
				if(s.showAll().isEmpty()){
					System.out.println();
					System.out.println("\t请先输入学生信息!");
					continue;
				}
				System.out.print("请输入要删除的学号:");
				int i = in.nextInt() ;
				if(s.moveStudent(i))
					System.out.println("删除成功");
				else 
					System.out.println("删除失败");
				
				break ;
			case 3:
				Set<Integer> set = s.showAll().keySet();
				for(Integer key : set)
					System.out.println("\t"+s.showAll().get(key));
				
				break ;
				
			case 4:
				System.out.println("\t当前存有的学号及对应姓名:");
				System.out.println("\t学号\t姓名");
				Set<Integer> set3 = s.showAll().keySet();
				for(Integer key : set3)
					System.out.println("\t"+s.showAll().get(key).getInfo());
				if(s.showAll().isEmpty()){
					System.out.println();
					System.out.println("\t请先输入学生信息!");
					continue;
				}
				System.out.print("选择要查看信息的学号:");
				int c = in.nextInt();
				System.out.println("\t"+s.showOne(c));
				
				break ;
				
				
			case 5:
				System.out.print("选择要修改的学生信息学号：");
				int stu = in.nextInt();
				System.out.print("更改后的姓名:");
				String name1= in.next() ;
				System.out.print("更改后的年龄:");
				int age1 = in.nextInt() ;
				System.out.print("更改后的信息:");
				System.out.println("\t"+s.change(stu, name1, age1));
				
				break ;
			case 6:
				System.out.print("确定退出？Y/N");
				String exit = in.next() ;
				if(exit.equalsIgnoreCase("Y"))
					flag = false ;
				else
					continue;
			}
	
		}
	}
}
