package week13;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx  extends JFrame{

		
	private JButton btn1 = new JButton("btn1");
	private JButton btn2 = new JButton("btn2");
	private JButton btn3 = new JButton("btn3");
	private JButton btn4 = new JButton("btn4");
	private JButton btn5 = new JButton("btn5");
	
		public static void main(String[] args) {
			new FlowLayoutEx();

		}
		
		FlowLayoutEx() {
			this.setTitle("플로우 레이아웃");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

			this.formDesign();
			this.eventHandler();

			this.setSize(300, 200);
			this.setVisible(true);

		};

		// 기본 디자인 함수
		public void formDesign() {
			this.setLayout(new FlowLayout());
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			this.add(btn4);
			this.add(btn5);
		}

		// 기본 이벤트 할당 함수
		public void eventHandler() {	}
		
	
}
