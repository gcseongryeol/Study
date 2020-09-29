package _9_17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		JButton btn2 = new JButton("Hello");
		btn2.addActionListener(new Action2());
		c.add(btn2);

//		btn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JButton b = (Jbutton) e.getSource();
//				if (b.getText().equals("Action"))
//					b.setText("액션");
//				else
//					b.setText("Action");
				// AnonymousClassListner나
				// JFrame의 멤버를 호출 가능

//				setTitle(b.getText());
//			}
//		});

		setSize(250, 120);
		setVisible(true);
	}

//	private class MyActionListener implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			JButton b = (JButton)e.getSource();
//			if(b.getText().equals("Action")) // String 타입을 비교하는 것
//				b.setText("액션");
//			else
//				b.setText("Action");
//			
//			// InnerClassListener나 JFrame의 멤버 호출 가능			
//			setTitle(b.getText()); // 프레임 타이틀에 버튼문자열 출력
//		}
	

	public static void main(String[] args) {
		new IndepClassListener();
	}

}

// 독립된 클래스로 이벤트 리스너를 작성한다.
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) // String 타입을 비교하는 것
			b.setText("액션");
		else
			b.setText("Action");
		
	}
}

class Action2 implements ActionListener {
	public void actionPerformed(ActionEvent f) {
		JButton d = (JButton)f.getSource();
		if(d.getText().equals("Hello"))
			d.setText("Bye");
		else
			d.setText("Hello");
	}
}
