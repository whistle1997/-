import java.util.Scanner;

//չʾ����ѡ�ѡ��¼������
public class Viwe {
	Scanner in = new Scanner(System.in);
	int choose;
	AddCustomer add = new AddCustomer();
	
	public void print(){
		
		while(true){
			System.out.println("=============�ͻ�������Ϣϵͳ=============");
			System.out.println("\t\t1�������û�");
			System.out.println("\t\t2��ɾ���û�");
			System.out.println("\t\t3��չʾ�û���Ϣ");
			System.out.println("\t\t4����ʾĳ�û�");
			System.out.println("\t\t5��ֹͣ");
			System.out.print("\tѡ����ϣ���Ĳ���:");
			choose = in.nextInt();
			if(choose == 1){
					PressOne p = new PressOne();
					Customer c = p.One();
					boolean b = add.addC(c);
					if(b)
						System.out.println("\t��ӳɹ�!");
					else
						System.out.println("\t���ʧ��....");
			}
			if(choose == 3){
				System.out.println("\t\tid\t����\t����\t�Ա�\tVIP����");
				for(int i = 0 ; i < add.cus.length ; i++){
					if(add.cus[i] != null)
						System.out.println(add.cus[i].getInf0());
				}
				System.out.println();
			}
			if(choose == 2){
				PressTwo p = new PressTwo();
				p.Two(add.cus);
				/*System.out.print("\t\t��������Ҫɾ���ͻ�������:");
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
					System.out.println("�ɹ�");
				else
					System.out.println("ʧ��");*/
			}
			if(choose == 4){
				System.out.print("\t\t������Ҫ���ҵĿͻ�id:");
				int id = in.nextInt() ;
				try{
					for(int i = 0 ; i < add.cus.length ; i++){
						if(id==add.cus[i].getId()){
							System.out.println("\t\tid\t����\t����\t�Ա�\tVIP����");
							System.out.println(add.cus[i].getInf0());
							break;
						}
					}
				}catch(NullPointerException e){
					System.out.println("\t\t����δ�Ǽǿͻ���Ϣ��");
					System.out.println( );
				}
				/*int i = in.nextInt() - 1;
				System.out.println("\t\t����\t����\t�Ա�");
				System.out.println(add.cus[i].getInf0());*/
			}
			if(choose == 5){
				System.out.print("\t\tȷ���˳��� Y/N:");
				String s = in.next();
				if(s.equals("Y")){
					break;
				}
			}
		}
	}
}
