//package _9_24;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class GraphicsDrawImageEx2 extends JFrame {
//	GraphicsDrawImageEx2() {
//		setTitle("패널의 크기에 맞추어 이미지 그리기");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setContentPane(new MyPanel());
//		
//		setSize(200, 300);
//		setVisible(true);
//	}
//	
//	class MyPanel extends Panel {
//		ImageIcon icon = new ImageIcon("images/test.jpg");
//		Image img = icon.getImage();
//		
//		public void paintComponent(Graphics g) {
//			super.paintComponents(g);
//			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
//		}
//	}
//	
//	public static void main(String[] args) {
//		new GraphicsDrawImageEx2();
//	}
//
//}
