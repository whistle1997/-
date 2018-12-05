
public class norepeat {
	public static void main(String[] args){
		int sum = 0;
		int  m = 0 ;
		for(int i = 1 ; i <=4 ; i++){
			for(int j = 1 ; j <= 4 ; j++){
				for(int k = 1 ; k <=4 ; k++){
					if(i != j && j != k){
						sum = i*100 + j*10 +k;
						System.out.println("这个数字为："+sum);
						m++;
					}
				}
			}
		}
		System.out.println("这样的数字共"+m+"个");
	}
}
