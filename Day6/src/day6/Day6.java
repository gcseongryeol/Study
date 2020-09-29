package day6;

import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Day6 {
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		String getText="";
//		
//		int i = 0;
//		while(i < 10) {
//			System.out.print(">>>");
//			getText = scanner.nextLine();
//			if(getText.equals("exit"))
//				break;
//			i++;
//			
//			
//		}
//		
//		System.out.println("끝");
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		int intArray[];
//		intArray = new int[5];
//		int max = 0;
//		System.out.println("양수 5개를 입력하세요");
//		
//		for(int i =0; i<5; i++) {
//			intArray[i] = scanner.nextInt();
//			if(intArray[i] > max)
//				max = intArray[i];
//		}
//		System.out.println("가장 큰 수는 " + max + "입니다.");
//		
//		scanner.close();
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		int getMaxNum = 10;
//		
//		String[] stringArray = new String[getMaxNum];
//		
//		
//		String getString = "";
//		
//		for(int i=0; i < getMaxNum; i++) {
//			getString = scanner.nextLine();
//			
//			stringArray[i] = getString;
//			
//		}
//		
//		for(int i = 0; i<getMaxNum; i++) {
//			System.out.println(stringArray[i]);
//		}
//		
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("5개의 정수를 입력하세요.");
//		int intArray[] = new int[5];
//		
//		double sum =0.0;
//		for(int i=0; i<intArray.length; i++) {
//			intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장
//			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
//		}
//		
//		for (int i=0; i<intArray.length; i++)
//			
//		
//		System.out.println("평균은 " + sum/intArray.length);
//		
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요");
		int intArray[] = new int[5];
		
		for(int i=0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		for (int value: intArray) {
			System.out.println(value);
		}
		
		scanner.close();
		
		
		
		
		
		
	}
	
	
	

}
