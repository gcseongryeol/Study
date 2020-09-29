package Sep_two;

class Person {

	private String name;
	private int age;
	private String gender;

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void talk() {
		System.out.println("말하기");
	}

	public void eat() {
		System.out.println("먹기");
	}

	public void walk() {
		System.out.println("걷기");
	}

	public void sleep() {
		System.out.println("잠자기");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void showPerson() {
		talk();
		eat();
		walk();
		sleep();
		
	}
	
	public void toStr() {
		System.out.println("[이름] : " +name+ " [나이] : " +age+ " [성별] : " + gender); 
		showPerson();
		
		
	}

}

class Student extends Person {

	public Student(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public void study() {
		super.showPerson();
		System.out.println("공부하기");
		
	}
	
	@Override
	public void toStr() {
		System.out.println();
	}
}

class StudentWorker extends Student {

	public StudentWorker(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public void work() {
		super.study();
		System.out.println("일하기");
	}
}

class Researcher extends Person {

	public Researcher(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public void research() {
		super.toStr();
		System.out.println("연구하기");
	}
}

class Professor extends Researcher {
	String major;
	public Professor(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public void teach() {
		super.research();
		System.out.println("가르치기");
	}
}

public class Heritage {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동", 24, "남자");
		System.out.println("<학생>");
		stu.study();
		
		
		StudentWorker stuW = new StudentWorker("이미영", 30, "여자");
		System.out.println("<일하는 학생>");
		stuW.work();
		
		Researcher res = new Researcher("김철수", 38, "남자");
		System.out.println("<연구원>");
		res.research();
		
		Professor pro = new Professor("최교수", 50, "남자");
		System.out.println("<교수>");
		pro.teach();
		
		
		
		

		
		

	}

}
