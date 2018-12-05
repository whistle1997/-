package LianXiZ18;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		c.setWheel(4);
		c.down();
		c.up();
		c.stop();
		System.out.println();
		Car c1 = new Car(4, "白", 180, 250, "开着呢", "放着呢");
		c1.down();
		c1.up();
		c1.stop();

	}

}
