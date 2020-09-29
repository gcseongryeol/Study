//package java2;
//
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonParser;
//
//@SuppressWarnings("deprecation")
//public class Test {
//	
//	public static Menu[] menuArray;
//	
//	public static void main(String[] args) {
//		
//		HttpClient httpClient = new DefaultHttpClient();
//
//		HttpGet httpGet = new HttpGet("https://joon-mock-api.herokuapp.com/");
//		try {
//			HttpResponse response = httpClient.execute(httpGet);
//			if(response.getStatusLine().getStatusCode() == 200) {
//				JsonParser parser = new JsonParser();
//
//				InputStream inputStream = response.getEntity().getContent();
//				JsonElement element = parser.parse(new InputStreamReader(inputStream, "UTF-8")).getAsJsonArray();
//				System.out.println(element.toString());
//				Gson gson = new Gson();
//
//				menuArray = gson.fromJson(element, Menu[].class);
//				
//				for(Menu item : menuArray) {
//					System.out.println(item.toStr());
//				}
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		int getNum;
////		menuArray = new Menu[5];
////		menuArray[0] = new Menu("콜라", 2000, 5);
////		menuArray[1] = new Menu("환타", 1000, 10);
////		menuArray[2] = new Menu("커피", 2000, 7);
////		menuArray[3] = new Menu("사이다", 1000, 3);
////		menuArray[4] = new Menu("파워에이드", 3000, 8);
//		
//		do {
//			MainPrint();
//			getNum = scan.nextInt();
//			if ( getNum <= menuArray.length) {
//				if(menuArray[getNum-1].avail()) {
//					menuArray[getNum-1].sellMenu();
//					continue;
//				} else {
//					System.out.println("판매완료");
//				}
//			}
//			
//		} while(getNum != 9);
//	}
//	
//	public static void MainPrint() {
//		int i = 0;
//		for(Menu menuItem : menuArray) {
//			System.out.println(++i + " = " + menuItem.toStr());
//		}
//		
//		System.out.println("메뉴를 선택해주세요");
//		System.out.print(">>>");
//	}
//	
//	
//
//}
