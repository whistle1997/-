package com.oracle.team.service;

import java.util.Set;
import java.util.TreeMap;

import com.oracle.team.domain.Architect;
import com.oracle.team.domain.Designer;
import com.oracle.team.domain.Employee;
import com.oracle.team.domain.Programmer;
import com.oracle.team.view.TSUtility;

public class TeamService {
//	counter: int = 1
//	MAX_MEMBER: final int = 6
//	team: Programmer[] = new Programmer[MAX_MEMBER]; - total: int = 0;
	
	public static int counter = 1 ;
	public static final int MAX_MEMBER = 6 ;
	private Programmer[] team = new Programmer[MAX_MEMBER] ;
	private int total = 0 ;
	private int pr = 1 ;
	private int de = 1 ;
	private int ar = 1 ;
	private int tID = 1 ;
	private TreeMap<Integer , Employee> map = new TreeMap<>();
//	+ getTeam(): Programmer[]
//	+ addMember(e: Employee) throws TeamException: void
//	+ removeMember(memberId: int) throws TeamException: void
	
	public TreeMap<Integer , Employee> getTeam(){
		return map ;
	}
	
	/*public boolean addMember(Employee e) throws TeamException{
		if(total < MAX_MEMBER){
		
			if(e instanceof Programmer){
				Programmer p = (Programmer)e ;
				
				if(p instanceof Designer){
					Designer d = (Designer)p ;
					if(d instanceof Architect){
						Architect a = (Architect)d ;
						if(ar <= 1){
							a.setStatus(Status.BUSY);
							map.put(a.getId(), a) ;
							ar++ ;
							a.setMemberId(tID);
							tID++ ; 
							return true ;
						}else{
							System.out.print("架构师满员，");
							return false ;
						}
					}else if(de <= 2){
						d.setStatus(Status.BUSY);
						map.put(d.getId(), d) ;
						de++;
						d.setMemberId(tID);
						tID++ ;
						return true ;
					}else{
						System.out.print("设计师满员，");
						return false ;
					}
				}else{
					if(pr <= 3){
						p.setStatus(Status.BUSY);
						map.put(p.getId(), p) ;
						pr++;
						p.setMemberId(tID);
						tID++ ;
						return true ;
					}else{
						System.out.print("程序员满员，");
						return false ;
					}
				}
			
			}else{
				System.out.print("非工作人员,无法");
				return false ;
			}
		}else{
			System.out.print("成员已满");
			return false ;
		}
		
	}*/
	public boolean addMember(Employee e) throws TeamException{
		if(total < MAX_MEMBER){
		
			if(e instanceof Programmer){
				Programmer p = (Programmer)e ;
				
				if(p instanceof Designer){
					Designer d = (Designer)p ;
					if(d instanceof Architect){
						Architect a = (Architect)d ;
						if(ar <= 1){
							a.setStatus(Status.BUSY);
							map.put(a.getId(), a) ;
							ar++ ;
							a.setMemberId(tID);
							tID++ ; 
							return true ;
						}else{
							System.out.print("架构师满员，");
							return false ;
						}
					}else if(de <= 2){
						d.setStatus(Status.BUSY);
						map.put(d.getId(), d) ;
						de++;
						d.setMemberId(tID);
						tID++ ;
						return true ;
					}else{
						System.out.print("设计师满员，");
						return false ;
					}
				}else{
					if(pr <= 3){
						p.setStatus(Status.BUSY);
						map.put(p.getId(), p) ;
						pr++;
						p.setMemberId(tID);
						tID++ ;
						return true ;
					}else{
						System.out.print("程序员满员，");
						return false ;
					}
				}
			
			}else{
				System.out.print("非工作人员,无法");
				return false ;
			}
		}else{
			System.out.print("成员已满");
			return false ;
		}
		
	}
	
	public boolean removeMember(int memberId) throws TeamException{
		//Employee e = map.get(memberId);
		Employee e = null;
		int ID = 0 ;
		Set<Integer> set = map.keySet();
		for( Integer id : set){
			if(map.get(id) instanceof Programmer){
				Programmer p = (Programmer)map.get(id);
				if(p.getMemberId() == memberId){
					e = map.get(id);
					ID = id ;
				}
			}
		}
		if(map.containsKey(ID)){
			if(e instanceof Programmer){
				Programmer p = (Programmer)e ;
				if(p instanceof Designer){
					Designer d = (Designer)p;
					if(d instanceof Architect){
						Architect a = (Architect)d ;
						System.out.println("确定删除? Y/N");
						if(String.valueOf(TSUtility.readConfirmSelection()).equalsIgnoreCase("Y")){
						map.remove(ID) ;
						ar-- ;
						return true ;
						}else{
							throw new TeamException();
						}
					}else{
						System.out.println("确定删除? Y/N");
						if(String.valueOf(TSUtility.readConfirmSelection()).equalsIgnoreCase("Y")){
						map.remove(ID);
						de-- ;
						return true ;
						}else{
							throw new TeamException();
						}
					}
				}else{
					System.out.println("确定删除? Y/N");
					if(String.valueOf(TSUtility.readConfirmSelection()).equalsIgnoreCase("Y")){
					map.remove(ID) ;
					pr--;
					return true ;
					}else{
						throw new TeamException();
					}
				}
			}else{
				return false ;
			}
		}else{
			System.out.println("查无此人,");
			return false ;
		}
	
	
	}
}
