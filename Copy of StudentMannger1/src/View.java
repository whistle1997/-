import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class View {

	private Scanner in = new Scanner(System.in);
	private Service s = new Service();

	public void Show() throws InputMismatchException { // 交互
		System.out.println("===================学生信息系统===================");
		boolean flag = true;
		out: while (flag) {
			System.out.println("\t\t1、增加学生信息");
			System.out.println("\t\t2、删除学生信息");
			System.out.println("\t\t3、查看所有学生信息");
			System.out.println("\t\t4、查看某学生信息");
			System.out.println("\t\t5、修改学生信息");
			System.out.println("\t\t6、退出系统");
			System.out.print("选择操作：");
			int choose;
			try {
				choose = in.nextInt();
				if(choose > 6 || choose < 1){
					System.out.println("\t请输入1~6进行操作");

					continue out;
				}
			} catch (InputMismatchException e) {
				System.out.println("\t请输入1~6进行操作");
				in.next();
				continue;
			}

			switch (choose) {
			case 1:
				inner1: while (true) {
					Integer id;
					int age;
					try {
						System.out.print("键入学号:");
						id = in.nextInt();
						
					} catch (InputMismatchException e ) {
						System.out.println("\t学号为数字");
						in.next();
						continue inner1;
					}

					System.out.print("键入姓名:");
					String name = in.next();
					try {
						System.out.print("键入年龄:");
						age = in.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("\t年龄为数字");
						in.next();
						continue inner1;
					}

					if (name != null && id > 0 && id != null && age > 0 && age < 100) {
						if (s.addStudents(id, name, age)) {
							System.out.println("\t输入成功");
							break inner1;
						} else
							System.out.println("\t输入失败");

					} else
						System.out.println("\t输入失败");
				}
				break;
			case 2:
				inner2: while (true) {
					System.out.println("\t当前存有的学号及对应姓名:");
					System.out.println("\t学号\t姓名");
					Set<Integer> set2 = s.showAll().keySet();
					for (Integer key : set2)
						System.out.println("\t" + s.showAll().get(key).getInfo());
					if (s.showAll().isEmpty()) {
						System.out.println();
						System.out.println("\t请先输入学生信息!");
						continue out;
					}
					System.out.print("请输入要删除的学号:");
					int i;
					try {
						i = in.nextInt();
						Set<Integer> set = s.showAll().keySet();
						if(!(set.contains(i))){
							System.out.println("请输入已有的学号");
							continue inner2 ;
						}
					} catch (InputMismatchException e) {
						System.out.println("学号为数字");
						in.next();
						continue inner2;
					}
					if (s.moveStudent(i)) {
						System.out.println("删除成功");
						break inner2;
					} else {
						System.out.println("删除失败");
						continue;
					}
				}
				break;
			case 3:
				Set<Integer> set = s.showAll().keySet();
				for (Integer key : set)
					System.out.println("\t" + s.showAll().get(key));

				break;

			case 4:
				inner3: while (true) {
					System.out.println("\t当前存有的学号及对应姓名:");
					System.out.println("\t学号\t姓名");
					Set<Integer> set3 = s.showAll().keySet();
					for (Integer key : set3)
						System.out.println("\t" + s.showAll().get(key).getInfo());
					if (s.showAll().isEmpty()) {
						System.out.println();
						System.out.println("\t请先输入学生信息!");
						continue out;
					}
					int c;
					try {
						System.out.print("选择要查看信息的学号:");
						
						c = in.nextInt();
						Set<Integer> set1 = s.showAll().keySet();
						if(!(set1.contains(c))){
							System.out.println("请输入已有的学号");
							continue inner3 ;
						}
					} catch (InputMismatchException e) {
						System.out.println("学号为数字，从新输入");
						in.next();
						continue inner3;
					}

					System.out.println("\t" + s.showOne(c));
					break;
				}
				break;

			case 5:
				inner4: while (true) {
					int stu;
					try {
						System.out.print("选择要修改的学生信息学号：");
						stu = in.nextInt();
						Set<Integer> set2 = s.showAll().keySet();
						if(!(set2.contains(stu))){
							System.out.println("请输入已有的学号");
							continue inner4 ;
						}
					} catch (InputMismatchException e) {
						System.out.println("\t学号为数字");
						in.next();
						continue inner4;
					}
					
					
					System.out.print("更改后的姓名:");
					String name1 = in.next();
					int age1;
					try {
						System.out.print("更改后的年龄:");
						age1 = in.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("年龄是数字,重新输入");
						continue inner4;
					}

					System.out.print("更改后的信息:");
					System.out.println("\t" + s.change(stu, name1, age1));
					break;
				}
				break;
			case 6:
				System.out.print("确定退出？Y/N");
				String exit = in.next();
				if (exit.equalsIgnoreCase("Y"))
					flag = false;
				else
					continue;
			}

		}
	}
}
