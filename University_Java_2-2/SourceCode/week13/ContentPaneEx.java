package week13;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContentPaneEx extends JFrame {

	private JButton btn = new JButton("OK");
	private JButton cancle = new JButton("cancle");
	private JButton ignore = new JButton("ignore");
	
	private JPanel p = new JPanel();

	ContentPaneEx() {
		this.setTitle("ContentPane");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(350, 150);
		this.setVisible(true);

	};


	public static void main(String[] args) {
		new ContentPaneEx();
	}
	
	
	// 기본 디자인 함수
	public void formDesign() {
		this.add(p);
		p.setLayout(new FlowLayout());
		p.add(btn);
		p.add(cancle);
		p.add(ignore);
		p.setBackground(Color.orange);
		
//		this.setLayout(new FlowLayout());
//		this.add(btn);
//		this.add(cancle);
//		this.add(ignore);		
	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {
	}
}
