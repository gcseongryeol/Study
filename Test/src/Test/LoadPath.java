package Test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class LoadPath {
	public static void main(String[] args) {
//		/Users/seongryeol/Downloads/coffee.png // 절대경로 가장 상위의 뿌리폴더가 기준
//		String filePath = "../TestImage/coffee.png"; // 상대경로 내 파일이 기준 ../ <-- 내 상위의 폴더를 가리킴
//		
//		File file = new File(filePath);
//		
//		Desktop desk = Desktop.getDesktop();
//		try {
//			desk.open(file);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		new LoadPath().talk();
		talk2();
		
		
		
		
	}
	
	public void talk() { // non-static type은 객체를 생성하지 않으면 사용할 수가 없다.
		
		System.out.println("출력하다");
	}
	
	public static void talk2() {
		System.out.println("출력하다2");
	}

}
