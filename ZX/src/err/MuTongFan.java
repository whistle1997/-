package err;
class MoneyException extends Exception{
	public MoneyException(String mes){
		super(mes);
	}
}
class Money{
	private int Money ;
	public Money(int money) throws MoneyException{
		if(money < 10){
			throw new MoneyException("»Ø¼ÒÄÃÇ®"); 
		}
	}
}
public class MuTongFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			new Money(5);
		}catch(MoneyException e){
			e.printStackTrace();
			System.out.println("Äã²îÇ®°¡");
		}
	}

}
