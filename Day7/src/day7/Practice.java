package day7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Practice {
	
	
	public static ArrayList<String> food() {
		ArrayList<String> foodList = new ArrayList<>();
		
		foodList.add("햄버거");
		foodList.add("찜닭");
		foodList.add("떡볶이");
		foodList.add("냉면");
		foodList.add("국밥");
		
		return foodList;
		
	}
	
	public static void foodShowList(ArrayList<String> list) {
		
		int i = 1;
		for(String item : list) {
			System.out.println(i++ + "번 " + item);
		}
	}
	
	public static String foodChoice(ArrayList<String> list) {
	
		Random rand = new Random();
		
		return list.get(rand.nextInt(list.size()));
		
	}
		
	
	public static void menu() {
		
		System.out.println("무엇을 도와드릴까요?");
		System.out.println("[1] : 추천 메뉴");
		System.out.println("[2] : 메뉴 리스트 보기");
		System.out.println("[3] : 메뉴 추가");
		System.out.println("[4] : 메뉴 삭제");
		System.out.println("[5] : 종료");
		
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> foodList = food();
		Scanner scan = new Scanner(System.in);
		int getScan = 0;
		String getStr = "";
		
		do {
			
			menu();
			getScan = scan.nextInt();
			
			switch(getScan) {
				case 1:
					System.out.println("추천 메뉴는 " + foodChoice(foodList) + "입니다.");
					continue;
					
				case 2:
					foodShowList(foodList);
					continue;
					
				case 5:
					break;
					
				
			}
			
		} while (getScan != 5);
		
		
		
		
		
	}
	
		
		
		

}
