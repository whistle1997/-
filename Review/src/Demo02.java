
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single.get() ;                       
	}
}


class Single{
	private Single(){}
	private static Single s = new Single() ;
	public static Single get(){
		return s ;
	}
}