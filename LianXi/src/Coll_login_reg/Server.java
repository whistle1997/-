package Coll_login_reg;

import java.util.ArrayList;


public class Server {
	Collections c = new Collections();
	
	//ע��
	public void reg(User u){

		if(c.list.size() == 0){
			c.list.add(u) ;
			System.out.println("ע��ɹ�");
		}else{
			boolean flag = true ;
			for(int j = 0 ; j < c.list.size() ; j++){
				User per = (User)c.list.get(j) ;
				if(u.getId().equals(per.getId())){
					flag = false ;
					break;
				}
			}
			if(flag){
				c.list.add(u);
				System.out.println(c.list);
				System.out.println("ע��ɹ�");
			}else
				System.out.println("ע��ʧ��");;
		}
	}


	//��¼
	public void login(String id , String passkey){
		boolean flag = true ;
		//System.out.println(c.list);
		if(c.list.size() != 0){
			for(int i = 0 ; i < c.list.size() ; i++){
				User u = (User)c.list.get(i);
				if(id.equals(u.getId()) && passkey.equals(u.getPasskey()) ){
					
					System.out.println("��¼�ɹ�");
				}else{
					System.out.println("δע����������");
				}
			}
		}else{
			System.out.println("��δע��");
		}
	}

}