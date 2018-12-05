package day04;

public class BiJiaoDaXiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big = showBig(10 ,25);
		System.out.println(big);
	}
	public static int showBig(int a , int b){
		/*int big = 0;
		if(a > b){
			big = a ;
		}else if(a<b){
			big = b;
		}
		return big;*/
		if(a > b){
			return a ;
		}else if(a < b){
			return b;
		}else{
			return 0;
		}
	}
}
