import java.util.HashMap;

public class Server {
	HashMap<Integer, Students> map = new HashMap<>(); 
	public boolean add(String name , int id , String sex){
		int m = map.size() ;
		map.put(id , new Students(name , id , sex)) ;
		if(map.size() > m)
			return true ;
		else
			return false ;
	}

	public void delete(int num){
		Object s = map.get(num);
		if(map.remove(num) != null){
			
			System.out.println("��ɾ��" + s);
		}
//		else
//			System.out.println("�޿�ɾ����Ԫ��");
	/*	if(map.get(num) == null){
			return true ;
		}else
			return false ;*/
	}

	public void show(int num){
		System.out.println(map.get(num));
	}

}
