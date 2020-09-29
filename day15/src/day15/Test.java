package day15;

public class Test {
	
public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		rec.setWH(50, 40);
		
		rec.toStr();
		
		Circle pizza = new Circle();
		
		pizza.setRadius(30);
		
		pizza.toCirString();
		
		
		Student[] stList = new Student[3];
		stList[0] = new Student("홍길동", 24, "경영학과");
		
		stList[0].toStr();
		
		Student st1 = new Student("홍길동", 24, "경영학과");
		Student st2 = new Student("한석봉", 29, "국어국문학과");
		Student st3 = new Student("빌 게이츠", 30, "컴퓨터공학과");
		
		st1.toStr();
		st2.toStr();
		st3.toStr();
		
		
	
		
	}

}
