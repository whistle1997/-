package LianXi;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.setData("�", 85);
		s.getResulta();
		System.out.println("============================================================================");
		System.out.println();
		
		Bank b = new Bank(10009, "�", "�Ĵ�����", 10000, 800);
		b.Cha();
		b.Cun(1000);
		b.Qu(500);
		b.Cha();
		b.Qu(10000);
		b.Cha();
		System.out.println("============================================================================");
		System.out.println();
		
		dog d = new dog("����", "����", 180);
		d.run();
		d.jump();
		cat c = new cat("HelloKitty", "һ���", 90);
		c.run();
		c.jump();
		System.out.println("============================================================================");
		System.out.println();
		
		ChangFangXing n = new ChangFangXing();
		n.setChang(20);
		n.setKuan(15);
		System.out.println("�����γ�Ϊ��"+n.getChang()+"\t��Ϊ"+n.getKuan());
		System.out.println("���Ϊ:"+n.Mian()+"\t�ܳ�Ϊ��"+n.Zhou());
		
		System.out.println("============================================================================");
		System.out.println();
		
		People p = new People();
		p.setAge(38);
		p.setId(110);
		p.setName("�");
		p.setSex("Ů");
		System.out.println(p.getName()+","+p.getSex()+","+p.getAge()+"��,���֤��"+p.getId());
		
		System.out.println("============================================================================");
		System.out.println();
		
		new Point(2 ,3).print();
	}
}
