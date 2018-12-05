import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class View {

	private Scanner in = new Scanner(System.in);
	private Service s = new Service();

	public void Show() throws InputMismatchException { // ����
		System.out.println("===================ѧ����Ϣϵͳ===================");
		boolean flag = true;
		out: while (flag) {
			System.out.println("\t\t1������ѧ����Ϣ");
			System.out.println("\t\t2��ɾ��ѧ����Ϣ");
			System.out.println("\t\t3���鿴����ѧ����Ϣ");
			System.out.println("\t\t4���鿴ĳѧ����Ϣ");
			System.out.println("\t\t5���޸�ѧ����Ϣ");
			System.out.println("\t\t6���˳�ϵͳ");
			System.out.print("ѡ�������");
			int choose;
			try {
				choose = in.nextInt();
				if(choose > 6 || choose < 1){
					System.out.println("\t������1~6���в���");

					continue out;
				}
			} catch (InputMismatchException e) {
				System.out.println("\t������1~6���в���");
				in.next();
				continue;
			}

			switch (choose) {
			case 1:
				inner1: while (true) {
					Integer id;
					int age;
					try {
						System.out.print("����ѧ��:");
						id = in.nextInt();
						
					} catch (InputMismatchException e ) {
						System.out.println("\tѧ��Ϊ����");
						in.next();
						continue inner1;
					}

					System.out.print("��������:");
					String name = in.next();
					try {
						System.out.print("��������:");
						age = in.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("\t����Ϊ����");
						in.next();
						continue inner1;
					}

					if (name != null && id > 0 && id != null && age > 0 && age < 100) {
						if (s.addStudents(id, name, age)) {
							System.out.println("\t����ɹ�");
							break inner1;
						} else
							System.out.println("\t����ʧ��");

					} else
						System.out.println("\t����ʧ��");
				}
				break;
			case 2:
				inner2: while (true) {
					System.out.println("\t��ǰ���е�ѧ�ż���Ӧ����:");
					System.out.println("\tѧ��\t����");
					Set<Integer> set2 = s.showAll().keySet();
					for (Integer key : set2)
						System.out.println("\t" + s.showAll().get(key).getInfo());
					if (s.showAll().isEmpty()) {
						System.out.println();
						System.out.println("\t��������ѧ����Ϣ!");
						continue out;
					}
					System.out.print("������Ҫɾ����ѧ��:");
					int i;
					try {
						i = in.nextInt();
						Set<Integer> set = s.showAll().keySet();
						if(!(set.contains(i))){
							System.out.println("���������е�ѧ��");
							continue inner2 ;
						}
					} catch (InputMismatchException e) {
						System.out.println("ѧ��Ϊ����");
						in.next();
						continue inner2;
					}
					if (s.moveStudent(i)) {
						System.out.println("ɾ���ɹ�");
						break inner2;
					} else {
						System.out.println("ɾ��ʧ��");
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
					System.out.println("\t��ǰ���е�ѧ�ż���Ӧ����:");
					System.out.println("\tѧ��\t����");
					Set<Integer> set3 = s.showAll().keySet();
					for (Integer key : set3)
						System.out.println("\t" + s.showAll().get(key).getInfo());
					if (s.showAll().isEmpty()) {
						System.out.println();
						System.out.println("\t��������ѧ����Ϣ!");
						continue out;
					}
					int c;
					try {
						System.out.print("ѡ��Ҫ�鿴��Ϣ��ѧ��:");
						
						c = in.nextInt();
						Set<Integer> set1 = s.showAll().keySet();
						if(!(set1.contains(c))){
							System.out.println("���������е�ѧ��");
							continue inner3 ;
						}
					} catch (InputMismatchException e) {
						System.out.println("ѧ��Ϊ���֣���������");
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
						System.out.print("ѡ��Ҫ�޸ĵ�ѧ����Ϣѧ�ţ�");
						stu = in.nextInt();
						Set<Integer> set2 = s.showAll().keySet();
						if(!(set2.contains(stu))){
							System.out.println("���������е�ѧ��");
							continue inner4 ;
						}
					} catch (InputMismatchException e) {
						System.out.println("\tѧ��Ϊ����");
						in.next();
						continue inner4;
					}
					
					
					System.out.print("���ĺ������:");
					String name1 = in.next();
					int age1;
					try {
						System.out.print("���ĺ������:");
						age1 = in.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("����������,��������");
						continue inner4;
					}

					System.out.print("���ĺ����Ϣ:");
					System.out.println("\t" + s.change(stu, name1, age1));
					break;
				}
				break;
			case 6:
				System.out.print("ȷ���˳���Y/N");
				String exit = in.next();
				if (exit.equalsIgnoreCase("Y"))
					flag = false;
				else
					continue;
			}

		}
	}
}
