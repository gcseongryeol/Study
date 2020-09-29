//package covid;
//
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.GridLayout;
//import java.io.IOException;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//public class NaverRank extends JFrame {
//	public NaverRank(Elements rankElements) {
//		setTitle("NaverRank");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		Container container = getContentPane();
//		container.setBackground(Color.white);
//		container.setLayout(new GridLayout(5, 4, 0, 0));
//		
//		for(Element item : rankElements) {
//			System.out.println(item.text());
//			JLabel label = new JLabel(item.text());
//			container.add(label);
//		}
//		
//		setSize(300, 500);
//		setVisible(true);
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		try {
//			Document doc = Jsoup.connect("https://datalab.naver.com/keyword/realtimeList.naver?where=main").get();
//			Elements rankElements = doc.select(".ranking_item");
//
//			new NaverRank(rankElements);
//			
//			for(Element item : rankElements) {
//				System.out.println(item.text());
//			}
//			
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
