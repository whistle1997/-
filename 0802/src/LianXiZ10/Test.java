package LianXiZ10;

public class Test {

	public static void main(String[] args) {
		Addition a = new Addition();
		System.out.println("整形"+a.add(4,5));
		System.out.println("长整形"+a.add(4l,5l));
		System.out.println("浮点型"+a.add(4.0f,5.0f));
		System.out.println("双精度浮点型"+a.add(4.0,5.0));

	}

}
