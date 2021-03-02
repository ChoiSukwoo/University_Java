package week14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExternnalClassEx extends JFrame {
	
	private JButton btn1 = new JButton("Action"); 
	
	public ExternnalClassEx() {
		this.setTitle("외부 클래스로 리스너 구현");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.formDesign();
		this.eventHandler();

		this.setSize(350, 150);
		this.setVisible(true);	}
	
	// 기본 디자인 함수
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn1);
	}

	// 기본 이벤트 할당 함수
	public void eventHandler() {	
		btn1.addActionListener(new MyAction());
	}
	
	public static void main(String[] args) {
		new ExternnalClassEx();
	}
	
	
	class MyAction implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText() == "Action") {
				btn.setText("액션");
			}else {
				btn.setText("Action");
			}
			setTitle(btn.getText());
//			if(e.getActionCommand() == "Action") {
//				btn.setText("액션");
//			}else {
//				btn.setText("Action");
//			}
		}
		
	}

}
