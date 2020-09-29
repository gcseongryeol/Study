//package assignment;
//
//import java.awt.Rectangle;
//
//public class Assignment4 {
//
//	private int x1;
//	private int x2;
//	private int y1;
//	private int y2;
//
//	Assignment4(int x1, int y1, int x2, int y2) {
//		this.x1 = x1;
//		this.y1 = y1;
//		this.x2 = x2;
//		this.y2 = y2;
//	}
//
//	Assignment4() {
//		
//		this(0,0,0,0);
//	}
//
//	void set(int x1, int y1, int x2, int y2) {
//		this.x1 = x1;
//		this.y1 = y1;
//		this.x2 = x2;
//		this.y2 = y2;
//	}
//
//	int square() {
//		return Math.abs((x1 - x2) * (y1 - y2));
//	}
//
//	void show() {
//		System.out.printf("x1 : %d, y1 : %d, x2 : %d, y2 : %d \n", x1, y1, x2, y2);
//		System.out.println("넓이 : " + square());
//	}
//
//	boolean equals(Rectangle r) {
//		if (Math.abs(this.x1 - this.x2) == Math.abs(r.x1 - r.x2)
//				&& Math.abs(this.y1 - this.y2) == Math.abs(r.y1 - r.y2))
//			return true;
//		return false;
//	}
//
//	
//	public static void main(String[] args) {
//		Rectangle r = new Rectangle();
//		Rectangle s = new Rectangle(1,1,2,3);
//		
//		((Assignment4) r).show();
//		((Assignment4) s).show();
//		System.out.println(((Assignment4) s).square());
//		r.set(=2,2,-1,4)
//		((Assignment4) r).show();
//		System.out.println(((Assignment4) r).square());
//		if(r.equals(s)) 
//			System.out.println("두 사각형은 같습니다.");
//	}
//
//}
