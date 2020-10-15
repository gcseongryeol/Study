package question_while;

import java.util.Scanner;

public class _1110 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int a = num;
		int b;
		int cycle = 0;
		
		if(num == 0) {
			System.out.print(1);
		} else {
			do {
				b = (a % 10) * 10 + ((a / 10) + (a % 10)) % 10;
				a= b;
				cycle++;
			} while(b != num);
			System.out.println(cycle);
		}
		
	
		
		
	}

}
