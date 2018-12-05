package TwoLianXi7;
/*据新闻媒体报道，成都某律师投入上千万元制造了一种海陆空三栖航行的交通工具。现在要求通过接口实现这个案例。
实现步骤
(1)	创建汽车接口 Motor，定义一个 run（）方法
(2)	创建轮船接口 Steamer，定义一个 sailing（）方法。
(3)	创建飞机接口 Plane，定义一个 fly（）方法。
(4)	创建类 SuperVehicle 实现上述三个接口。
(5)	创建测试类进行测试。*/

interface Motor {
	public static final int MOTOR_PRICE = 500000;
	abstract String run();
}
