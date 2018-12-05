package TwoLianXi4;
/*训练技能点
多态
需求说明
现在模拟工人使用打印机打印书籍，考虑到程序的可扩展性，要求使用多态 。
在上一题（第3题）的基础上我们需要再创建一个 Employee 类。
实现步骤
(1)	编写 Employee 类，在类中实现一个 makeBook(Printer p)方法来模拟使用打印机打印书籍，参数类型是父类 Printer。
(2)	编写测试类，分别调用makeBook方法，实现黑白、彩色打印机打印。*/

abstract class Printer {
	abstract void print();
}
