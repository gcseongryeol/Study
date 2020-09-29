package day7;

class Circle{
	int radius; // field
	String name;
	
	public double getArea() { // method
		return 3.14*radius*radius;
	}
	
	public String cirPrint() {
		return name + "의 면적은 " + getArea();
	}
	
	
}


public class day11 {
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		double area = pizza.getArea();
		
		System.out.println(pizza.name+"의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		
		
		System.out.println(donut.cirPrint());
	
	}

}
