package day7;

import java.util.Scanner;

public class day9 {
	
//	public static int sum(int valueA, int valueB) {
//		System.out.println("입력도 있고 리턴도 있음");
//		
//		sum1(3,4);
//		return valueA + valueB; // 리턴하는순간 메소드는 끝이 난 것. 그 밑에 코드는 실행시키지 않는다.
//		
//	}
//	
//	public static void sum1(int valueA, int valueB) {
//		System.out.println("입력만 있고 리턴은 없음");
//		System.out.println(valueA + valueB);
//		
//	}
//	
//	public static int sum2() {
//		
//		System.out.println("입력은 없고 리턴은 있음");
//		int valueA = 1, valueB = 2;
//		
//		return valueA + valueB;
//		
//	}
//	
//	public static void sum3() {
//		System.out.println("입력도 없고 리턴도 없음");
//		int valueA = 1, valueB = 2;
//		System.out.println(valueA + valueB);
//		
//	}
//	
//	public static String data(int a) {
//		if (a == 1) {
//			return "A";
//		} else if (a ==2) {
//			return "B";
//		} else {
//			return "NO";
//		}
//		
//	}
	
	public static boolean numberAvail(int value) {
		
		return value % 2 > 0 || !(value > 0);
	}
	
	public static void printArray(int[] array) {
		
		for (int value : array) {
			System.out.print(value + "\t");
			
		}
		
	}
	
	public static double avgArray(int[] array) {
		
		double sum = 0;
		for(int value : array) {
			sum += value;
		}
		return sum/array.length;
	}
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int dividend;
//		int divisor;
//		
//		System.out.print("나뉨수를 입력하시오");
//		dividend = scanner.nextInt();
//		System.out.print("나눗수를 입력하시오");
//		divisor = scanner.nextInt();
//		try {
//			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다!");
//		}
//		finally {
//			scanner.close();
//		}
		
		Scanner scan = new Scanner(System.in);
		final int getMax = 5;
		int getNum = 0;
		double sum = 0, avg = 0;

		int[] numArray = new int[getMax];

		System.out.println(getMax + "개 정수 값을 입력해 주세요(양수인 짝수만 가능)");

		for (int i = 0; i < numArray.length; i++) {
			System.out.print((i + 1) + " 번째 >>");
			getNum = scan.nextInt();
//			System.out.println(numberAvail(getNum));
			if (numberAvail(getNum)) { // || (or) 둘 중에 하나만 true면 true.
				System.out.println("양수인 짝수를 입력해 주세요!!");
				i--; // 되돌린것 for loop로. 처음에 i가 0인데 1로 가야되는데 감소해서 다시 0으로 시작하는것.
				continue;
			}
			numArray[i] = getNum;
		}

		System.out.println("—————————\n" 
							+ "입력이 완료 되었습니다.\n" 
							+ "—————————");
		
//		printArray(numArray);
		
		for (int value : numArray) {
			System.out.print(value + "\t");
			sum += value;
		}

//		avg = sum / numArray.length;
		
		
		System.out.println("\n총 숫자의 평균은 :" + avgArray(numArray));
		
		
//		System.out.println(sum(1,2));
//		
//		sum1(2,3);
//		
//		System.out.println(sum2());
//		
//		sum3();
//		
//		System.out.println(data(1));
		
	}
}
