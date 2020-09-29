package day13;

public class day13 {
	
	public static void main(String[] args) {
		
		Menu menu1 = new Menu("아메리카노", 2000, 10);
		Menu menu2 = new Menu("아이스티", 2000, 2);
		Menu menu3 = new Menu("코코아", 1000, 50);
		
		Menu menu1 = new Menu();
		
		System.out.println(menu1.menuList());
		
		menu1.sellMenu();
		
		System.out.println(menu1.menuList());
		menu1.sellMenu();
		menu1.sellMenu();
		menu1.sellMenu();
		menu1.sellMenu();
		menu1.sellMenu();
		menu1.sellMenu();
		System.out.println(menu2.menuList());
		
		menu2.sellMenu();
		menu2.sellMenu();
		menu2.sellMenu(); // 음수로 변해서 감소가 안됨
		System.out.println(menu3.menuList());
		
		if (menu1.availMenu()) {
			System.out.println(menu1.menuList() + " 판매가능");
		} else {
			System.out.println(menu1.menuList() + " 판매불가");
		}
		
		if (menu2.availMenu()) {
			System.out.println(menu2.menuList() + " 판매가능");
		} else {
			System.out.println(menu2.menuList() + " 판매불가");
		}
		
		menu2.addMenu(11);
		System.out.println(menu2.menuList());
		
		
//		Student st1 = new Student("홍길동", 23, 'A');
//		st1.name = "홍길동";
//		st1.age = 23;
//		st1.grade = 'A';
//		
//		System.out.println(st1.toStr());
		
	}

}
