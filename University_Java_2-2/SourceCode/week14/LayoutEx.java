package week14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutEx extends JFrame{

	private JButton p1_btn1 = new JButton("OK");
	private JButton p1_btn2 = new JButton("CANCLE");
	private JButton p4_btn1 = new JButton("btn_1");
	private JButton p4_btn2 = new JButton("btn_2");
	private JButton p4_btn3 = new JButton("btn_3");
	
	
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();

			
	private JLabel p2_label1 = new JLabel("Text1");
	private JLabel p3_label1 = new JLabel("Text2");
	private JLabel p3_label2 = new JLabel("Text3");
	 
	public LayoutEx() {
		this.setTitle("Layout예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(300, 200);
		this.setVisible(true);	
	}
	
	// 기본 디자인 함수
	public void formDesign() {
		this.setLayout(new BorderLayout());
		this.add(panel1,BorderLayout.NORTH);
		panel1.setLayout(new FlowLayout());
		panel1.add(p1_btn1);
		panel1.add(p1_btn2);

		
		this.add(panel2,BorderLayout.SOUTH);
		panel2.setLayout(new GridLayout(1,2));
		panel2.add(p2_label1);
		panel2.add(panel3);
		
		panel3.setLayout(new GridLayout(2,1));
		panel3.add(p3_label1);
		panel3.add(p3_label2);
		
		p3_label1.setOpaque(true);
		p3_label1.setBackground(Color.yellow);
		
		
		this.add(panel4,BorderLayout.CENTER);
		panel4.setLayout(new GridLayout(2,2));
		panel4.add(p4_btn1);
		panel4.add(p4_btn2);
		panel4.add(p4_btn3);
		
		
	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {	}
	
	public static void main(String[] args) {
		new LayoutEx();
	}
}
