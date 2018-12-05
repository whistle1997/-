package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class ZiJieLiu {
	@Test
	public void test1() {
		// �ֽ������
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E:/B.txt"); // ���û�и��ļ����򴴽�������У��򸲸�
			fos.write("llllllllllllllllll".getBytes()); // �ֽ����������Ļ����� ,
														// �����ַ���Ҫ����getBytes����תΪ�ֽ�����
			// д�벻����
			fos.write("\r\n".getBytes()); // ����
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void test2() {
		// �ֽ�������

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:/B.txt");
			// ��ȡ�����ַ�ʽ
			// �����ȡ
			// while(fis.read() != -1){
			// System.out.println((char)fis.read());
			// }

			// ͨ�������ȡ
			byte[] b = new byte[1024];
			int num = 0;
			while ((num = fis.read(b)) != -1) {
				System.out.print(new String(b, 0, num));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void test3() {
		// �и��ļ�
		// ���Ƚ��ļ����ص��ڴ�
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("E:/1.jpg");

			int len = 0;
			int i = 1;
			byte[] b = new byte[1024];
			while ((len = fis.read(b)) != -1) {
				fos = new FileOutputStream("E:/a/qiege/" + i + ".jpg");
				fos.write(b);
				i++;
				fos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void test4() {
		// �ϲ��ļ�
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream("E:/B.jpg");
			File file = new File("E:/a/qiege");
			File[] files = file.listFiles();

			for (int i = 1; i <= files.length; i++) {

				fis = new FileInputStream("E:/a/qiege/" + i + ".jpg");
				int len = 0;
				byte[] b = new byte[1024];
				while ((len = fis.read(b)) != -1) {
					fos.write(b); 

				}
				fis.close(); 

				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
