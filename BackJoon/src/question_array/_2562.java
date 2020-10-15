package question_array;

import java.util.Scanner;

public class _2562 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
//		int[] numbers = new int[9];
		int place = 0;
		int min = 0;
		for (int i = 1; i < 10; i++) {
			int number = scan.nextInt();
//			numbers[i] = number;
			
			
			if(min < number) {
				min = number;
				place = i;
				
				
			}
			
		
			
		}
		
		
		
		
		System.out.println(min);
		System.out.println(place);
		
		

	}

}
