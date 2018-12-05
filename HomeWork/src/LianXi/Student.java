package LianXi;
/*1、学生有姓名(name)和成绩(score)信息。成绩有科目(course)和分数(grade)信息。学生类的getResult方法显示输出成绩信息，setData方法实现初始化学生信息。
 * 编写学生类(Student)和成绩类(Score)，并测试。 





*/
class Student {
	private String name ;
	private double score ;
	public void setData(String name , double score){
		this.name = name ;
		this.score = score ;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public  void getResulta() {
		System.out.println(name+new Score("物理",score).getInfo());
		
	}

}
class Score{
	private String course ;
	private double grade ;
	public Score(String course , double grade){
		this.course = course ;
		this.grade = grade ;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getInfo(){
		return course+"考了"+grade ;
	}
}