package java2;

interface A {
	public static final int aa = 20;
	int bb = 10;
	int sum(int first, int second);
}

interface B {
	public int sum(int first, int second);
	void bb();
}

class Hello implements A, B{
	public int sum(int first, int second) {
		return first + second;
	}
	
	public void bb() {
		System.out.println("bb 호출");
	}
}

interface util {
	int id = 0;
	String ptrUtil(String name, String address);
	
	int Average(int[] data);
	
	void countDown(int maxNum);
	//10
}

class ptrUtil implements util{
	public String ptrUtil(String name, String address) {
		return id + " - " + name + " - " + address;
	}
	
	
	
}

public void countDown(int maxNum) {
	
	while(maxNum != -1) {
		System.out.println(maxNum--);
	}
	
	for(int i = maxNum; i>=0; --i) {
		System.out.println(i);
	}

}

public class Test extends Hello implements util{
	
	public static void main(String[] args) {
		
		ptrUtil ptr = new ptrUtil();
		System.out.println(ptr.ptrUtil("홍길동", "admin@gmail.com"));
		
		public int Average(int[] data) {
			int sum = 0;
			for(int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			
			return sum/data.length;
		}
		
		
		
		
	}

}


