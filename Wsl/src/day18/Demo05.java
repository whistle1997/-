package day18;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

import org.junit.Test;

class MyFileNameFilte implements FileFilter{
	private String suffix;
	
	public MyFileNameFilte(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File pathname) {
		
		return pathname.isFile() && pathname.getName().endsWith(suffix);
	}
}
//��ָ��Ŀ¼����Ŀ¼�µ�ָ����չ����.java�����ļ�����·��д��һ���ļ��У��γ�һ���ļ��嵥
public class Demo05 {
		
	@Test
	public void test1(){
		File file =  new File("E:/a");
		FileOutputStream fos = null;
		String str = showFile(file);
		outPut(fos, str);
	}

	public void outPut(FileOutputStream fos, String str) {//����õ��ļ���д���ļ���
		try {
			fos = new FileOutputStream("d:\\wy.txt");
			fos.write(str.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String showFile(File file){//��ȡ�ļ���
		String str = "";
		LinkedList<File> list = new LinkedList<>();
		list.addLast(file);
		while(list.size() > 0){
			File files	= list.removeFirst();	
			File[] ff = files.listFiles();
			for(File f : ff){
				if(f.isDirectory()){
					list.addLast(f);
				}else{
					if(new MyFileNameFilte(".java").accept(f))
						str += f.getName()+ " ";							
				}
			}
		}
		return str;
	}
}
