package day06;

import java.util.Scanner;

public class CaiQuan {

	public static void main(String[] args) {
	
		Play w = new Play();
		System.out.println("----------输入您要选择的角色:-----------");
		System.out.println("            1:唐僧");
		System.out.println("            2:孙悟空");
		System.out.println("            3:猪八戒");
		System.out.print("            输入您的选择:");
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
			System.out.print("请输入1——3:");
			j = in.nextInt();
		}
		if(j == 1){
			p.setName("唐僧") ;
		}else if(j == 2){
			p.setName("孙悟空");
		}else{
			p.setName("猪八戒")  ;
		}
		System.out.println("电脑玩家将随机生成一位领导人姓名与您游戏。");
		System.out.println();
		c.getName();
	}
	public void whoWin(){
		while(true){
		
			pc = p.ChuQuan() ;
			cc = c.ChuQuan();
			if(pc == cc){
				System.out.println("          平手");
				System.out.println();
			}else if((pc == 1 && cc!= 3)||(pc ==  2 && cc != 1) || (pc == 3 && cc != 2)){
				System.out.println("          "+p.getName()+"胜");
				System.out.println();
				int x = c.getScore();
				x += 1 ;
				p.setScore(x);
			}else if((cc == 1 && pc!= 3)||(cc ==  2 && pc != 1) || (cc == 3 && pc != 2)){
				System.out.println("          "+c.getName1()+"胜");
				System.out.println();
				int x = c.getScore();
				x += 1 ;
				c.setScore(x);
			}
			System.out.print("任意键继续，按Y退出");
			String s = in.next();
			if(s.equals("Y")){
				System.out.println("            "+p.getName()+"得分:"+p.getScore());
				System.out.println("            "+c.getName1()+"得分:"+c.getScore());
				if(p.getScore() > c.getScore()){
					System.out.println("            "+p.getName()+"胜!");
				}else if(p.getScore() < c.getScore()){
					System.out.println("            "+c.getName1()+"胜!");
				}else{
					System.out.println("            "+"平局");
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
			name = "卡梅伦";
		}else if(j == 2){
			name = "普京";
		}else{
			name = "特朗普";
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
		System.out.print("请输入1,2,3分别代表石头，剪子，布:");
		int n = in.nextInt();
		return n ;
	}
}