import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("NullContainer Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		
		for(int i=1; i<=9; i++)
		{
			JButton b = new JButton(Integer.toString(i));	// ��ư����
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b);		//��ư�� ����Ʈ�ѿ� ����
		}
		setSize(300,200);
		setVisible(true);
	}
}
