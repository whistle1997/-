package day06;

import java.util.Scanner;

public class CaiQuan {

	public static void main(String[] args) {
	
		Play w = new Play();
		System.out.println("----------������Ҫѡ��Ľ�ɫ:-----------");
		System.out.println("            1:��ɮ");
		System.out.println("            2:�����");
		System.out.println("            3:��˽�");
		System.out.print("            ��������ѡ��:");
		w.setName();
		w.whoWin();
		
	}

}
class Play{
	int pc ;
	int cc ;
	Person p = new Person();
	Compture c = new Compture();
	
	Scanner in =new Scanner(System.in);
	public void setName(){
		int j = in.nextInt();
		if(j> 3 || j < 1){
			System.out.print("������1����3:");
			j = in.nextInt();
		}
		if(j == 1){
			p.setName("��ɮ") ;
		}else if(j == 2){
			p.setName("�����");
		}else{
			p.setName("��˽�")  ;
		}
		System.out.println("������ҽ��������һλ�쵼������������Ϸ��");
		System.out.println();
		c.getName();
	}
	public void whoWin(){
		while(true){
		
			pc = p.ChuQuan() ;
			cc = c.ChuQuan();
			if(pc == cc){
				System.out.println("          ƽ��");
				System.out.println();
			}else if((pc == 1 && cc!= 3)||(pc ==  2 && cc != 1) || (pc == 3 && cc != 2)){
				System.out.println("          "+p.getName()+"ʤ");
				System.out.println();
				int x = c.getScore();
				x += 1 ;
				p.setScore(x);
			}else if((cc == 1 && pc!= 3)||(cc ==  2 && pc != 1) || (cc == 3 && pc != 2)){
				System.out.println("          "+c.getName1()+"ʤ");
				System.out.println();
				int x = c.getScore();
				x += 1 ;
				c.setScore(x);
			}
			System.out.print("�������������Y�˳�");
			String s = in.next();
			if(s.equals("Y")){
				System.out.println("            "+p.getName()+"�÷�:"+p.getScore());
				System.out.println("            "+c.getName1()+"�÷�:"+c.getScore());
				if(p.getScore() > c.getScore()){
					System.out.println("            "+p.getName()+"ʤ!");
				}else if(p.getScore() < c.getScore()){
					System.out.println("            "+c.getName1()+"ʤ!");
				}else{
					System.out.println("            "+"ƽ��");
				}
				break;
			}else{
				continue;
			}
		}
	}
}
class Compture{
	private int score ;
	private String name ;
	public void setScore(int s){
		score = s ;
	}
	public int getScore(){
		return score;
	}
	public String getName1(){
		return name ;
	}
	
	public void getName(){
		int j = (int)(Math.random()*3 + 1);
		if(j == 1){
			name = "��÷��";
		}else if(j == 2){
			name = "�վ�";
		}else{
			name = "������";
		}
	}
	public int ChuQuan(){
		int m = (int)(Math.random()*3 + 1);
		
		return m ;
		
	}
}
class Person{
	private int score ;
	private String name ;
	public void setScore(int s){
		score = s ;
	}
	public int getScore(){
		return score;
	}
	public void setName(String n){
		name = n ;
	}
	public String getName(){
		return name ;
	}
	public int ChuQuan(){
		Scanner in =new Scanner(System.in);
		System.out.print("������1,2,3�ֱ����ʯͷ�����ӣ���:");
		int n = in.nextInt();
		return n ;
	}
}