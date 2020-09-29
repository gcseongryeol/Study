package day15;

public class Circle {
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double cir() {
		
		return radius * radius * 3.14;
	}
	
	public void toCirString() {
		
		System.out.println("원의 넓이는 " + cir() + " 입니다.");
	}
	

}
