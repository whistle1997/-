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
			fos = new FileOutputStream("E:/HomeWork.txt"); //Ŀ���ļ�
			fos.write(showAll(file).getBytes());
		}catch(IOException e){
			System.out.println("IO�쳣");
			e.printStackTrace();
		}finally{ 
			try{
				fos.close();
			}catch(IOException e){
				System.out.println("IO�쳣");
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println(showAll(file));
	}
	public static String showAll(File f){
		String str = "" ; // �洢�����ļ���
		LinkedList<File> list = new LinkedList<>();  //�������ж��������ļ��ϣ��洢�ļ��У��Ƚ��ȳ�ԭ��
		list.addLast(f); //���ļ���Ԫ��������������
		while(list.size() > 0){ //��������Ԫ��ʱ�����������ļ���Ԫ���µ��ļ�
			File file = list.removeFirst() ; //remove����ɾ��Ԫ�أ�������File���󣬿��Զ�����в���
			File[] files = file.listFiles() ;//����ȡ����File�����µ�Ԫ��д�뼯�ϣ�ʹ�ü��Ͻ��в���
			for(File ff : files){
				if(ff.isDirectory())
					list.addLast(ff); //���Ԫ�����ļ��У������������б�ĩβ���ȴ���һ�α���ȡԪ��
				else{
					/*if(new MyFileFilter().accept(ff)){
						System.out.println(ff);
					}*/
					if(ff.getName().endsWith(".java")){  //�����һ���ļ�����ô �ͱȽ�����ļ�����չ���Ƿ�Ϊ.java
						str += ff.getAbsolutePath() + "\r\n" ; //��.java�ļ������str�ַ�������
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
	