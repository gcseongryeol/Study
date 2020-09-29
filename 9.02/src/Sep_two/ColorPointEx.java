//package Sep_two;
//
//class Point {
//	private int x, y;
//	void set(int x, int y) {
//		this.x = x; this.y = y;
//	}
//	void showPoint() {
//		System.out.println("(" + x + "," + y + ")");
//	}
//	
//	public Point() {
//		this.x = this.y = 0;
//	}
//	
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class ColorPoint extends Point {
//	
//	public ColorPoint() {
//		this.color = "None";
//	}
//	public ColorPoint(int x, int y, String color) {
//		super(x, y);
//		this.color = color;
//		// TODO Auto-generated constructor stub
//	}
//	private String color;
//	void setColor(String color) {
//		this.color = color;
//	}
//	void showColorPoint() {
//		System.out.print(color);
//		showPoint();
//	}
//}
//
//public class ColorPointEx {
//	public static void main(String[] args) {
//		Point p = new Point(3, 4);
//		p.set(1,  2);
//		p.showPoint();
//		
//		ColorPoint cp = new ColorPoint(5, 6, "blue");
//		cp.set(3, 4);
//		cp.setColor("red");
//		cp.showColorPoint();
//	}
//
//}
