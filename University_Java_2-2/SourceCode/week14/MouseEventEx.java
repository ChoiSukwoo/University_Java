package week14;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class MouseEventEx extends JFrame{
	
	private JLabel label1 = new JLabel("라벨");
	private JPanel panel1 = new JPanel();
	
	public MouseEventEx() {
		this.setTitle("마우스 이벤트");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(300, 300);
		this.setVisible(true);	}
	
	// 기본 디자인 함수
	public void formDesign() {
		this.add(panel1,BorderLayout.CENTER);
		panel1.setLayout(null);
		panel1.add(label1);
		label1.setSize(50, 20);
		label1.setLocation(30,30);
		
	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {	
		panel1.addMouseListener(new MouseListener() {	
			@Override
			public void mouseReleased(MouseEvent e) {}		
			@Override
			public void mousePressed(MouseEvent e) {}			
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				label1.setLocation(x,y);
			}
		});
	}
	
	public static void main(String[] args) {
		new MouseEventEx();
	}


	
}
