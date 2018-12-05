package Coll;

public class Person implements Comparable{
	private String name ;
	private int age ;
	public Person(){}
	public Person(String name , int age){
		this.name = name ;
		this.age = age ;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "–’√˚£∫"+name + " "+"ƒÍ¡‰£∫" + age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Person){
			Person p = (Person)o ;
			int n = this.age - p.getAge() ;
			if(n == 0){
				return this.name.compareTo(p.getName()) ;
			}else
				return n ;
			
		}
		throw new ClassCastException();
	}
	
	 
}
