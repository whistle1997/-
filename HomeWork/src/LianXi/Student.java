package LianXi;
/*1��ѧ��������(name)�ͳɼ�(score)��Ϣ���ɼ��п�Ŀ(course)�ͷ���(grade)��Ϣ��ѧ�����getResult������ʾ����ɼ���Ϣ��setData����ʵ�ֳ�ʼ��ѧ����Ϣ��
 * ��дѧ����(Student)�ͳɼ���(Score)�������ԡ� 





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
		System.out.println(name+new Score("����",score).getInfo());
		
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
		return course+"����"+grade ;
	}
}