package LianXi;
//7�����Point����������ƽ���ϵ�һ���㣬�ù��캯����������λ�á���д�����࣬�ڸ�����ʵ��Point��Ķ���
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
