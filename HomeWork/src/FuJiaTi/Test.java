package FuJiaTi;
/*1、定义一个表示学生信息的类Student，要求如下：
（1）类Student的成员变量：
sNO　表示学号；sName表示姓名；sSex表示性别；sAge表示年龄；sJava：表示Java课程成绩。
（2）类Student带参数的构造方法： 
在构造方法中通过形参完成对成员变量的赋值操作。
（3）类Student的方法成员：
getNo（）：获得学号； 
getName（）：获得姓名； 
getSex（）：获得性别；
getAge（）获得年龄；
getJava（）：获得Java 课程成绩
根据类Student的定义，创建五个该类的对象，输出每个学生的信息，计算并输出这五个学生Java语言成绩的平均值，以及计算并输出他们Java语言成绩的最大值和最小值。*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(01, "老大", "男", 21, 100);
		Student s2 = new Student(02, "老二", "男", 21, 95);
		Student s3 = new Student(03, "老三", "男", 20, 90);
		Student s4 = new Student(04, "老四", "男", 20, 85);
		Student s5 = new Student(05, "老五", "男", 20, 80);
		System.out.println(s1.getsName()+" 学号:"+s1.getsNO()+"\t性别:"+s1.getsSex()+"\t年龄"+s1.getsAge()+"\tjava成绩"+s1.getsJava());
		System.out.println(s2.getsName()+" 学号:"+s2.getsNO()+"\t性别:"+s2.getsSex()+"\t年龄"+s2.getsAge()+"\tjava成绩"+s2.getsJava());
		System.out.println(s3.getsName()+" 学号:"+s3.getsNO()+"\t性别:"+s3.getsSex()+"\t年龄"+s3.getsAge()+"\tjava成绩"+s3.getsJava());
		System.out.println(s4.getsName()+" 学号:"+s4.getsNO()+"\t性别:"+s4.getsSex()+"\t年龄"+s4.getsAge()+"\tjava成绩"+s4.getsJava());
		System.out.println(s5.getsName()+" 学号:"+s5.getsNO()+"\t性别:"+s5.getsSex()+"\t年龄"+s5.getsAge()+"\tjava成绩"+s5.getsJava());
		int avg = (s1.getsJava()+s2.getsJava()+s3.getsJava()+s4.getsJava()+s5.getsJava()) / 5 ;
		System.out.println("平均成绩为:"+avg);
		int[] java = new int[5];
		int min = s1.getsJava();
		if(s2.getsJava()<min)
			min = s2.getsJava();
		if(s3.getsJava() < min)
			min = s3.getsJava();
		if(s4.getsJava()<min)
			min = s4.getsJava();
		if(s5.getsJava()<min)
			min = s5.getsJava();
		System.out.println("最小值为："+min);
		int max = s1.getsJava();
		if(s2.getsJava()>max)
			max = s2.getsJava();
		if(s3.getsJava() >max)
			max = s3.getsJava();
		if(s4.getsJava()>max)
			max = s4.getsJava();
		if(s5.getsJava()>max)
			max = s5.getsJava();
		System.out.println("最大值为："+max);
	}

}
