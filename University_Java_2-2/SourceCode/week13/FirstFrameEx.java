package week13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FirstFrameEx extends JFrame {
	
	//버튼 객체 생성
	private JButton btn = new JButton("OK");
	
	
	
	FirstFrameEx(){	
		//프레임 타이틀 에 값 할당
		this.setTitle("첫번째 프레임");
		//종료버튼 이벤트 할당 -> 나가기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 크기 할당
		this.setSize(300,200);
		//프레임 가시성 활성화
		this.setVisible(true);
		
		//프레임에 레이아웃 생성
		this.setLayout(new FlowLayout());
		//프레임에 버튼 객체 추가
		this.add(btn);
		//버튼객체에 클릭 리스너 추가
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()=="OK") {
					btn.setText("버튼클릭");
				}else {
					btn.setText("OK");
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		new FirstFrameEx();
	}
}
