package day18;

import java.io.File;
import java.util.LinkedList;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:/a");
		WenJianDuiLie(f);
		//����ɾ�������ļ����µ��ļ�
		//deWenJian(f) ;
	}
	/*public static void deWenJian(File f){
		File[] files = f.listFiles();
		for(File file : files){
			if(file.isDirectory()){
				deWenJian(file);
			}else{
				System.out.println(file.delete()); //һ�������ļ����ؼ���true
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
