//package _09_11;
//
//abstract class Shape {
//	public void print() {
//		System.out.println("---");
//	}
//	abstract public void draw();
//}
//
//class Line extends Shape {
//	public void draw() {
//		System.out.println("Line");
//		print();
//	}
//}
//
//class Rect extends Shape {
//	public void draw() {
//		System.out.println("Rect");
//	}
//}
//
//class Circle extends Shape {
//
//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//public class MethodOverridingEx {
//	static void paint(Shape p) { // Shape를 상속받은 객체들이 매개 변수로 넘어올 수 있음
//		p.draw(); // p가 가리키는 객체에 오버라이딩된 draw() 호출. 동적바인딩
//	}
//	
//	public static void main(String[] args) {
//		Line line = new Line();
//		paint(line); // Line의 draw() 실행. "Line" 출력
////		Shape.print();
//		
////		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
//		paint(new Circle());
//	}
//
//}
