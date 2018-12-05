package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class ZiJieLiu {
	@Test
	public void test1() {
		// 字节输出流
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E:/B.txt"); // 如果没有该文件，则创建，如果有，则覆盖
			fos.write("llllllllllllllllll".getBytes()); // 字节流传输中文会乱码 ,
														// 传输字符串要调用getBytes方法转为字节数据
			// 写入不换行
			fos.write("\r\n".getBytes()); // 换行
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
		// 字节输入流

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:/B.txt");
			// 读取的两种方式
			// 逐个读取
			// while(fis.read() != -1){
			// System.out.println((char)fis.read());
			// }

			// 通过数组读取
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
		// 切割文件
		// 首先将文件加载到内存
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
		// 合并文件
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
