import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OutListenerFrame extends JFrame 
{
	public OutListenerFrame() 
	{
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new MyActionListener()); // Action ������ �ޱ�
		
		c.add(btn);

		setSize(350, 150);
		setVisible(true);	
	}
}
