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
	public void setR(int r) throws BanJingException{ // 谁调用谁处理，将异常抛出给调用处
		if(r < 0)
			throw new BanJingException("半径不能为负数!"); //如果R小于0则抛出自定义异常
		else
			R = r;
	}
	
}
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle() ;
		try{ // try块处理可能出现的异常
			c.setR(-1);
			System.out.println("半径为："+c.getR());
		}catch(BanJingException e){
			//System.out.println("半径不能为负数");
			System.out.println(e.getMessage());
		}
		System.out.println("over");
	}

}
