//package _9_24;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.*;
//
//public class MenuEx extends JFrame {
//	MenuEx() {
//		setTitle("Menu 만들기 예제");
//		createMenu(); // 메뉴 생성, 프레임에 삽입
//		setSize(300, 200);
//		setVisible(true);
//
//	}
//
//	void createMenu() {
//		JMenuBar mb = new JMenuBar();
//		JMenu screenMenu = new JMenu("Screen");
//		JMenuItem exit = new JMenuItem("Exit");
//
//		screenMenu.add(new JMenuItem("Load"));
//		screenMenu.add(new JMenuItem("Hide"));
//		screenMenu.add(new JMenuItem("ReShow"));
//		screenMenu.addSeparator();
//		screenMenu.add(exit);
//
//		mb.add(screenMenu);
//		mb.add(new JMenu("Edit"));
//		mb.add(new JMenu("Source"));
//		mb.add(new JMenu("Project"));
//		mb.add(new JMenu("Run"));
//		setJMenuBar(mb);
//
//		MyListener listener = new MyListener();
//		exit.addActionListener(listener);
//	}
//
//	class MyListener implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			System.exit(0);
//
//		}
//
//	}
//
//	public static void main(String[] args) {
//		new MenuEx();
//	}
//
//}
