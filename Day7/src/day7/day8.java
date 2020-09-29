package day7;

import java.util.Arrays;
import java.util.Scanner;

public class day8 {
	
	public static void main(String[] args) {
		
//			Scanner scan = new Scanner(System.in);
//			final int getMax = 5;
//			int getNum = 0;
//			double sum = 0, avg = 0;
//
//			int[] numArray = new int[getMax];
//
//			System.out.println(getMax + "개 정수 값을 입력해 주세요(양수인 짝수만 가능)");
//
//			for (int i = 0; i < numArray.length; i++) {
//				System.out.print((i + 1) + " 번째 >>");
//				getNum = scan.nextInt();
//				if (getNum % 2 > 0 || !(getNum > 0)) { // || (or) 둘 중에 하나만 true면 true.
//					System.out.println("양수인 짝수를 입력해 주세요!!");
//					i--; // 되돌린것 for loop로. 처음에 i가 0인데 1로 가야되는데 감소해서 다시 0으로 시작하는것.
//					continue;
//				}
//				numArray[i] = getNum;
//			}
//
//			System.out.println("—————————\n" 
//								+ "입력이 완료 되었습니다.\n" 
//								+ "—————————");
//			
//			for (int value : numArray) {
//				System.out.print(value + "\t");
//				sum += value;
//			}
//
//			avg = sum / numArray.length;
//			System.out.println("\n총 숫자의 평균은 :" + avg);
		
//		double score[][] = { {3.3, 3.4},
//				{3.5, 3.6},
//				{3.7, 4.0},
//				{4.1, 4.2} };
//		double sum = 0;
//		
//		for(int year=0; year<score.length; year++)
//			for(int term=0; term<score[year].length; term++)
//				sum += score[year][term];
//		
//		int n = score.length;
//		int m = score[0].length;
//		
//		System.out.println(Arrays.toString(score[0]));
//		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
		
		int intArray [] = new int [5];
		
		
		try {
		
			intArray[3] = 10;
			intArray[6] = 5;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
		}

	}
}


