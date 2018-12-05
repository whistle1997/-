package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Demo01 {
	@Test
	public void test1(){
		String str = "good good study , day day up";
		String reg = "\\b[a-zA-Z]{3}\\b";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}