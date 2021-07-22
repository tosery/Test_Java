import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame
{
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2/faces-6254573_320.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
//		ImageIcon normalcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2/icon-157358_60.png");
		JLabel label = new JLabel("보고싶으면 전화하세요", SwingConstants.LEFT);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
		
		ImageIcon normalIcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2/icon-157358_60.png");
		ImageIcon rolloverIcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2/icons-1831922_60.png");
		ImageIcon pressedIcon = new ImageIcon("C:\\Users\\admin\\Desktop\\juny2/flat-2126879_60.png");
	
		JButton btn = new JButton("클릭~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new LabelEx();
	}

}
