package week13;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutEx extends JFrame {
	
	private JButton btn = new JButton("OK");

	public static void main(String[] args) {
		new NullLayoutEx();

	}
	
	NullLayoutEx() {
		this.setTitle("널 레이아웃");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(300, 200);
		this.setVisible(true);

	};

	// 기본 디자인 함수
	public void formDesign() {
		this.setLayout(null);
		
		btn.setBounds(100,100,100,50);
		btn.setBackground(Color.yellow);
		btn.setForeground(Color.red);
		
		this.add(btn);

	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {	}
	
	
}
