package LianXiZ12;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		c.setColor("°×");
		c.setWeight(20);
		c.setWheel(4);
		c.up();
		c.down();
		c.stop();
		System.out.println();
		Car c1 = new Car(3, "°×É«", 180);
		c1.up();
		c1.down();
		c1.stop();

	}

}
