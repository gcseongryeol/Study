//package _9_23;
//
//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.*;
//
//public class ComboActionEx extends JFrame {
//	
//	String [] fruits = {"apple", "banana", "mango", "cherry"};
//	ImageIcon [] images = {new ImageIcon("images/burrito.png"), new ImageIcon("images/call.jpg"), new ImageIcon("images/coffee.png"), 
//			new ImageIcon("images/test.jpg")};
//		
//	JLabel imgLabel = new JLabel(images[0]);
//	ImageIcon[] changeImages = new ImageIcon[images.length];
//	
//	ComboActionEx() {
//		setTitle("콤보박스 활용 예제");
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JComboBox combo = new JComboBox(fruits);
//		c.add(combo); c.add(imgLabel);
//		
//		int i =0;
//		for(ImageIcon image : images) {
//			Image item = (Image)image.getImage();
//			changeImages[i++] =	new ImageIcon(item.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
//		
//		}
//		
//		
//		
//		
//		
//		MyListener listener = new MyListener();
//		combo.addActionListener(listener);
//		
//		// 콤보박스에 Action 리스너 등록. 선택된 아이템의 이미지 출력
////		combo.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				JComboBox cb = (JComboBox)e.getSource();
////				int index = cb.getSelectedIndex();
////				imgLabel.setIcon(images[index]);
////			}
////		});
//		
//		setSize(300, 250);
//		setVisible(true);
//	}
//	
//	class MyListener implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			JComboBox cb = (JComboBox)e.getSource();
//			int index = cb.getSelectedIndex();
//			imgLabel.setIcon(changeImages[index]);
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		new ComboActionEx();
//	}
//
//}
