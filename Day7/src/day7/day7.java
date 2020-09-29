package day7;

import java.util.Scanner;

public class day7 {
	
	public static void main(String[] args) {
		
//		final double PI = 3.14; // final은 변경할 수 없는 고정된 값
//		
//		double radius = 10.2;
//		double circleArea = radius * radius * PI;
//		long m = 25;
//		
//		System.out.print("반지름" + radius + ", ");
//		System.out.println("원의 면적 = " + circleArea);
//		System.out.println(m);
		
//		int i = 1;
//		System.out.println(++i); // 2
//		System.out.println(i); // 2
		
		// 1. 정수 배열 생성 (int[] Data = new int[5])
		// 2. 5개의 값을 입력 (for, while, Scanner)
		// 3. 짝수만 저장(5개) (Data[i] = getData)
		// 4. 값 리스트 출력(\t 한줄로 출력), 전체 평균
		
//		Scanner scanner = new Scanner(System.in);
//		
//		int Data[] = new int[5];
//		Int sum = 0;
//		
//		
//		for(int i=1; i<10; i++) {
//			getNum = scanner.nextInt();
//			if(i % 2 == 0)
//				Data[i] = getNum;
//			
//				
//			}
//		System.out.println(Data[i]);
//				
//				
//		}
		
//		String name = "성렬";
//		int age = 25;
//		
//		if(name.equals("성렬")&& age == 27) {
//			System.out.println("반갑습니다");
//		}
		
		
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
		
//		int i =10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		
		// 1. 정수 배열 생성 (int[] Data = new int[5])
		// 2. 5개의 값을 입력 (for, while, Scanner)
		// 3. 짝수만 저장(5개) (Data[i] = getData)
		// 4. 값 리스트 출력(\t 한줄로 출력), 전체 평균
		
		Scanner scanner = new Scanner(System.in);
		int Data[] = new int[5];
		int getData = scanner.nextInt();
		int sum = 0;
		
		for (int i = 0; i < Data.length; i++) {
			if ( getData % 2 == 0)
				Data[i] = getData;
				Data[i] = scanner.nextInt();
				sum += Data[i];
				System.out.println(Data[i] + sum);
		}
		
		
		
		
		
		
		
		

		
		
		

		
		
		
		
		
		
		
		
		
		
	}
	
}	


