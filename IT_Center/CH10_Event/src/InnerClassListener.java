import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
	InnerClassListener() {
		setTitle("Action이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());	//action 리스너 달기
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
}
