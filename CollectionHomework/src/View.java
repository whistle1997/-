import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class View {
	Scanner in = new Scanner(System.in);
	Server s = new Server();
	public void UI(){
		boolean flag = true ;
		System.out.println("===================ѧ����Ϣϵͳ===================");
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
				case 1:
				
					System.out.print("��������:");
					String name = in.next() ;
					System.out.print("����ѧ��:");
					int id = in.nextInt() ;
					System.out.print("�����Ա�:");
					String sex = in.next() ;
					if(s.add(name , id , sex)){
						System.out.println("\t�ɹ�");
					}else{
						System.out.println("\tʧ��");
					}
					
					continue;
			
					
				case 2:
					if(s.map.size() != 0){
						Set set = s.map.keySet();
						System.out.print("\t����ѡ��Ҫɾ����¼��ѧ��:");
						System.out.println(set);
						int num = in.nextInt();
						s.delete(num);
					}else
						System.out.println("\t���ȵǼ�ѧ����Ϣ");
					/*if(s.delete(num))
						System.out.println("ɾ���ɹ�");
					else
						System.out.println("ɾ��ʧ��");*/
				
					continue;
				case 3:
					//System.out.println(s.map.values());
					if(s.map.size() == 0 )
						System.out.println("��δ¼������");
					Set set = s.map.keySet();
					for(Object key : set){
						System.out.println(s.map.get(key));
					}
					continue;
				
				case 4:
					if(s.map.size() != 0){
						Set set1 = s.map.keySet();
						System.out.println(set1);
						System.out.print("ѡ��Ҫ���ĵ�ѧ�ţ�");
						int Num = in.nextInt() ;
						s.show(Num);
					}else
						System.out.println("\t���ȵǼ�ѧ����Ϣ");
					
					continue;
					
				case 5:
					
				case 6:
					System.out.println("ȷ���˳��� Y/N");
					String exit = in.next();
					if(exit.equals("Y"))
						//break;
						flag = false ;
			}
			
		}
	}
}
