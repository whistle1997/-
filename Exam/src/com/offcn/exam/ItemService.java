package com.offcn.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//实现与考试题有关的操作功能
public class ItemService {
	private ArrayList<Item> list = new ArrayList<>();
	public ItemService(String filename) {
		// TODO Auto-generated constructor stub
		readTextFile(filename);
	}
	@Test
	private List<Item> readTextFile(String filename) {
		// 该方法可读取参数指定的文本文件内容 （不使用包装），并打印输出到屏幕上。
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			FileInputStream fs = new FileInputStream(filename);
			br = new BufferedReader(new InputStreamReader(fs, "UTF-8"));
			// bw = new BufferedWriter(new FileWriter(filename));
			int i = 1;
			while (i <= 10) {
				String stem = br.readLine();
				String A = br.readLine();

				String B = br.readLine();
				String C = br.readLine();
				String D = br.readLine();
				String trueAnswer = br.readLine();
				list.add(new Item(stem, A, B, C, D, trueAnswer));
				String s = br.readLine();
				i++;
				continue;

			}
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {

				br.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return list;
	}

	public Item getItem(int no){
		return list.get(no);
	}

	public void saveAnswer(char[] answer){
		ObjectOutputStream oos = null ;
		int i = 0 ;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("E:/Exam/answer.dat"));
			oos.writeUTF("题号\t\t正确答案\t您的选择 \r\n");
			while(i < list.size()){
				oos.writeUTF((i + 1) + "\t\t" +list.get(i).getAnswer() + "\t" + answer[i] + "\r\n");
				i++ ;
			}
			oos.writeUTF("\t\t您的总分："+ExamView.score);
			
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public String showMassage(){
		String str = "1、当键入n时，显示第一道题;\r\n2、看到试题后请在A、B、C、D中进行选择\r\n3、作答选项不区分大小写\r\n4、考试中可按F结束考试\r\n";
		return str ;
	}
	
	public void getAnswer(){
		ObjectInputStream ois = null ;
		try{
			ois = new ObjectInputStream(new FileInputStream("E:/Exam/answer.dat"));
			String s = "";
			while((s = ois.readUTF()) != null){
				System.out.println(s);
			}
			System.out.println();
		}catch(IOException e){
			
		}
	}
}
