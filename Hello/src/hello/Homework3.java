package hello;

import java.util.Scanner;

public class Homework3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] intArray = new int[10];
		
		double sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double avg = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = in.nextInt();
			if (intArray[i] > max) {
				max = intArray[i];
			} 
			if (intArray[i] < min) {
				min = intArray[i];
			}
			
			sum += intArray[i];
			avg = sum/intArray.length;
		}
		
		System.out.println("최대값 : " + max + " 최소값 : " + min + " 평균 : " + avg);
		
		
		
	}
	
	

}
