//package java2;
//
//public class Menu {
//	
//	
//	public int id;
//	public String name;
//	public int price;
//	public int num;
//	
//	public Menu() {
//		
//	}
//	
//	
//	
//	public int getId() {
//		return id;
//	}
//
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//
//	public String getName() {
//		return name;
//	}
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//	public int getPrice() {
//		return price;
//	}
//
//
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//
//
//	public int getNum() {
//		return num;
//	}
//
//
//
//	public void setNum(int num) {
//		this.num = num;
//	}
//
//
//
//	public Menu(int id, String name, int price, int num) {
//		this.id = id;
//		this.name = name;
//		this.price = price;
//		this.num = num;
//	}
//	
//	public String toStr() {
//		
//		return "이름 : " + name + " 가격 : " + price + " 갯수 : " + num;
//	}
//	
//	public boolean avail() {
//		
//		return num > 0;
//	}
//	
//	public void sellMenu() {
//		
//		if(avail()) {
//			num--;
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//
//}
