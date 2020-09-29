package day13;

public class Student {
	
	public String name;
	public int age;
	public char grade;
	
	public Student(String inName, int inAge, char inGrade) {
		this.name = inName;
		this.age = inAge;
		this.grade = inGrade;
		
	}
	
	public String toStr() {
		return name + "는 " + age + "살이며 성적은 " + grade + "입니다.";
	}

}
