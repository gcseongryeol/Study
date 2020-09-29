package hello;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		year = scan.nextInt();
		if(year % 4 == 0 && year % 400 == 0) {
			System.out.println("윤년");
		} else if(year % 4 == 0 && year % 100 == 0) {
			System.out.println("평년");
		} else if(year % 4 ==0 && year % 100 !=0) {
			System.out.println("윤년");
		} else if(year % 4 != 0) {
			System.out.println("평년");
		} 
		
		
		
		
		
		
		
	}

}
