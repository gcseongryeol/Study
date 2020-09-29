package _9_28;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	JLabel timerLabel; // 타이머 값이 출력되는 레이블

	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	// 스레드 코드. run()이 종료하면 스레드 종료
	public void run() {
		int n = 0; // 타이머 카운트 값
		while (true) { // 무한 루프
			timerLabel.setText(Integer.toString(n));
			n++; // 카운트 증가
			try {
				Thread.sleep(1000); // 1초동안 잠을 잔다.
				if (n >= 10) {
					timerLabel.setForeground(Color.RED);
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);

		TimerRunnable th1 = new TimerRunnable(timerLabel);
		Thread th2 = new Thread(runnable); // 스레드 객체 생성
		setSize(250, 150);
		setVisible(true);
		th2.start(); // 타이머 스레드의 실행을 시작하게 한다.
	}

	public static void main(String[] args) {
		new ThreadTimerEx();
	}

}