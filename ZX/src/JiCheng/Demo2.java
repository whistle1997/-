package JiCheng;
/*��Ա�����  ���ֺ�����Ĺ�ϵ
 * ѧ�����˵Ĺ�ϵ
 * ѧ����������
 * ��java�г�Ϊ�̳еĹ�ϵ      
 * */
//��Ա��
class Player{
	String name ;
	int num ;
	public Player(int num , String name){
		this.num = num ;
		this.name = name ;
	}
	public void run(){
		System.out.println(name+"����");
	}
}
//�����
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
		System.out.println(name+"�����ˣ�");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Player p1 = new Player(12,"÷��");
		Player p2 = new Player(7,"C��");
		Player p3 = new Player(11,"�����");
		
		//�齨һ�����
		Team t = new Team("���",p1,p2,p3);
		t.startGame();
		
		//����2����Ա����
		System.out.println("����"+t.p2);//��ʱ���Ϊ��ַ
		System.out.println("����"+t.p2.name);
	}
}
