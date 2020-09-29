//package _9_18;
//
//import java.awt.Container;
//import java.awt.event.MouseEvent;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class MouseAdapterEx extends JFrame {
//	JLabel la = new JLabel("Hello"); // "Hello" 출력용 레이블
//	
//	MouseListenerEx() {
//		setTitle("Mouse 이벤트 예제");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container c = getContentPane();
//		c.addMouseListener(new MyMouseAdapter());
//		
//		c.setLayout(null);
//		la.setSize(50, 20); // 레이블의 크기 50 x 20 설정
//		la.setLocation(30 ,30); // 레이블의 위치 (30, 30)으로 설정
//		c.add(la);
//		
//		setSize(200, 200);
//		setVisible(true);
//	}
//	
//	class MyMouseAdapter extends MouseAdapter {
//		public void mousePressed(MouseEvent e) {
//			int x = e.getX();
//			int y = e.getY();
//			la.setLocation(x, y);
//			
//		}
//	}
//	
//	public static void main(String[] args) {
//		new MouseAdapterEx();
//		
//	}
//
//}
