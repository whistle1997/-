import java.util.HashMap;

public class Service {
	
	private HashMap<Integer , Student> map = new HashMap<>();
	
	public boolean addStudents(Integer id , String name , int age){
		int m = map.size() ;
		if(m == 0){
			map.put(id, new Student(id , name , age));
			return true;
		}
		else if(!(map.containsKey(id))){
			map.put(id, new Student(id , name , age));
			if(map.size() > m)
				return true ;
			else 
				return false ;
		}else
			return false;
		
	}


	public boolean moveStudent(int i){
		int m = map.size() ;
		map.remove(i);
		if(map.size() < m)
			return true ;
		else
			return false ;
	}

	
	public String showOne(int c){
		return map.get(c).toString();
	}
	
	public HashMap<Integer , Student> showAll(){
		return map ;
	}
	
	public String changeName(int stu , String name){
		map.get(stu).setName(name);
		return map.get(stu).toString();
	}
	
	public String changeAge(int stu , int age){
		map.get(stu).setAge(age);
		return map.get(stu).toString();
	}
}
