package day15;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.DataFormatException;

import org.junit.Test;

public class Time {
	@Test
	public void test1(){
		Date d = new Date();//通过无参构造方法创建date对象
		System.out.println(d);//输出当前时间，格式 周 月 日 时分秒 时区 年
		Date d2 = new Date(123243543) ; //创建date对象并传入毫秒，计算时间，按上述格式输出时间
		System.out.println(d2);
		
		//日期格式化
		DateFormat  df = new SimpleDateFormat() ;
		System.out.println(df.format(d));//按默认格式输出 18-8-10 上午10:37
		
		DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//自定格式输出
		System.out.println(df1.format(d));//创建对象时定义格式，调用format方法按定义的格式输出
	}
	@Test
	public void test2(){
		Calendar c = Calendar.getInstance();
		//获取日历对象
		System.out.println(c);//输出日历字段中所有的值
		int year = c.get(Calendar.YEAR) ; //使用get()方法获取某一字段的值
		int month = c.get(Calendar.MONTH) + 1; //month从0开始计数，所以使用时要加一
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"/"+month+"/"+day);
		c.add(Calendar.MONTH , 2); // MONTH字段加2
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(Calendar.YEAR); //输出的是Calendar类中定义的常量值
	}
}
