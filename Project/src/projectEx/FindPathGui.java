package projectEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FindPathGui extends JFrame {

	JTextField startField = new JTextField(15);
	JTextField endField = new JTextField(15);
	ImageIcon[] images = { new ImageIcon("images/search.png"), new ImageIcon("images/star.png") };
	ImageIcon[] changeImages = new ImageIcon[images.length];

	FindPathGui() {
		setTitle("실시간 도로상황");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		int i = 0;
		for (ImageIcon image : images) {
			Image item = (Image) image.getImage();
			changeImages[i++] = new ImageIcon(item.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
		}
		
		startField.setText("");
		endField.setText("");

		JButton search = new JButton(changeImages[0]);
		JButton star = new JButton(changeImages[1]);
		

		search.setBorderPainted(false);
		star.setBorderPainted(false);

//		search.setFocusPainted(false);
//		star.setFocusPainted(false);

		star.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new newWindow();
			}
		});

		c.add(startField);
		c.add(endField);
		c.add(search);
		c.add(star);

		setSize(500, 300);
		setVisible(true);

	}

	class newWindow extends JFrame {
		newWindow() {
			setTitle("즐겨찾기");
			Container d = getContentPane();
			d.setLayout(new FlowLayout());
			JButton addList = new JButton("등록");
			JButton showList = new JButton("목록");
			
			d.add(addList);
			d.add(showList);

			setSize(200, 80);
			setVisible(true);

		}

	}
	
	

}
