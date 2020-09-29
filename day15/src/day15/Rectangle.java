package day15;

public class Rectangle {
	
	private int width;
	
	public int getWidth() {
		return width;
	}

	private int height;
	
	public void setWH(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

	

	public int rect() {
		
		return width * height;
	}
	
	public void toStr() {
		System.out.println("사각형의 넓이는 " + rect() + " 입니다.");
	}
	
	
	

}
