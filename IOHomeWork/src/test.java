import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

public class test {

	public static void main(String[] args) {

		File file = new File("E:/a");
		System.out.println(showAll(file));
		FileOutputStream fos = null ;
		try{
			fos = new FileOutputStream("E:/HomeWork.txt"); //目标文件
			fos.write(showAll(file).getBytes());
		}catch(IOException e){
			System.out.println("IO异常");
			e.printStackTrace();
		}finally{ 
			try{
				fos.close();
			}catch(IOException e){
				System.out.println("IO异常");
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println(showAll(file));
	}
	public static String showAll(File f){
		String str = "" ; // 存储所得文件名
		LinkedList<File> list = new LinkedList<>();  //建立具有队列特征的集合，存储文件夹（先进先出原则）
		list.addLast(f); //将文件夹元素添加至集合最后
		while(list.size() > 0){ //当集合有元素时，继续遍历文件夹元素下的文件
			File file = list.removeFirst() ; //remove方法删除元素，并返回File对象，可以对其进行操作
			File[] files = file.listFiles() ;//将获取到的File对象下的元素写入集合，使用集合进行操作
			for(File ff : files){
				if(ff.isDirectory())
					list.addLast(ff); //如果元素是文件夹，则继续添加至列表末尾，等待下一次遍历取元素
				else{
					/*if(new MyFileFilter().accept(ff)){
						System.out.println(ff);
					}*/
					if(ff.getName().endsWith(".java")){  //如果是一个文件，那么 就比较这个文件的拓展名是否为.java
						str += ff.getAbsolutePath() + "\r\n" ; //是.java文件则加入str字符串保存
					}
				}
			}
		}
		return str;
	}
	
	
	public static String ShowAll2(File f){
		String str = "";
		File[] files = f.listFiles() ;
		for(File file : files){
			if(file.isDirectory()){
				str += ShowAll2(file);
			}else{
				if(file.getName().endsWith(".java")){
					str += file.getAbsolutePath() + "\r\n" ;
				}
			}
		}
		return str ;
	}
}

/*class MyFileFilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.getName().endsWith(".java");
	}

	
	
}*/
	