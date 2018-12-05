package day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class Demo03 {

	@Test
	public void test1() throws IOException{
		FileReader fr = new FileReader("src/day19/Demo03.java");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("E:/Demo3.java");
		BufferedWriter bw = new BufferedWriter(fw);
		String str = br.readLine();
		while(str != null){
			bw.write(str +"\r\n");
			//bw.newLine();
			str = br.readLine();
		}
		bw.close();
		br.close();
	}
}
