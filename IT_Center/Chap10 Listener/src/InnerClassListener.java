import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame
{
	InnerClassListener()
	{
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	//�Ʒ��� ���
	private class MyActionListener implements ActionListener //�������̽� 
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
			{
				b.setText("�׼�");
			}
			else
				b.setText("Action");
			InnerClassListener.this.setTitle(b.getText());
		}
	}
	
	public static void main(String[] args) 
	{
		new InnerClassListener();
	}

}
