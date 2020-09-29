//package _9_22;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
//
//public class CheckBoxEx extends JFrame {
//	CheckBoxEx() {
//		setTitle("체크박스 만들기 예제");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		
//		
//		
//		// 3개의 체크박스를 생성한다
//		JCheckBox apple = new JCheckBox("사과");
//		JCheckBox pear = new JCheckBox("배", true);
//		JCheckBox cherry = new JCheckBox("체리");
//		
//		MyListener listener = new MyListener();
//		
//		apple.addActionListener(new MyListener());
//		pear.addActionListener(new MyListener());
//		cherry.addActionListener(new MyListener());
//		
//		c.add(apple);
//		c.add(pear);
//		c.add(cherry);
//		
//		setSize(250, 150);
//		setVisible(true);
//		
//		
//		
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		new CheckBoxEx();
//	}
//	
//	class MyListener implements ActionListener {
//		
//		public void actionPerformed(ActionEvent e) {
//			String value ="";
//			if(apple.isSelected()) {
//				value += "사과" + "\t";
//			}
//			if(pear.isSelected()) {
//				value += "배" + "\t";
//			}
//			if(cherry.isSelected()) {
//				value += "체리" + "\t";
//			}
//			
//			System.out.println(value);
//			label.setText(value);
//		}
//	}
//
//}
