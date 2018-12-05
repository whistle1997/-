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
			
			System.out.println("已删除" + s);
		}
//		else
//			System.out.println("无可删除的元素");
	/*	if(map.get(num) == null){
			return true ;
		}else
			return false ;*/
	}

	public void show(int num){
		System.out.println(map.get(num));
	}

}
