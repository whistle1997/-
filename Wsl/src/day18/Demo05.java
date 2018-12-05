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
//将指定目录和子目录下的指定扩展名（.java）的文件所在路径写到一个文件中，形成一个文件清单
public class Demo05 {
		
	@Test
	public void test1(){
		File file =  new File("E:/a");
		FileOutputStream fos = null;
		String str = showFile(file);
		outPut(fos, str);
	}

	public void outPut(FileOutputStream fos, String str) {//将获得的文件名写入文件中
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
	
	public static String showFile(File file){//获取文件名
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
