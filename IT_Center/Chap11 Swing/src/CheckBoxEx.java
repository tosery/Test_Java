import javax.swing.*;
import java.awt.*;
public class CheckBoxEx extends JFrame
{
	public CheckBoxEx()
	{
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2\\ch11_images\\ch11_images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2\\ch11_images\\ch11_images/selectedCherry.jpg");
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CheckBoxEx();
	}

}
