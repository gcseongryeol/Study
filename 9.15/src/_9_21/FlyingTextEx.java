package _9_21;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlyingTextEx extends JFrame {
	static JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");
	
	static int tempRand = 0;
	static JLabel target = new JLabel("Target");
	static Random rand = new Random();

	FlyingTextEx() {
		super("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		

		la.setLocation(50, 50);
		la.setSize(100, 20);
		contentPane.add(la);
		
		tempRand = rand.nextInt(15);
		target.setLocation(tempRand*10, tempRand*10);
		target.setSize(100, 20);
		target.setForeground(Color.red);
		
		contentPane.add(target);

		setSize(200, 200);
		setVisible(true);

		contentPane.requestFocus(); // 포커스 지정
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 입력된 키코드
			switch(keyCode) {
				case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - 10); break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY() + 10); break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - 10, la.getY()); break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX() + 10, la.getY()); break;
			}
			
			if(tempRand*10 == la.getLocation().x && tempRand*10 == la.getLocation().y ) {
				System.out.println();
				randTarge();
			}
		}
	}
	
	public static void randTarge() {
		contentPane.remove(target);
		tempRand = rand.nextInt(15);
		target.setLocation(tempRand*10, tempRand*10);
		contentPane.add(target);
		contentPane.revalidate();
		contentPane.repaint();
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
		
	}

}
