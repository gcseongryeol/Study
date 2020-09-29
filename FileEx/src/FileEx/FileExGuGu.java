package FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExGuGu {
	
	public static void main(String[] args) {
	
		File file = new File("Practice.txt");
		Scanner scan = new Scanner(System.in);
		
		try {
			FileWriter fw = new FileWriter(file);
			String getText = "";
			System.out.println("숫자 맞춰");
		
			
			while(true) {
				
				System.out.print(">>>");
				getText = scan.nextLine();
				if(getText.equals("50")) {
					break;
					
				}
				fw.append(getText+"\n");
//				fw.append(String.valueOf(1)); 숫자를 넣고 싶을 때 사용
			}
			fw.close();
			System.out.println("정답");
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File Error");
		}
		
//		try {
//			
//			FileWriter fw = new FileWriter(file);
//			int i =1;
//			int j =1;
//			while(i<10) {
//				while(j<10) {
//					
//					fw.append(j + "*" + i + "=" + i*j+"\t");
//					
//					 j++;
//				}
//				j=1;
//				fw.append("\n");
//				i++;
//				
//			}
//			fw.close();
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//			System.out.println("File Error");
//			
//		}
	}
}
