import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame
{
	//1.�������
	private JLabel la = new JLabel("Hello"); 

	//2.������
	public MouseListenerEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseListener(la));

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}
	
	//4.�̳�Ŭ����
//	public class MyMouseListener implements MouseListener {
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			int x = e.getX();
//			int y = e.getY();
//			la.setLocation(x, y);
//			
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {}
//
//		@Override
//		public void mouseExited(MouseEvent e) {}
//		
//		@Override
//		public void mouseClicked(MouseEvent e) {}
//	}
}
