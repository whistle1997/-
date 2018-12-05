package LianXi;
//7、设计Point类用来定义平面上的一个点，用构造函数传递坐标位置。编写测试类，在该类中实现Point类的对象。
public class Point {
	private int heng ;
	private int zong ;
	public Point(int heng , int zong){
		this.heng = heng ;
		this.zong = zong ;
	}
	
	public int getHeng() {
		return heng;
	}

	public void setHeng(int heng) {
		this.heng = heng;
	}

	public int getZong() {
		return zong;
	}

	public void setZong(int zong) {
		this.zong = zong;
	}

	public void print(){
		for(int i = 0 ; i < 5; i++){
			for(int j = 0 ; j < 5 ; j++){
				if(i == heng && j == zong)
					System.out.print("*\t");
				else
					System.out.print("~\t");
			}
			System.out.println();
		}
	}
}
