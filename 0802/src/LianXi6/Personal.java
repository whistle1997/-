package LianXi6;
/*get������set���� 
����һ���࣬������һ��˽�г�Ա������ͨ�����췽��������и���ֵ�����ṩ�ó�Ա��getXXX()��setXXX()���� 
��ʾ��������private String name;���� 
public void setName(String name){  
this.name = name;
 }  
public String getName(){
  return this.name; 
} */

public class Personal {
	private String name;
	public Personal(String name){
		this.name = name ;
	}
	public void setName(String name){  
		this.name = name;
	}  
	public String getName(){
		return this.name; 
	}
}
