package day06;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		//s.Study();  û�и�ֵ���޽����
		/*s.name = "������";
		s.sex = '��';
		s.age = 22 ;
		s.maj = "�������";
		s.tall = 178 ;*/
		s.setNameAgeSexMajTall("������",22,'��',"�������",178);
		
		//s.Study();
		String name = s.getName() ;
		int age = s.getAge();
		char sex = s.getSex();
		String maj = s.getMaj();
		int tall =s.getTall();
		s.getStudy();
		System.out.println(name+"��λ"+sex+"ͬѧ"+age+"�꣬����ѧϰjava��"
				+ "����"+maj+"רҵ��ѧ��,���"+tall);
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
		if(sex == '��'|| sex == 'Ů')
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
		System.out.println(name+"��λ"+sex+"ͬѧ"+age+"�꣬����ѧϰjava��"
				+ "����"+maj+"רҵ��ѧ��,���"+tall);
	}
	public void getStudy(){
		Study();
	}
}