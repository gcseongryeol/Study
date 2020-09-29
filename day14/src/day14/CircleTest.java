package day14;

class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toStr() {
		
		return "값은 " + (int)getArea() + " 입니다.";
	}

}

public class CircleTest {
	public static void main(String[] args) {
//		Circle [] c;
//		c = new Circle[5];
//		
//		for(int i=0; i < c.length; i++) {
//			
//			c[i] = new Circle(i);
//		}
//		
//		c[0].setRadius(50);
//		
//		//Circle cir = new Circle();
//		for(Circle cir : c) {
//			cir.setRadius(50);
//			
//			System.out.println((cir.toStr()));
//		}
			
			System.out.println(Sum(2,3));
			System.out.println(Sum(2,3,4));
			System.out.println(Sum(2,3,4,5));
			
			
			
	
		
		
		
		
	}

		public static int Sum(int a, int b) {
			return a+b;
		}
		public static int Sum(int a, int b, int c) {
			return a+b+c;
		}
		public static int Sum(int a, int b, int c, int d) {
			return a+b+c+d;
		}

}
