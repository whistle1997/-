package LianXi2;
/*编写上衣Frock类。
包含尺寸size、颜色color、价格price等属性 构造器,对应属性的get/set方法

在Frock类中声明私有的静态属性currentNum，初始值为100000，作为衣服出厂的序列号起始值。
声明公有的静态方法getNextNum，作为生成上衣唯一序列号的方法。每调用一次，将currentNum增加100，并作为返回值。*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frock f = new Frock();
		f.setColor("黑色");
		f.setPrice(180);
		f.setSize("xxxL");
		int m = f.getNextNum();
		System.out.println("衣服尺寸为"+f.getSize()+","+f.getColor()+"售价"+f.getPrice()+",上衣唯一序列号为"+m);
	}

}
