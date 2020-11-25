package week13;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrameEx1 extends JFrame implements ActionListener {

	private JButton btn = new JButton("OK");

	FirstFrameEx1() {
		this.setTitle("첫번째 프레임");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(300, 200);
		this.setVisible(true);

	};

	// 기본 디자인 함수
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn);
	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {
		btn.addActionListener(this);
	}

	public static void main(String[] args) {
		new FirstFrameEx1();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		if (e.getActionCommand() == "OK") {
			btn.setText("버튼클릭");
		} else {
			btn.setText("OK");
		}

	}
}
