package day13;

public class Menu {
	
	public String name;
	public int price;
	public int num;
	
	public Menu(String inName, int inPrice, int inNum) {
		this.name = inName;
		this.price = inPrice;
		this.num = inNum;
	}
	
	public Menu() {
		this.name = "빈값";
		this.price = 200;
		System.out.println("생성자 호출");
	}
	
	public String menuList() {
		
		return name + "는 " + price + "원이고 수량은 " + num + "개 있습니다.";
		
	}
	
	public void sellMenu() {
		
		if(availMenu()) {
			num--;
		}
	}
	
	public void addMenu(int inNum) {
		num += inNum;
	}
	
	public boolean availMenu() {
		
		return num > 0;
	}
	

}
