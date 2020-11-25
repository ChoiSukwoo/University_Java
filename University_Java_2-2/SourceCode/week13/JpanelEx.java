package week13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JpanelEx extends JFrame {
	

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	
	public static void main(String[] args) {
		new JpanelEx();

	}
	
	JpanelEx() {
		this.setTitle("페널 레이아웃");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(300, 200);
		this.setVisible(true);

	};

	// 기본 디자인 함수
	public void formDesign() {
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);

		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.gray);
		panel1.add(new Button("Open"));
		panel1.add(new Button("Read"));
		panel1.add(new Button("Close"));
		
		panel2.setLayout(null);
		Label label1 = new Label("Hellow");
		label1.setBounds(80,10,30,30);
		panel2.add(label1);
		
		Label label2 = new Label("Love");
		label2.setBounds(200,60,30,30);
		panel2.add(label2);
		
		Label label3 = new Label("Java");
		label3.setBounds(30,85,30,30);
		panel2.add(label3);

		

	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {	}

}
