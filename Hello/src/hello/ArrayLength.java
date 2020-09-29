package hello;

import java.util.Scanner;

public class ArrayLength {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] intArray = new int[5];
		double dSum = 0;
		
		for(int i = 0; i < intArray.length; i++)
			intArray[i] = in.nextInt();
		
		for(int i = 0; i < intArray.length; i++)
			dSum += intArray[i];
		
		System.out.print("배열 원소의 평균은" + dSum/(intArray.length) + "입니다.");
	}

}
