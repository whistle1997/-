package day13;

import java.util.InputMismatchException;

class Phone implements Comparable{
	private int price ;
	private String name ;
	public Phone(String name , int price){
		this.name = name ;
		this.price = price ;
	}
	
	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Phone){
			Phone p = (Phone)o;
			int b = this.name.compareTo(p.name);
			if(b == 0){
				int p1 = this.price - p.price ;
				return p1;
			}else
				return b ;
			
		}else
			throw new InputMismatchException();
	}
}
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone("Huawei",4999);
		Phone p2 = new Phone("Xiaomi",2999);
		int num = p1.compareTo(p2);
		if(num > 0){
			System.out.println(p1.getName()+"的品牌效益或价格大于"+p2.getName());
		}else{
			System.out.println(p1.getName()+"的品牌效益或价格小于"+p2.getName());
		}
	}

}
