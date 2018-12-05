package com.oracle.team.service;

import java.util.Set;
import java.util.TreeMap;

import com.oracle.team.domain.Architect;
import com.oracle.team.domain.Designer;
import com.oracle.team.domain.Employee;
import com.oracle.team.domain.NoteBook;
import com.oracle.team.domain.PC;
import com.oracle.team.domain.Printer;
import com.oracle.team.domain.Programmer;

public class NameListService {
	//employees: Employee[]
	private TreeMap<Integer , Employee> map = new TreeMap<>();
//	NameListService()
//	+ getAllEmployees(): Employee[]
//	+ getEmployee(id: int) throws TeamException: 

	public NameListService() {
	}
	public void setEmployees(){
		for(int i = 0 ; i < Data.EMPLOYEES.length ; i++){
			if(Data.EMPLOYEES[i][0] == "10"){
				map.put(new Integer(Data.EMPLOYEES[i][1]),new Employee(Integer.parseInt(Data.EMPLOYEES[i][1]), 
						Data.EMPLOYEES[i][2], Integer.parseInt(Data.EMPLOYEES[i][3]), Double.parseDouble(Data.EMPLOYEES[i][4])) );
			}else if(Data.EMPLOYEES[i][0] == "11" ){
				 
				map.put(new Integer(Data.EMPLOYEES[i][1]),
						new Programmer(Integer.parseInt(Data.EMPLOYEES[i][0]) ,Integer.parseInt(Data.EMPLOYEES[i][1]), 
						Data.EMPLOYEES[i][2], 
						Integer.parseInt(Data.EMPLOYEES[i][3]), 
						Double.parseDouble(Data.EMPLOYEES[i][4]),
						"程序员",null) );
			}else if(Data.EMPLOYEES[i][0] == "12"){
				map.put(new Integer(Data.EMPLOYEES[i][1]),
						new Designer(Integer.parseInt(Data.EMPLOYEES[i][0]) , Integer.parseInt(Data.EMPLOYEES[i][1]), 
						Data.EMPLOYEES[i][2], 
						Integer.parseInt(Data.EMPLOYEES[i][3]), 
						Double.parseDouble(Data.EMPLOYEES[i][4]), 
						Double.parseDouble(Data.EMPLOYEES[i][5]),
						"设计师",null));
			}else if(Data.EMPLOYEES[i][0] == "13"){
				map.put(new Integer(Data.EMPLOYEES[i][1]),
						new Architect(Integer.parseInt(Data.EMPLOYEES[i][0]) , Integer.parseInt(Data.EMPLOYEES[i][1]), 
						Data.EMPLOYEES[i][2], 
						Integer.parseInt(Data.EMPLOYEES[i][3]), 
						Double.parseDouble(Data.EMPLOYEES[i][4]),
						Double.parseDouble(Data.EMPLOYEES[i][5]),
						Integer.parseInt(Data.EMPLOYEES[i][6]),
						"架构师",null));
			
			}
		}
		int i = 1 ;
		Set<Integer> set = map.keySet();
		for(Integer key : set){
			if(map.get(key) instanceof Programmer){
				Programmer p = (Programmer)map.get(key);
				if(p instanceof Designer){
					Designer d  = (Designer)p ;
					d.setEquipment(new Printer(Data.EQIPMENTS[i][1] , Data.EQIPMENTS[i][2]));
					i++ ;
				}else if(p instanceof Architect){
					Architect a = (Architect)p ;
					a.setEquipment(new NoteBook(Data.EQIPMENTS[i][1] ,Double.parseDouble(Data.EQIPMENTS[i][2])) );
					i++ ;
				}else{
					p.setEquipment(new PC(Data.EQIPMENTS[i][1] ,Data.EQIPMENTS[i][2]));
					i++ ;
				}
			}
		}
	}
	public TreeMap<Integer, Employee> getAllEmployees(){
		return map ;
	}
	
	public Employee getEmployee(int id ) throws TeamException{
		return map.get(id);
	}
	
}
