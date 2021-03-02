package week14;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventListnerEx extends JFrame implements ActionListener{
	
	private JButton btn1 = new JButton("Action"); 

	public EventListnerEx() {
		this.setTitle("프레임 자체에서 리스너 구현");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(300, 200);
		this.setVisible(true);	}
	
	// 기본 디자인 함수
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn1);
	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {	
		btn1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new EventListnerEx();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText() == "Action") {
			btn.setText("액션");
		}else {
			btn.setText("Action");
		}		
		this.setTitle(btn.getText());
	}
}
