package week13;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class GridLayoutEx1 extends JFrame{

	private JLabel label1 = new JLabel("이름");
	private JLabel label2 = new JLabel("학년");
	private JLabel label3 = new JLabel("학과");
	private JLabel label4 = new JLabel("과목");
	private JTextArea textArea1 = new JTextArea("최석우");
	private JTextArea textArea2 = new JTextArea("17");
	private JTextArea textArea3 = new JTextArea("컴퓨터공학괴");
	private JTextArea textArea4 = new JTextArea("자바");
	
	public static void main(String[] args) {
		new GridLayoutEx1();

	}
	
	GridLayoutEx1() {
		this.setTitle("그리드 레이아웃 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(300, 200);
		this.setVisible(true);

	};

	// 기본 디자인 함수
	public void formDesign() {
		this.setLayout(new GridLayout(4,2,5,5));
		this.add(label1);
		this.add(textArea1);
		this.add(label2);
		this.add(textArea2);
		this.add(label3);
		this.add(textArea3);
		this.add(label4);
		this.add(textArea4);
		

	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {	}

}
