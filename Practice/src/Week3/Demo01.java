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
		//�������������50~90[50,90)֮��������20��,��֮ת�����ַ������
		//����StringBuffer���������ɵ��ַ��������ַ���
		//������
		//���ո��ַ����и���Ӵ��ַ����в���Ӣ����ĸ���ַ��滻Ϊ�ո�
		//ȥ��������β�ո�
		//���Ӵ�����������󹹽���һ���ַ���
		//���ַ����������
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
//				(1.�õ����������
//				(2.��ʱ�䰴��xxxx-xx-xx xx:xx:xx��ʾ
//				(3.����һ���µ��������󣬿���̨����������ʱ������Ϣ
//				(4.�Ƚ��µ����������ԭ����������Ⱥ��ϵ��ǰ���󡢵ȣ�
//				(5.�õ�������������֮��ĺ����(��ֵ)
//				(6.�ٴ�����������,ͨ��setTimeInMillis(0) �Ӹ����ĳ�ֵ���ô������ĵ�ǰʱ�䡣 
//				�ø�ʽ�����,�۲����ʱ��.1970��1��1��00:00 00��00.000 
//				��չ��
//				1.���������������֮���ʱ����������������ʱ���룩
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DAY_OF_MONTH)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		Calendar c1 = Calendar.getInstance();
		Scanner in = new Scanner(System.in);
		try{
			System.out.println("����������ʱ����");
			int year = in.nextInt();
			int month = in.nextInt();
			int date = in.nextInt();
			int hourOfDay = in.nextInt();
			int minute = in.nextInt();
			int second = in.nextInt();
			c1.set(year, month, date, hourOfDay, minute, second);

		}catch(InputMismatchException e){
			System.out.println("������ȷ������");
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
			System.out.println("����������������");
		}else if(seconds2 < seconds){
			System.out.println("����������������");
		}else{
			System.out.println("ͬʱ");
		}
		long s = seconds - seconds2 ;
		System.out.println("����ʱ��" + s);
	}


	@Test
	public void test3(){
		ArrayList l = new ArrayList();
		l.add(new Person("����"));
		l.add(new Person("����"));
		l.add(new Person("����"));
		l.add(new Person("����"));
		l.add(new Person("����"));
		l.add(new Person("����"));
		l.add(new Person("����"));
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
		return "������"+name;
	}
}
