package _9_15;

import javax.swing.*;
import java.awt.*;

//public class ContentPaneEx extends JFrame {
//	ContentPaneEx() {
//		setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀 달기
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//
//		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
//		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
//		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 
//		
//																		
////		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 150, 100));
////		contentPane.setLayout(new BorderLayout(30, 20));
//		
//		contentPane.add(new JButton("OK"), BorderLayout.CENTER); // OK 버튼 달기
//		contentPane.add(new JButton("Cancel"), BorderLayout.NORTH); // Cancel 버튼 달기
//		contentPane.add(new JButton("Ignore"), BorderLayout.SOUTH); // Ignore 버튼 달기
//		contentPane.add(new JButton("A"), BorderLayout.EAST);
//		contentPane.add(new JButton("B"), BorderLayout.WEST);
//		contentPane.add(new Checkbox("C"));
//		
//
//		setSize(300, 150); // 프레임 크기 300x150 설정
//		setVisible(true); // 화면에 프레임 출력
//	}

//public class ContentPaneEx extends JFrame {
//	public ContentPaneEx() {
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container contentPane = getContentPane();
//
//		contentPane.setLayout(null);
//
//		for (int i = 0; i < 10; i++) {
//			String text = Integer.toString(i);
//			JButton button = new JButton(text);
//			button.setSize(100, 50);
//			button.setLocation(400, 0);
//			contentPane.add(button);
//
//			setSize(500, 300);
//			setVisible(true);
//		}
//	}
//
//	public static void main(String[] args) {
//		new ContentPaneEx();
//		
//	}
//
//}
