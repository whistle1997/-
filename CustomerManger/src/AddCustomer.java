

public class AddCustomer {
	Customer[] cus = new Customer[10];
	static int num = 0 ;
	public boolean addC(Customer c){
		if(c != null && num < cus.length){
			cus[num] = c ;
			num++;
			return true;
		}else
			return false;
	}
}
