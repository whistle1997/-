package TwoLianXi6;
/*(1)	创建 USB 接口，接口中只定义一个 work（）方法。
(2)	创建 MP3 类并实现 USB 接口。
(3)	创建优盘类并实现 USB 接口。
(4)	创建电脑类并定义一个使用接口的方法 useMobile(USB u)。
(5)	创建测试类进行测试。*/

interface USB {
	public abstract void work();
}
