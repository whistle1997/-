package LianXi;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.setData("李华", 85);
		s.getResulta();
		System.out.println("============================================================================");
		System.out.println();
		
		Bank b = new Bank(10009, "李华", "澳大利亚", 10000, 800);
		b.Cha();
		b.Cun(1000);
		b.Qu(500);
		b.Cha();
		b.Qu(10000);
		b.Cha();
		System.out.println("============================================================================");
		System.out.println();
		
		dog d = new dog("旺财", "贼大", 180);
		d.run();
		d.jump();
		cat c = new cat("HelloKitty", "一般大", 90);
		c.run();
		c.jump();
		System.out.println("============================================================================");
		System.out.println();
		
		ChangFangXing n = new ChangFangXing();
		n.setChang(20);
		n.setKuan(15);
		System.out.println("长方形长为："+n.getChang()+"\t宽为"+n.getKuan());
		System.out.println("面积为:"+n.Mian()+"\t周长为："+n.Zhou());
		
		System.out.println("============================================================================");
		System.out.println();
		
		People p = new People();
		p.setAge(38);
		p.setId(110);
		p.setName("李华");
		p.setSex("女");
		System.out.println(p.getName()+","+p.getSex()+","+p.getAge()+"岁,身份证号"+p.getId());
		
		System.out.println("============================================================================");
		System.out.println();
		
		new Point(2 ,3).print();
	}
}
