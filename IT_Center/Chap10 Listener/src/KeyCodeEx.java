import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame 
{
	Container contentPane = getContentPane();//선생님은 c로 처리함
	private JLabel la = new JLabel();
	
	public KeyCodeEx()
	{
		setTitle("Key Code 예제: F1키: 초록색, %키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	//어댑터는 따로 있다고 보면된다. 
	class MyKeyListener extends KeyAdapter //어댑터부분 복습필요!!!
	{
		public void keyPressed(KeyEvent e)
		{
			la.setText(e.getKeyText(e.getKeyCode()));
			
			if(e.getKeyChar() == '%')
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String [] args)
	{
		new KeyCodeEx();
	}
}
