package LianXi6;
/*get方法和set方法 
定义一个类，该类有一个私有成员变量，通过构造方法将其进行赋初值，并提供该成员的getXXX()和setXXX()方法 
提示：假设有private String name;则有 
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
