package CollectionHomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Server {
	Collection c = new ArrayList();
	Iterator it = c.iterator();
	public void reg(String id , String passkey){
		User use = new User(id , passkey) ;
		if(!it.hasNext()){
			c.add(use);
		}else{
			
			while(it.hasNext()){
				User u = (User) it.next() ;
				if(u.getId() == id){
					System.out.println("这个用户名已被注册!");
					break ;
				}else{
					c.add(use) ;
				}
			}
			
		}
	}
}
