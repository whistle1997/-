


package day18;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:/a") ;
		File[] files = f.listFiles(new FileFiller());
		for(File file : files)
			System.out.println(file);
	
		File[] ff = f.listFiles(new FileFiller2());
		for(File f1 : ff)
			System.out.println(f1);
		
		
		String[] fff = f.list(new FileFiller());
		for(String ffff : fff)
			System.out.println(ffff);
	}

}
class FileFiller implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".txt");
	}
	
}
class FileFiller2 implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.getName().endsWith(".txt");
	}
	
}