package day7;

public class Test {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("홍길동", 23, 'A');
//		st1.name = "홍길동";
//		st1.age = 23;
//		st1.grade = 'A';
		
		System.out.println(st1.toStr());
	}

}
