import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class View {
	
	private Scanner in = new Scanner(System.in);
	private Service s = new Service() ;
	
	
	public void Show() throws InputMismatchException{ //����
		System.out.println("===================ѧ����Ϣϵͳ===================");
		boolean flag = true ;
		while(flag){
			System.out.println("\t\t1������ѧ����Ϣ");
			System.out.println("\t\t2��ɾ��ѧ����Ϣ");
			System.out.println("\t\t3���鿴����ѧ����Ϣ");
			System.out.println("\t\t4���鿴ĳѧ����Ϣ");
			System.out.println("\t\t5���޸�ѧ����Ϣ");
			System.out.println("\t\t6���˳�ϵͳ");
			System.out.print("ѡ�������");
			
			int choose = in.nextInt();
		
			switch(choose){
			case 1 :
				System.out.print("����ѧ��:");
				Integer id = in.nextInt() ;
				System.out.print("��������:");
				String name = in.next() ;
				System.out.print("��������:");
				int age = in.nextInt() ;
				if(name != null && id > 0 && id != null && age > 0 && age <100 ){
					if(s.addStudents(id, name, age))
						System.out.println("\t����ɹ�");
					else
						System.out.println("\t����ʧ��");
					
				}else
					System.out.println("\t����ʧ��");
			
				break ;
			case 2:
				
				System.out.println("\t��ǰ���е�ѧ�ż���Ӧ����:");
				System.out.println("\tѧ��\t����");
				Set<Integer> set2 = s.showAll().keySet();
				for(Integer key : set2)
					System.out.println("\t"+s.showAll().get(key).getInfo());
				if(s.showAll().isEmpty()){
					System.out.println();
					System.out.println("\t��������ѧ����Ϣ!");
					continue;
				}
				System.out.print("������Ҫɾ����ѧ��:");
				int i = in.nextInt() ;
				if(s.moveStudent(i))
					System.out.println("ɾ���ɹ�");
				else 
					System.out.println("ɾ��ʧ��");
				
				break ;
			case 3:
				Set<Integer> set = s.showAll().keySet();
				for(Integer key : set)
					System.out.println("\t"+s.showAll().get(key));
				
				break ;
				
			case 4:
				System.out.println("\t��ǰ���е�ѧ�ż���Ӧ����:");
				System.out.println("\tѧ��\t����");
				Set<Integer> set3 = s.showAll().keySet();
				for(Integer key : set3)
					System.out.println("\t"+s.showAll().get(key).getInfo());
				if(s.showAll().isEmpty()){
					System.out.println();
					System.out.println("\t��������ѧ����Ϣ!");
					continue;
				}
				System.out.print("ѡ��Ҫ�鿴��Ϣ��ѧ��:");
				int c = in.nextInt();
				System.out.println("\t"+s.showOne(c));
				
				break ;
				
				
			case 5:
				System.out.print("ѡ��Ҫ�޸ĵ�ѧ����Ϣѧ�ţ�");
				int stu = in.nextInt();
				System.out.print("���ĺ������:");
				String name1= in.next() ;
				System.out.print("���ĺ������:");
				int age1 = in.nextInt() ;
				System.out.print("���ĺ����Ϣ:");
				System.out.println("\t"+s.change(stu, name1, age1));
				
				break ;
			case 6:
				System.out.print("ȷ���˳���Y/N");
				String exit = in.next() ;
				if(exit.equalsIgnoreCase("Y"))
					flag = false ;
				else
					continue;
			}
	
		}
	}
}
