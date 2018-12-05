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
		Date d = new Date();//ͨ���޲ι��췽������date����
		System.out.println(d);//�����ǰʱ�䣬��ʽ �� �� �� ʱ���� ʱ�� ��
		Date d2 = new Date(123243543) ; //����date���󲢴�����룬����ʱ�䣬��������ʽ���ʱ��
		System.out.println(d2);
		
		//���ڸ�ʽ��
		DateFormat  df = new SimpleDateFormat() ;
		System.out.println(df.format(d));//��Ĭ�ϸ�ʽ��� 18-8-10 ����10:37
		
		DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//�Զ���ʽ���
		System.out.println(df1.format(d));//��������ʱ�����ʽ������format����������ĸ�ʽ���
	}
	@Test
	public void test2(){
		Calendar c = Calendar.getInstance();
		//��ȡ��������
		System.out.println(c);//��������ֶ������е�ֵ
		int year = c.get(Calendar.YEAR) ; //ʹ��get()������ȡĳһ�ֶε�ֵ
		int month = c.get(Calendar.MONTH) + 1; //month��0��ʼ����������ʹ��ʱҪ��һ
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"/"+month+"/"+day);
		c.add(Calendar.MONTH , 2); // MONTH�ֶμ�2
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(Calendar.YEAR); //�������Calendar���ж���ĳ���ֵ
	}
}
