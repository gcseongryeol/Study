//package _9_23;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class ListEx extends JFrame {
//	String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
//	ImageIcon [] images = {new ImageIcon("images/coffee.png"), new ImageIcon("images/burrito.png"), new ImageIcon("images/call.jpg")};
//	ImageIcon [] changeImages = new ImageIcon[images.length];
//	
//	ListEx() {
//		setTitle("리스트 만들기 예제");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		
//		JList strList = new JList<>(fruits);
//		c.add(strList);
//		
//		int i =0;
//		for(ImageIcon image : images) {
//			Image item = (Image)image.getImage();
//			changeImages[i++] =	new ImageIcon(item.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
//		
//		}
//		
//		JList imageList = new JList();
//		imageList.setListData(changeImages);
//		
//
//		c.add(imageList);
//		
//		JList scrollList = new JList(fruits);
//		c.add(new JScrollPane(scrollList));
//		
//		setSize(300, 300); setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		new ListEx();
//	}
//
//}
