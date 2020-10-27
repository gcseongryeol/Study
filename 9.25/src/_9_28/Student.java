package _9_28;

public class Student extends Person {
	
	private char grade;
	
	public Student(String name, char grade) {
		super(name);
		this.grade = grade;
	}
	
	
	
	public char getGrade() {
		return grade;
	}



	public void setGrade(char grade) {
		this.grade = grade;
	}



	public void Study() {
		System.out.println("공부하기");
	}

}
