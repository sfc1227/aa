package day3.exam.win;

import javax.swing.JFrame;

// Has-A 포함, 합성관계
public class MyWin2 {

	JFrame frame = new JFrame();

	public MyWin2() {
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setTitle("상속 회피로 만듬");
	}
}
