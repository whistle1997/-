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

//ʵ���뿼�����йصĲ�������
public class ItemService {
	private ArrayList<Item> list = new ArrayList<>();
	public ItemService(String filename) {
		// TODO Auto-generated constructor stub
		readTextFile(filename);
	}
	@Test
	private List<Item> readTextFile(String filename) {
		// �÷����ɶ�ȡ����ָ�����ı��ļ����� ����ʹ�ð�װ��������ӡ�������Ļ�ϡ�
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
			oos.writeUTF("���\t\t��ȷ��\t����ѡ�� \r\n");
			while(i < list.size()){
				oos.writeUTF((i + 1) + "\t\t" +list.get(i).getAnswer() + "\t" + answer[i] + "\r\n");
				i++ ;
			}
			oos.writeUTF("\t\t�����ܷ֣�"+ExamView.score);
			
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public String showMassage(){
		String str = "1��������nʱ����ʾ��һ����;\r\n2���������������A��B��C��D�н���ѡ��\r\n3������ѡ����ִ�Сд\r\n4�������пɰ�F��������\r\n";
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
