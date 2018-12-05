package day11;
class BanJingException extends RuntimeException{
	public BanJingException(){}
	public BanJingException(String mas){
		super(mas);
	}
}
class Circle{
	private int R ;
	public static final double PI = 3.14 ;
	public Circle(){}
	public int getR() {
		return R;
	}
	public void setR(int r) throws BanJingException{ // ˭����˭�������쳣�׳������ô�
		if(r < 0)
			throw new BanJingException("�뾶����Ϊ����!"); //���RС��0���׳��Զ����쳣
		else
			R = r;
	}
	
}
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle() ;
		try{ // try�鴦����ܳ��ֵ��쳣
			c.setR(-1);
			System.out.println("�뾶Ϊ��"+c.getR());
		}catch(BanJingException e){
			//System.out.println("�뾶����Ϊ����");
			System.out.println(e.getMessage());
		}
		System.out.println("over");
	}

}
