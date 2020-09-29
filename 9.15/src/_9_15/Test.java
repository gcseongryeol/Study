//package _9_15;
//
//import java.util.Random;
//
//interface A {
//	public static final int aa = 20;
//	int bb = 10;
//	int sum(int first, int second);
//}
//
//interface B extends A{
//	public int sum(int first, int second);
//	void bb();
//}
//
//interface util {
//	int id = 0;
//	String ptrUtil(String name, String address);
//	int Average(int[] data);
//	void countDown(int maxNum);
//	
//	void repeatName(int maxNum, String name);
//	
//	String[] colors = {"빨강", "파랑", "초록"};
//	void RandomColor();
//	
//	
//}
//
//class Hello implements B, util{
//	public int sum(int first, int second) {
//		return first + second;
//	}
//	
//	public void bb() {
//		System.out.println("bb 호출");
//	}
//	
//	public void repeatName(int maxNum, String name) {
//		
//		for(int i = 0; i < maxNum; i++) {
//			System.out.println(name);
//		}
//		
//	}
//	
//	
//		
//		
//
//	
//
//	@Override
//	public String ptrUtil(String name, String address) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int Average(int[] data) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void countDown(int maxNum) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public void RandomColor() {
//		
//		String[] colors = {"빨강", "파랑", "초록"};
//		Random rand = new Random();
//		System.out.println(util.colors[rand.nextInt(util.colors.length)]);
//			
//		}
//}
//
//
//
//public class Test extends Hello {
//	
//	public static void main(String[] args) {
//		Hello hel = new Hello();
//		System.out.println(hel.sum(20, 30));
//		hel.bb();
//		hel.repeatName(5, "이름");
//		hel.RandomColor();
//		
//		
//		
//	}
//
//}
