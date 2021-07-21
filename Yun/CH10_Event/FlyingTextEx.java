import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FlyingTextEx extends JFrame 
{
	//1.��� ����
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO"); 
	
	//2.������
	public FlyingTextEx() 
	{
		setTitle("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());

		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();

		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	
	//4.���� Ŭ����(=inner(=�̳�) Ŭ����)
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();

			switch(keyCode) {
				case KeyEvent.VK_UP: 
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
					break;
				case KeyEvent.VK_DOWN: 
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT); 
					break;
				case KeyEvent.VK_LEFT: 
					la.setLocation(la.getX()-FLYING_UNIT, la.getY()); 
					break;
				case KeyEvent.VK_RIGHT: 
					la.setLocation(la.getX()+FLYING_UNIT, la.getY()); 
					break;
			}
		}
	}
}
