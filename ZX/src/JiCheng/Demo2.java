package JiCheng;
/*球员和球队  部分和整体的关系
 * 学生和人的关系
 * 学生属于人类
 * 在java中称为继承的关系      
 * */
//球员类
class Player{
	String name ;
	int num ;
	public Player(int num , String name){
		this.num = num ;
		this.name = name ;
	}
	public void run(){
		System.out.println(name+"开跑");
	}
}
//球队类
class Team{
	String name ;
	Player p1;
	Player p2 ;
	Player P3;
	public Team(String name , Player p1 ,Player p2 ,Player p3){
		this.name = name ;
		this.p1 = p1 ;
		this.p2 = p2 ;
		this.P3 = p3 ;
	}
	public void startGame(){
		System.out.println(name+"开赛了！");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Player p1 = new Player(12,"梅西");
		Player p2 = new Player(7,"C罗");
		Player p3 = new Player(11,"内马尔");
		
		//组建一个球队
		Team t = new Team("恒大",p1,p2,p3);
		t.startGame();
		
		//访问2号球员名字
		System.out.println("名字"+t.p2);//此时输出为地址
		System.out.println("名字"+t.p2.name);
	}
}
