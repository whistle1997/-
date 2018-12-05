package IO;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.FileNameMap;
import java.util.LinkedList;

import org.junit.Test;

public class FileFuXi {
	@Test
	public void test1(){
		//����File����
		File f1 = new File("E:/b");
	}
	
	@Test
	public void test2() throws IOException{
		//�����ļ�
		File f = new File("e:/z.txt");
		f.createNewFile() ; //����һ���ļ������ܴ����ļ���
		File f1 = new File("e:/a/d");
		//f1 =f1.createTempFile("temp", "temp"); //����һ����ʱ�ļ�
		
		f1.mkdir(); //�������ΪҪ�������ļ�����
	}
	
	@Test
	public void test3(){
		//�����ļ����������ļ�
		File f = new File("e:/a");
		show(f);
		System.out.println();
		show2(f);
	}
	//�ݹ鷽��
	public static void show(File f){
		File[] files = f.listFiles();
		for(File file : files){
			if(file.isDirectory()){
				show(file);
			}else
				if(new MyNameFilter(".txt").accept(file, file.getName()))
				System.out.println(file.getName());
		}
	}
	
	//����
	public static void show2(File f){
		LinkedList<File> list = new LinkedList<>();
		list.addLast(f);
		while(list.size() > 0){
			File file = list.removeFirst();
			File[] files = file.listFiles();
			for(File ff : files){
				if(ff.isDirectory()){
					list.addLast(ff);
				}else{
					if(new MyFilter(".java").accept(ff))
						System.out.println(ff.getName());
				}
					
			}
		}
	}
	
	//�ļ�������
	
}
class MyFilter implements FileFilter{
	private String suff ;
	public MyFilter(String suff) {
		// TODO Auto-generated constructor stub
		this.suff = suff ;
	}
	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.getName().endsWith(suff);
	}
	
}

class MyNameFilter implements FilenameFilter{
	String suff ;
	public MyNameFilter(String suff){
		this.suff = suff ;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return dir.getName().endsWith(suff);
	}
	
}