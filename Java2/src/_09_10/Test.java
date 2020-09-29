//package _09_10;
//
//class Person {
//	
//	private String name;
//	private int age;
//	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public void talk() {
//		System.out.println("talking");
//	}
//	
//	public void eat() {
//		System.out.println("eating");
//	}
//	
//	public void walk() {
//		System.out.println("walking");
//	}
//	
//	public void sleep() {
//		System.out.println("sleeping");
//	}
//	
//	public void showPerson() {
//		talk();
//		walk();
//		eat();
//		sleep();
//	}
//	
//	public void toStr() {
//		System.out.println("[이름] : " + name + " [나이] : " + age);
//		showPerson();
//		
//	}
//}
//
//class Student extends Person {
//	
//	private String major;
//	
//	
//	public Student(String name, int age, String major) {
//		super(name, age);
//		this.major = major;
//		
//		
//	}
//	
//	public void study() {
//		System.out.println("studying");
//	}
//	
//	public void showStudent() {
//		
//		super.showPerson();
//		study();
//	}
//	
//	@Override
//	public void toStr() {
//		System.out.println("[이름] : " + getName() + " [나이] : " + getAge() + " [전공] : " + major);
//	}
//	
//	
//	
//	
//	
//}
//
//class StudentWorker extends Student {
//	
//	private String object;
//	
//	public StudentWorker(String name, int age, String major, String object) {
//		
//		super(name, age, major);
//		this.object = object;
//	}
//	
//	public void work() {
//		System.out.println("researching");
//	}
//	
//	public void showStw() {
//		
//		super.showStudent();
//		work();
//	}
//	
//	@Override
//	public void toStr() {
//		System.out.println("[이름] : " + getName() + " [나이] : " + getAge() + " [연구분야] : " + object);
//	}
//	
//	 
//}
//
//public class Test {
//	public static void main(String[] args) {
//		
//		Person p = new Person("이순신", 25);
//		p.toStr();
//		System.out.println("----------------------------------------------------");
//		
//		Student stu = new Student("김유신", 33, "경제학과");
//		stu.toStr();
//		stu.showStudent();
//		System.out.println("----------------------------------------------------");
//		
//		StudentWorker stw = new StudentWorker("홍길동", 24, "컴퓨터공학과", "자바");
////		if(stu instanceof Student) {
////			System.out.println("Yes");
////		}
//		stw.toStr();
//		stw.showStw();
//		
//	}
//
//}
