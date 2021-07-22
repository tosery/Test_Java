import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class ButtonEx extends JFrame
{
	public ButtonEx()
	{
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2/icon-157358_60.png");
		ImageIcon rolloverIcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2/icons-1831922_60.png");
		ImageIcon pressedIcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2/flat-2126879_60.png");
	
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		setSize(250,150);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new ButtonEx();
	}

}
