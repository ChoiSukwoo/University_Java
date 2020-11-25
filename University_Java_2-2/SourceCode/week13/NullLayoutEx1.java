package week13;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutEx1 extends JFrame{

	public static void main(String[] args) {
		new NullLayoutEx1();

	}
	
	NullLayoutEx1() {
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
		
		JLabel text = new JLabel("Hellow,Press Button");
		text.setBounds(130,50,200,20);
		this.add(text);
		
		for(int i =1;i<10;i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setBounds(i*15,i*15,50,20);
			this.add(btn);
		}
		

	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {	}
}
