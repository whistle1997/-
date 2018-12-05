package day06;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		//s.Study();  没有赋值，无结果。
		/*s.name = "赵树争";
		s.sex = '男';
		s.age = 22 ;
		s.maj = "软件工程";
		s.tall = 178 ;*/
		s.setNameAgeSexMajTall("赵树争",22,'男',"软件工程",178);
		
		//s.Study();
		String name = s.getName() ;
		int age = s.getAge();
		char sex = s.getSex();
		String maj = s.getMaj();
		int tall =s.getTall();
		s.getStudy();
		System.out.println(name+"这位"+sex+"同学"+age+"岁，他在学习java。"
				+ "他是"+maj+"专业的学生,身高"+tall);
	}

}
class Student{
	private String name ;
	private int age ;
	private char sex ;
	private String maj ;
	private int tall ;
	public void setNameAgeSexMajTall(String name , int age , char sex , String maj , int tall){
		this.name= name ;
		if(sex == '男'|| sex == '女')
			this.sex = sex ;
		if(age >= 0 && age < 120)
			this.age = age ;
		this.maj = maj;
		if(tall > 0 && tall < 250)
			this.tall = tall;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public char getSex(){
		return sex ;
	}
	public String getMaj(){
		return maj;
	}
	public int getTall(){
		return tall ;
	}
	private void Study(){
		System.out.println(name+"这位"+sex+"同学"+age+"岁，他在学习java。"
				+ "他是"+maj+"专业的学生,身高"+tall);
	}
	public void getStudy(){
		Study();
	}
}