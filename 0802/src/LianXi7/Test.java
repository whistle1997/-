package LianXi7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WuMingFen f1 = new WuMingFen("ţ��",3,true); 
		WuMingFen f2 = new WuMingFen("ţ��",2); 
		WuMingFen f3 = new WuMingFen(); 
		f3.setLikeSoup(true);
		f3.setQuantity(2);
		f3.setTheMa("����");
		f1.check();
		f2.check();
		f3.check();
	}

}
