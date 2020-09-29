package covid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.IOException;


import javax.swing.JFrame;
import javax.swing.JLabel;




import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class CovidGui extends JFrame {
	
	public CovidGui(String todayNum, String beforeNum, String totalNum) {
		setTitle("코로나GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.black);
		contentPane.setLayout(new BorderLayout());
		
		JLabel title_Label = new JLabel("[코로나 확진자 현황]");
		title_Label.setHorizontalAlignment(JLabel.CENTER);
		title_Label.setFont(new Font("Berlin Sans FB", Font.BOLD, 50));
		title_Label.setForeground(Color.white);
		contentPane.add(title_Label, BorderLayout.NORTH);

		
		JLabel todayNum_Label = new JLabel(todayNum);
		todayNum_Label.setHorizontalAlignment(JLabel.CENTER);
		todayNum_Label.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		todayNum_Label.setForeground(Color.red);

		contentPane.add(todayNum_Label, BorderLayout.WEST);

		
		JLabel beforeNum_Label = new JLabel(beforeNum);
		beforeNum_Label.setHorizontalAlignment(JLabel.CENTER);
		beforeNum_Label.setFont(new Font("Berlin Sans FB", Font.BOLD, 40));
		beforeNum_Label.setForeground(Color.blue);
		
		contentPane.add(beforeNum_Label, BorderLayout.EAST);
		
		JLabel totalNum_Label = new JLabel(totalNum);
		totalNum_Label.setHorizontalAlignment(JLabel.CENTER);
		totalNum_Label.setFont(new Font("Berlin Sans FB", Font.BOLD, 50));
		totalNum_Label.setForeground(Color.gray);
		
		contentPane.add(totalNum_Label, BorderLayout.SOUTH);

		setSize(500, 300);
		setVisible(true); // 화면에 프레임 출력
		
	}
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://ncov.mohw.go.kr/").get();
			Elements todayElements = doc.select(".liveNum_today_new .datalist li .data");

			Elements beforeElements = doc.select(".liveNum ul li .before");
			
			Elements numElements = doc.select(".liveNum ul li .num");

			System.out.println("[일일 확진자 현황]");
			System.out.println(todayElements.first().text());
			System.out.println(beforeElements.first().text());
			System.out.println(numElements.first().text());
			
			int number = Integer.parseInt(todayElements.first().text());
			CovidGui covid = new CovidGui(todayElements.first().text(), beforeElements.first().text(), numElements.first().text());
			
			
			
			


		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
