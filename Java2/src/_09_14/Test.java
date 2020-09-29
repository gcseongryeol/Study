package _09_14;

interface A {
	public static final int aa = 20;
	int bb = 10;
	int sum(int first, int second);
}

interface B extends A{
	public int sum(int first, int second);
	void bb();
}

class Hello implements B{
	public int sum(int first, int second) {
		return first + second;
	}
	
	public void bb() {
		System.out.println("bb 호출");
	}
}

public class Test extends Hello {
	
	public static void main(String[] args) {
		Hello hel = new Hello();
		System.out.println(hel.sum(20, 30));
		hel.bb();
	}

}
