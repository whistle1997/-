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
		 System.out.println("ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\t�����豸");
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
			
			System.out.print("1-�Ŷ��б� 2-����Ŷӳ�Ա 3-ɾ���Ŷӳ�Ա 4-�˳� ��ѡ��(1-4)�� ");
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
			System.out.println("��δ��ӳ�Ա");
		}else{
			Set<Integer> set = map.keySet();
			System.out.println("TeamID\tID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\t�����豸");
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
		System.out.println("---------------------��ӳ�Ա---------------------");
		System.out.print("������Ҫ��ӵ�Ա��ID��");
		int id = TSUtility.readInt() ;
		try {
			if(teamSvc.getTeam().size() == 0){
				teamSvc.addMember(listSvc.getAllEmployees().get(id));
				System.out.println("��ӳɹ�");
			}else if(!(teamSvc.getTeam().containsKey(id))){
				if(teamSvc.addMember(listSvc.getAllEmployees().get(id))){
					Programmer p = (Programmer)listSvc.getAllEmployees().get(id);
					p.setStatus(Status.BUSY);
					System.out.println("��ӳɹ�");
				}else{
					System.out.println("���ʧ��");
				}
			}else{
				System.out.println("���ʧ�ܣ�ԭ�򣺸�Ա�������Ŷӳ�Ա");
			}
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteMember(){
		System.out.println("---------------------ɾ����Ա---------------------");
		System.out.println("������Ҫɾ��Ա����TID��");
		int id = TSUtility.readInt();
		if(teamSvc.getTeam().size() == 0){
			System.out.println("���������Ա��ɾ��");
		}else{
			try {
				if(teamSvc.removeMember(id)){
					System.out.println("��Ա��ɾ��");
				}else{
					System.out.println("ɾ��ʧ��");
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
