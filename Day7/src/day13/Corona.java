package day13;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Corona {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://ncov.mohw.go.kr/").get();
			Elements elements = doc.select(".liveNum_today_new .datalist li .data");
			System.out.println("[일일 확진자 현황]");
			System.out.println(elements.first().text());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
