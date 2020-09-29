package day15;

public class Student {
	
	private String name;
	private int age;
	private String major;
	
	public Student(String name, int age, String major) {
		
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	
	
	public void toStr() {
		
		System.out.println("[이름] : " + name + " [나이] : " + age + " [전공] : " + major);
	}

}
