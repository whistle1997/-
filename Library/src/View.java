import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	Scanner in = new Scanner(System.in);
	public void UI(){
		System.out.println("**************************************************************************");
		System.out.println("\n\n\n\n");
		System.out.println("\t\t\t\t��ӭʹ��ͼ�����ϵͳ");
		System.out.println("\n\n\n\n");
		System.out.println("**************************************************************************");
		while(true){
			System.out.print("��ѡ�����룺"+ "\t(A)�û���¼" + "\t(B)�û�ע��" + "\t(Q)�˳�ϵͳ");
			String choose = in.next();
			if(choose.equalsIgnoreCase("A")){
				 
			}else if(choose.equalsIgnoreCase("B")){
				inner:while(true){
					System.out.println("ע�����û�");
					System.out.print("\t�����û�����");
					String id = in.next() ;
					String passkey ;
					if(id != null){
						System.out.print("\t�������룺");
						passkey = in.next();
						break inner;
					}else{
						throw new InputMismatchException("��淶����");
					}
					
				}
			}
		}
	}
}
