package hello;

import java.util.Scanner;

public class ArrayAccess {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] intArray = new int[5];
		int iMax = 0;
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt();
			if (intArray[i] > iMax)
				iMax = intArray[i];
		}
		
		System.out.print("입력된 수에서 가장 큰 수는 " + iMax + "입니다.");
	}

}
