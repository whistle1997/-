package TwoLianXi3;
/*训练技能点
继承和方法重写
需求说明
在工作中，我们常用的打印机有黑白打印机和彩色打印机，它们之间有很多相似的方法，能够找到继承关系。现在要求使用继承来实现这个生活案例。
实现步骤
(1)	编写父类 Printer（打印机），定义一个方法 print()。
(2)	编写子类 BlackPrinter（黑白打印机），重写 print()方法。
(3)	编写子类 ColorPrinter（彩色打印机），重写 print()方法。*/

abstract class Printer {
	abstract void print();
}
