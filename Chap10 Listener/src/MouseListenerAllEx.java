import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame
{
	private JLabel la = new JLabel("NO Mouse Event");
	
	public MouseListenerAllEx()
	{
		setTitle("MouseListener�� MouseMotinListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(la); //��� ���ϴ� ����
		
		setSize(300,200);
		setVisible(true);
		
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener
	{
		public void mousePressed(MouseEvent e)
		{
			la.setText("mousePressed("+e.getX()+","+e.getY()+")");
		}
		public void mouseReleased(MouseEvent e)
		{
			la.setText("mouseReleased("+e.getX()+","+e.getY()+")");
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e)
		{
			Component c = (Component)e.getSource();
			c.setBackground();
		}
	}
}
