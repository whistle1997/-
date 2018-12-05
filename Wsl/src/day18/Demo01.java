package day18;

import java.io.File;
import java.util.LinkedList;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:/a");
		WenJianDuiLie(f);
		//需求删除所有文件夹下的文件
		//deWenJian(f) ;
	}
	/*public static void deWenJian(File f){
		File[] files = f.listFiles();
		for(File file : files){
			if(file.isDirectory()){
				deWenJian(file);
			}else{
				System.out.println(file.delete()); //一共几个文件返回几个true
			}
		}
	}*/
	public static void WenJianDuiLie(File f){
		LinkedList<File> list = new LinkedList<>();
		list.addLast(f);
		while(list.size() > 0){
			File file = list.removeFirst() ;
			File[] files = file.listFiles() ;
			for(File ff : files){
				if(ff.isDirectory()){
					list.addLast(ff);
				}else
					System.out.println(ff.getName());
			}
		}
	}
}
