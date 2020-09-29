//package homework;
//
//import java.util.Scanner;
//
//public class Test {
//	
//public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		Coke pepsi = new Coke("펩시", 2000, 10);
//		
//		Coke[] menu = new Coke[5];
//		menu[0] = new Coke("커피", 2000, 5);
//		menu[1] = new Coke("물", 1000, 2);
//		menu[2] = new Coke("파워에이드", 1500, 7);
//		menu[3] = new Coke("사이다", 1000, 5);
//		menu[4] = new Coke("몬스터", 2000, 10);
//		
//		for(int i =0; i < menu.length; i++) {
//			System.out.println(menu[i].CokeList());
//		}
//		
//		System.out.println("--------------------------------");
//				
//		
//		for(Coke item : menu) {
//			System.out.println(item.CokeList());
//		}
//		
//		System.out.println("[콜라 자판기]");
//		System.out.println("1. 구입하기");
//		System.out.println("2. 채우기");
//		
//		
//		
//		
//		
//		
//		
//		int getNum = 0;
//		int count;
//		while (getNum < 3 ) {
//			System.out.println(">>>");
//			getNum = scan.nextInt();
//			if (getNum == 1) {
//				pepsi.sellCoke();
//				menu[0].sellCoke();
//				System.out.println(menu[0].CokeList());
//				System.out.println(pepsi.CokeList());
//				System.out.println("[콜라 자판기]");
//				System.out.println("1. 구입하기");
//				System.out.println("2. 채우기");
//				
//			}
//			
//			
//			if (getNum == 2) {
//				System.out.println("몇 개를 채우시겠습니까?");
//				count = scan.nextInt();
//				pepsi.addCoke(count);
//				System.out.println(pepsi.CokeList());
//				System.out.println("[콜라 자판기]");
//				System.out.println("1. 구입하기");
//				System.out.println("2. 채우기");
//			} 
//			
//				
//			
//				
//			
//			
//			
//			
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
