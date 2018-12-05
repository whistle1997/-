package Week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import org.junit.Test;


public class Demo01 {
		
	@Test
	public void test1(){
		//利用随机数生成50~90[50,90)之间的随机数20个,将之转换成字符输出。
		//利用StringBuffer将上述生成的字符构建成字符串
		//将生成
		//按空格将字符串切割成子串字符串中不是英文字母的字符替换为空格
		//去除行首行尾空格
		//将子串按升序排序后构建成一个字符串
		//将字符串逆序输出
		StringBuffer sb = new StringBuffer(20);
		Random r = new Random();
		//int n = sb.length() ;
		for(int i = 0 ; i < 20; i++){
			sb.append((char)(r.nextInt(40)+50) + " ");
		}
		String s = new String(sb);
		System.out.println(s);
		String reg = "[^A-Z]";
		s = s.replaceAll(reg, " ");
		System.out.println(s);
		s = s.trim();
		String[] s1 = s.split(" +");
		Arrays.sort(s1);
		String s2 = Arrays.toString(s1);
		System.out.println(s2);
		StringBuffer sb2 = new StringBuffer(s2);
		sb2.reverse();
		String s3 = new String(sb2);
		System.out.println(s3);
	}

	
	@Test
	public void test2(){
//				(1.得到日历类对象
//				(2.将时间按照xxxx-xx-xx xx:xx:xx显示
//				(3.创建一个新的日历对象，控制台输入年月日时分秒信息
//				(4.比较新的日历对象和原日历对象的先后关系（前、后、等）
//				(5.得到两个日历对象之间的毫秒差(差值)
//				(6.再创建日历对象,通过setTimeInMillis(0) 从给定的长值设置此日历的当前时间。 
//				用格式化输出,观察输出时间.1970年1月1日00:00 00：00.000 
//				拓展：
//				1.求出两个日历对象之间的时间间隔（相差的年月日时分秒）
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DAY_OF_MONTH)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		Calendar c1 = Calendar.getInstance();
		Scanner in = new Scanner(System.in);
		try{
			System.out.println("输入年月日时分秒");
			int year = in.nextInt();
			int month = in.nextInt();
			int date = in.nextInt();
			int hourOfDay = in.nextInt();
			int minute = in.nextInt();
			int second = in.nextInt();
			c1.set(year, month, date, hourOfDay, minute, second);

		}catch(InputMismatchException e){
			System.out.println("输入正确的数据");
		}
		System.out.println(c1.get(Calendar.YEAR)+"-"+(c1.get(Calendar.MONTH)+1)+"-"+c1.get(Calendar.DAY_OF_MONTH)+" "+c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
		long seconds = 0 ;
		int day = 0 ;
		for(int year = 1970 ; year < c.get(Calendar.YEAR) ; year++){
			if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
				day += 366;
			}else{
				day += 365 ;
			}
		}
		int monthday = 0 ;
		for(int j = 0 ; j < c.get(Calendar.MONTH) ; j++){
			if(j <=7 && j != 2){
				if(j % 2 != 0){
					monthday = 31 ;
				}else{
					monthday = 30 ;
				}
			}else if(j >= 8){
				if(j % 2 == 0){
					monthday = 31 ;
				}else{
					monthday = 30 ;
				}
			}
			if(j == 2){
				if((c.get(Calendar.YEAR) % 4 == 0 && c.get(Calendar.YEAR) % 100 !=0 )||( c.get(Calendar.YEAR) % 400 == 0)){
					monthday = 29;
				}else{
					monthday = 28;
				}
			}
			if(j < c.get(Calendar.MONTH)){
				day += monthday ;
			}
		}
		seconds = day * 24 * 60 *60 * 1000 + c.get(Calendar.HOUR)*60*60*1000 + c.get(Calendar.MINUTE) * 60 * 1000 + c.get(Calendar.SECOND) * 1000;
		long seconds2 = 0 ;
		int day2 = 0 ;
		for(int year = 1970 ; year < c1.get(Calendar.YEAR) ; year++){
			if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
				day2 += 366;
			}else{
				day2 += 365 ;
			}
		}
		int monthday2 = 0 ;
		for(int j = 0 ; j < c1.get(Calendar.MONTH) ; j++){
			if(j <=7 && j != 2){
				if(j % 2 != 0){
					monthday2 = 31 ;
				}else{
					monthday2 = 30 ;
				}
			}else if(j >= 8){
				if(j % 2 == 0){
					monthday2 = 31 ;
				}else{
					monthday2 = 30 ;
				}
			}
			if(j == 2){
				if((c1.get(Calendar.YEAR) % 4 == 0 && c1.get(Calendar.YEAR) % 100 !=0 )||( c1.get(Calendar.YEAR) % 400 == 0)){
					monthday2 = 29;
				}else{
					monthday2 = 28;
				}
			}
			if(j < c1.get(Calendar.MONTH)){
				day2 += monthday2 ;
			}
		}
		seconds2 = day2 * 24 * 60 *60 * 1000 + c1.get(Calendar.HOUR)*60*60*1000 + c1.get(Calendar.MINUTE) * 60 * 1000 + c1.get(Calendar.SECOND) * 1000;
		if(seconds2 > seconds){
			System.out.println("新日历晚于老日历");
		}else if(seconds2 < seconds){
			System.out.println("新日历早于老日历");
		}else{
			System.out.println("同时");
		}
		long s = seconds - seconds2 ;
		System.out.println("毫秒时间差：" + s);
	}


	@Test
	public void test3(){
		ArrayList l = new ArrayList();
		l.add(new Person("张三"));
		l.add(new Person("张三"));
		l.add(new Person("李四"));
		l.add(new Person("王五"));
		l.add(new Person("赵六"));
		l.add(new Person("王五"));
		l.add(new Person("赵六"));
		//System.out.println(l);
		ArrayList list = new ArrayList();
		list.add(l.get(0));
		for(int i = 1 ; i < l.size() ; i++){
			Person p = (Person)l.get(i);
			boolean flag = true ;
			for(int j = 0 ; j < list.size() ; j++){
				Person per = (Person)list.get(j) ;
				if(p.equals(per)){
					flag = false ;
					break;
				}
			}
			if(flag)
				list.add(p);
				
		}
		System.out.println(l);
		System.out.println(list);
	}
}
class Person{
	private String name ;
	public Person(String name){
		this.name = name ;
	}
	public String getName(){
		return name ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj ;
		if(this.name.equals(p.getName()))
			return true ;
		else
			return false ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名："+name;
	}
}
