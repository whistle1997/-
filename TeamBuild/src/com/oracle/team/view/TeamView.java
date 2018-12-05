package com.oracle.team.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import com.oracle.team.domain.Employee;
import com.oracle.team.domain.Programmer;
import com.oracle.team.service.NameListService;
import com.oracle.team.service.Status;
import com.oracle.team.service.TeamException;
import com.oracle.team.service.TeamService;

public class TeamView {
//	- listSvc: NameListService = new NameListService()
//	- teamSvc: TeamService = new TeamService()
	 NameListService listSvc = new NameListService();
	 TeamService teamSvc = new TeamService();
	
//	+ enterMainMenu(): void
//	- listAllEmployees(): void
//	- addMember(): void
//	- deleteMember(): void
//	+ main(args: String[]) : void
			 
	public void listAllEmployees(){
		 listSvc.setEmployees();
		 TreeMap<Integer, Employee> map = listSvc.getAllEmployees();
		 System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		 Set<Integer> set = map.keySet();
			for(Integer key : set){
				
					System.out.println(map.get(key));
				
					
			}
			
	 }
	public void enterMainMenu(){
		while(true){
			listAllEmployees();
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------------------------------------");
			
			System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4)： ");
			int choose = TSUtility.readMenuSelection() ;
			//System.out.println(choose);
			
			switch(choose){
			case 49:
				showTeam();
				break ;
			case 50:
				addMember();
				break ;
			case 51:
				deleteMember();
				break;
			case 52:
				if(TSUtility.readConfirmSelection() == 'Y'){
					break;
				}else{
					continue;
				}
			}
			
			TSUtility.readReturn();
		}
		
		
	 }
	public void showTeam(){
		TreeMap<Integer , Employee> map = teamSvc.getTeam();
		if(map.size() == 0){
			System.out.println("还未添加成员");
		}else{
			Set<Integer> set = map.keySet();
			System.out.println("TeamID\tID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for(Integer key : set){
				if(map.get(key) instanceof Programmer){
					Programmer p = (Programmer)map.get(key);
					System.out.println(p.getMemberId()+"\t"+map.get(key));
				}else
					System.out.println(map.get(key));
					
			}
		}
	}
	public void addMember(){
		System.out.println("---------------------添加成员---------------------");
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt() ;
		try {
			if(teamSvc.getTeam().size() == 0){
				teamSvc.addMember(listSvc.getAllEmployees().get(id));
				System.out.println("添加成功");
			}else if(!(teamSvc.getTeam().containsKey(id))){
				if(teamSvc.addMember(listSvc.getAllEmployees().get(id))){
					Programmer p = (Programmer)listSvc.getAllEmployees().get(id);
					p.setStatus(Status.BUSY);
					System.out.println("添加成功");
				}else{
					System.out.println("添加失败");
				}
			}else{
				System.out.println("添加失败，原因：该员工已是团队成员");
			}
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteMember(){
		System.out.println("---------------------删除成员---------------------");
		System.out.println("请输入要删除员工的TID：");
		int id = TSUtility.readInt();
		if(teamSvc.getTeam().size() == 0){
			System.out.println("请您输入成员后删除");
		}else{
			try {
				if(teamSvc.removeMember(id)){
					System.out.println("成员已删除");
				}else{
					System.out.println("删除失败");
				}
			} catch (TeamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TeamView tv = new TeamView();
		tv.enterMainMenu();
	}

}
