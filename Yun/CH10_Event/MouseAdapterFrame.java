import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterFrame extends JFrame 
{
	private JLabel la = new JLabel("Hello"); 

	public MouseAdapterFrame() 
	{
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseAdapter(la)); 

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}	

}
